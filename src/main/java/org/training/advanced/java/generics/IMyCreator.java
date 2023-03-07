package org.training.advanced.java.generics;

public interface IMyCreator<R> {
    R create();
    String consume(R val);
}
