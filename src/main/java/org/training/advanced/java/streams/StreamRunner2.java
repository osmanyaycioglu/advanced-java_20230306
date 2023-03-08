package org.training.advanced.java.streams;

import org.training.advanced.java.adapter.Customer;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class StreamRunner2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("osman",
                                             "ali",
                                             "veli",
                                             "ali",
                                             "veli",
                                             "fatma",
                                             "mehmet",
                                             "mahmut");
        Set<String> tempSet = new HashSet<>(strings);
        List<String> strList = new ArrayList<>();
        for (String s : tempSet) {
            if (s.length() > 4) {
                strList.add(s);
            }
        }
        Collections.sort(strList);
        // Collections.sort(strList,(s1,s2)-> s1.length() - s2.length());
        List<String> collect = strings.stream()
                                      .distinct()
                                      .filter(s -> s.length() > 4)
                                      .collect(Collectors.toList());

        strings.stream()
               .distinct()
               .sorted()
               .filter(s -> s.length() > 4)
               .forEach(s -> System.out.println("data : " + s));

    }
}
