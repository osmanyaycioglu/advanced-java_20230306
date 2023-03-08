package org.training.advanced.java.generics.details;

import java.util.stream.IntStream;

public class CharSequenceUtil<T extends CharSequence> {

    private T cs;

    public CharSequenceUtil(T csParam) {
        cs = csParam;
    }

    public int length(){
        return cs.length();
    }

    public IntStream chars(){
        return cs.chars();
    }

    public <V> String consToStr1(V vParam1,V vParam2){
        return vParam1.toString() + " -- " + vParam2.toString();
    }

    public <V,R> String consToStr2(V vParam1,R vParam2){
        return vParam1.toString() + " -- " + vParam2.toString();
    }

    public <V extends CharSequence,R extends Number> String consToStr3(V vParam1,R vParam2){
        return vParam1.toString() + " -- " + vParam2.toString();
    }

}
