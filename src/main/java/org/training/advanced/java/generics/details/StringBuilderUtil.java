package org.training.advanced.java.generics.details;

import java.util.stream.IntStream;

public class StringBuilderUtil {

    private StringBuilder sb;

    public StringBuilderUtil(StringBuilder sbParam) {
        sb = sbParam;
    }

    public int length() {
        return sb.length();
    }

    public IntStream chars() {
        return sb.chars();
    }


}
