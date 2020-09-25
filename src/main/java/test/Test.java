package test;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import test.variations.Lombok;
import test.variations.Reflective;
import test.variations.Standard;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SuppressWarnings("UseBulkOperation")
public class Test {

    @State(Scope.Thread)
    public static class TestState {
        private final List<Standard> standardList = IntStream.range(0, 1000)
                .mapToObj(i -> new Standard(List.of(i), String.valueOf(i))).collect(Collectors.toList());
        private final List<Reflective> reflectiveList = IntStream.range(0, 1000)
                .mapToObj(i -> new Reflective(List.of(i), String.valueOf(i))).collect(Collectors.toList());
        private final List<Lombok> lombokList = IntStream.range(0, 1000)
                .mapToObj(i -> new Lombok(List.of(i), String.valueOf(i))).collect(Collectors.toList());
        private final Set<Standard> standardSet = new HashSet<>();
        private final Set<Reflective> reflectiveSet = new HashSet<>();
        private final Set<Lombok> lombokSet = new HashSet<>();
    }


    @Benchmark
    @BenchmarkMode({Mode.Throughput})
    public void standardEquals(TestState testState) {
        testState.standardList.forEach(testState.standardSet::add);
    }

    @Benchmark
    @BenchmarkMode({Mode.Throughput})
    public void reflectiveEquals(TestState testState) {
        testState.reflectiveList.forEach(testState.reflectiveSet::add);
    }

    @Benchmark
    @BenchmarkMode({Mode.Throughput})
    public void lombokEquals(TestState testState) {
        testState.lombokList.forEach(testState.lombokSet::add);
    }


    @Benchmark
    @BenchmarkMode({Mode.Throughput})
    public void standardString(TestState testState, Blackhole blackhole) {
        testState.standardList.forEach(s -> blackhole.consume(s.toString()));
    }

    @Benchmark
    @BenchmarkMode({Mode.Throughput})
    public void reflectiveString(TestState testState, Blackhole blackhole) {
        testState.reflectiveList.forEach(s -> blackhole.consume(s.toString()));
    }

    @Benchmark
    @BenchmarkMode({Mode.Throughput})
    public void lombokString(TestState testState, Blackhole blackhole) {
        testState.lombokList.forEach(s -> blackhole.consume(s.toString()));
    }

    public static void main(String[] args) throws RunnerException {
        Options build = new OptionsBuilder()
                .include(Test.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(build).run();
    }
}

