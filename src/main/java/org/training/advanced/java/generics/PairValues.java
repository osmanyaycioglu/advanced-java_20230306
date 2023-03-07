package org.training.advanced.java.generics;

public class PairValues<A,Z> {
    private A value1;
    private Z value2;

    public A getValue1() {
        return value1;
    }

    public void setValue1(A value1Param) {
        value1 = value1Param;
    }

    public Z getValue2() {
        return value2;
    }

    public void setValue2(Z value2Param) {
        value2 = value2Param;
    }
}
