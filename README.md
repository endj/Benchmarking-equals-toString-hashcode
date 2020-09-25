# Benchmark
Compares toString, equals and hascode for 3 variations.
```
# JMH version: 1.25.2
# VM version: JDK 11.0.5, OpenJDK 64-Bit Server VM, 11.0.5+10
# VM invoker: /home/ed/.sdkman/candidates/java/11.0.5.hs-adpt/bin/java
# VM options: -javaagent:/home/ed/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.6397.94/lib/idea_rt.jar=33691:/home/ed/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.6397.94/bin -Dfile.encoding=UTF-8
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: test.Test.lombokEquals

# Run progress: 0.00% complete, ETA 00:10:00
# Fork: 1 of 1
# Warmup Iteration   1: 76627.492 ops/s
# Warmup Iteration   2: 78653.203 ops/s
# Warmup Iteration   3: 69263.442 ops/s
# Warmup Iteration   4: 69203.674 ops/s
# Warmup Iteration   5: 69174.676 ops/s
Iteration   1: 69205.733 ops/s
Iteration   2: 69212.800 ops/s
Iteration   3: 69186.913 ops/s
Iteration   4: 69258.389 ops/s
Iteration   5: 69198.584 ops/s


Result "test.Test.lombokEquals":
  69212.484 ±(99.9%) 105.455 ops/s [Average]
  (min, avg, max) = (69186.913, 69212.484, 69258.389), stdev = 27.386
  CI (99.9%): [69107.029, 69317.939] (assumes normal distribution)


# JMH version: 1.25.2
# VM version: JDK 11.0.5, OpenJDK 64-Bit Server VM, 11.0.5+10
# VM invoker: /home/ed/.sdkman/candidates/java/11.0.5.hs-adpt/bin/java
# VM options: -javaagent:/home/ed/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.6397.94/lib/idea_rt.jar=33691:/home/ed/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.6397.94/bin -Dfile.encoding=UTF-8
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: test.Test.lombokString

# Run progress: 16.67% complete, ETA 00:08:23
# Fork: 1 of 1
# Warmup Iteration   1: 19026.713 ops/s
# Warmup Iteration   2: 19058.264 ops/s
# Warmup Iteration   3: 18747.214 ops/s
# Warmup Iteration   4: 18929.702 ops/s
# Warmup Iteration   5: 18994.519 ops/s
Iteration   1: 19029.184 ops/s
Iteration   2: 18993.926 ops/s
Iteration   3: 19071.087 ops/s
Iteration   4: 18859.698 ops/s
Iteration   5: 18950.119 ops/s


Result "test.Test.lombokString":
  18980.803 ±(99.9%) 312.069 ops/s [Average]
  (min, avg, max) = (18859.698, 18980.803, 19071.087), stdev = 81.043
  CI (99.9%): [18668.734, 19292.872] (assumes normal distribution)


# JMH version: 1.25.2
# VM version: JDK 11.0.5, OpenJDK 64-Bit Server VM, 11.0.5+10
# VM invoker: /home/ed/.sdkman/candidates/java/11.0.5.hs-adpt/bin/java
# VM options: -javaagent:/home/ed/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.6397.94/lib/idea_rt.jar=33691:/home/ed/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.6397.94/bin -Dfile.encoding=UTF-8
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: test.Test.reflectiveEquals

# Run progress: 33.33% complete, ETA 00:06:42
# Fork: 1 of 1
# Warmup Iteration   1: 3356.481 ops/s
# Warmup Iteration   2: 3423.245 ops/s
# Warmup Iteration   3: 3430.481 ops/s
# Warmup Iteration   4: 3466.310 ops/s
# Warmup Iteration   5: 3429.752 ops/s
Iteration   1: 3422.081 ops/s
Iteration   2: 3421.929 ops/s
Iteration   3: 3409.186 ops/s
Iteration   4: 3418.028 ops/s
Iteration   5: 3406.465 ops/s


Result "test.Test.reflectiveEquals":
  3415.538 ±(99.9%) 28.067 ops/s [Average]
  (min, avg, max) = (3406.465, 3415.538, 3422.081), stdev = 7.289
  CI (99.9%): [3387.471, 3443.604] (assumes normal distribution)


# JMH version: 1.25.2
# VM version: JDK 11.0.5, OpenJDK 64-Bit Server VM, 11.0.5+10
# VM invoker: /home/ed/.sdkman/candidates/java/11.0.5.hs-adpt/bin/java
# VM options: -javaagent:/home/ed/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.6397.94/lib/idea_rt.jar=33691:/home/ed/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.6397.94/bin -Dfile.encoding=UTF-8
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: test.Test.reflectiveString

# Run progress: 50.00% complete, ETA 00:05:01
# Fork: 1 of 1
# Warmup Iteration   1: 603.784 ops/s
# Warmup Iteration   2: 630.142 ops/s
# Warmup Iteration   3: 633.600 ops/s
# Warmup Iteration   4: 631.829 ops/s
# Warmup Iteration   5: 629.530 ops/s
Iteration   1: 635.686 ops/s
Iteration   2: 634.846 ops/s
Iteration   3: 634.597 ops/s
Iteration   4: 632.944 ops/s
Iteration   5: 634.438 ops/s


Result "test.Test.reflectiveString":
  634.502 ±(99.9%) 3.831 ops/s [Average]
  (min, avg, max) = (632.944, 634.502, 635.686), stdev = 0.995
  CI (99.9%): [630.671, 638.334] (assumes normal distribution)


# JMH version: 1.25.2
# VM version: JDK 11.0.5, OpenJDK 64-Bit Server VM, 11.0.5+10
# VM invoker: /home/ed/.sdkman/candidates/java/11.0.5.hs-adpt/bin/java
# VM options: -javaagent:/home/ed/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.6397.94/lib/idea_rt.jar=33691:/home/ed/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.6397.94/bin -Dfile.encoding=UTF-8
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: test.Test.standardEquals

# Run progress: 66.67% complete, ETA 00:03:21
# Fork: 1 of 1
# Warmup Iteration   1: 54756.790 ops/s
# Warmup Iteration   2: 56846.086 ops/s
# Warmup Iteration   3: 51956.795 ops/s
# Warmup Iteration   4: 51981.342 ops/s
# Warmup Iteration   5: 52003.836 ops/s
Iteration   1: 51919.053 ops/s
Iteration   2: 51924.299 ops/s
Iteration   3: 52032.292 ops/s
Iteration   4: 52075.152 ops/s
Iteration   5: 52040.773 ops/s


Result "test.Test.standardEquals":
  51998.314 ±(99.9%) 276.482 ops/s [Average]
  (min, avg, max) = (51919.053, 51998.314, 52075.152), stdev = 71.802
  CI (99.9%): [51721.832, 52274.796] (assumes normal distribution)


# JMH version: 1.25.2
# VM version: JDK 11.0.5, OpenJDK 64-Bit Server VM, 11.0.5+10
# VM invoker: /home/ed/.sdkman/candidates/java/11.0.5.hs-adpt/bin/java
# VM options: -javaagent:/home/ed/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.6397.94/lib/idea_rt.jar=33691:/home/ed/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.6397.94/bin -Dfile.encoding=UTF-8
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: test.Test.standardString

# Run progress: 83.33% complete, ETA 00:01:40
# Fork: 1 of 1
# Warmup Iteration   1: 18463.975 ops/s
# Warmup Iteration   2: 19112.717 ops/s
# Warmup Iteration   3: 19022.467 ops/s
# Warmup Iteration   4: 19160.944 ops/s
# Warmup Iteration   5: 19219.122 ops/s
Iteration   1: 19105.405 ops/s
Iteration   2: 19124.192 ops/s
Iteration   3: 19146.103 ops/s
Iteration   4: 19135.499 ops/s
Iteration   5: 19106.170 ops/s


Result "test.Test.standardString":
  19123.474 ±(99.9%) 68.966 ops/s [Average]
  (min, avg, max) = (19105.405, 19123.474, 19146.103), stdev = 17.910
  CI (99.9%): [19054.508, 19192.439] (assumes normal distribution)


# Run complete. Total time: 00:10:03

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark               Mode  Cnt      Score     Error  Units
Test.lombokEquals      thrpt    5  69212.484 ± 105.455  ops/s
Test.lombokString      thrpt    5  18980.803 ± 312.069  ops/s
Test.reflectiveEquals  thrpt    5   3415.538 ±  28.067  ops/s
Test.reflectiveString  thrpt    5    634.502 ±   3.831  ops/s
Test.standardEquals    thrpt    5  51998.314 ± 276.482  ops/s
Test.standardString    thrpt    5  19123.474 ±  68.966  ops/s

Process finished with exit code 0
