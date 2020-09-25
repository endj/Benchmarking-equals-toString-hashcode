package test.variations;

import java.util.List;
import java.util.Objects;

public class Standard {
    private List<Integer> ints;
    private String text;

    public Standard(List<Integer> ints, String text) {
        this.ints = ints;
        this.text = text;
    }

    public List<Integer> getInts() {
        return ints;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Standard standard = (Standard) o;
        return Objects.equals(ints, standard.ints) &&
                Objects.equals(text, standard.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ints, text);
    }

    @Override
    public String toString() {
        return "Standard{" +
                "ints=" + ints +
                ", text='" + text + '\'' +
                '}';
    }
}
