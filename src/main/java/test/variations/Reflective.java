package test.variations;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class Reflective {
    private List<Integer> ints;
    private String text;

    public Reflective(List<Integer> ints, String text) {
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
        return EqualsBuilder.reflectionEquals(this,o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
