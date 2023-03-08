package org.training.advanced.java.generics.details;

import java.util.ArrayList;
import java.util.List;

public class ListRunner {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("ali");

        String str = (String) list.get(0);
        // TYpe safety
        List<String> strings = new ArrayList<>();
        strings.add("ali");

        String s = strings.get(0);

    }
}
