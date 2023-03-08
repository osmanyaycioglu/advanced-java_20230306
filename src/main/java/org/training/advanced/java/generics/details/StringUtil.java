package org.training.advanced.java.generics.details;

import java.util.stream.IntStream;

public class StringUtil {

    private String str;

    public StringUtil(String strParam) {
        str = strParam;
    }

    public int length(){
        return str.length();
    }

    public IntStream chars(){
        return str.chars();
    }

}
