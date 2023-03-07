package org.training.advanced.java.generics;

public class ValueHolder<A> {
    private A value;

    public A getValue() {
        return value;
    }

    public void setValue(A valueParam) {
        value = valueParam;
    }
}
