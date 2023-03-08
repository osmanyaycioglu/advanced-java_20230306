package org.training.advanced.java.streams;

import org.training.advanced.java.adapter.Customer;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class StreamRunner5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("osman",
                                             "ali",
                                             "veli",
                                             "ali",
                                             "veli",
                                             "fatma",
                                             "mehmet",
                                             "mahmut");

        Map<String, Customer> collect = strings.stream()
                                               .distinct()
                                               .filter(s -> s.length() > 4)
                                               .collect(Collectors.toMap(s -> s,
                                                                         Customer::new));

        boolean a = strings.stream()
                           .distinct()
                           .filter(s -> s.length() > 4)
                           .peek(System.out::println)
                           .anyMatch(s -> s.contains("a"));

        boolean b = strings.stream()
                           .distinct()
                           .filter(s -> s.length() > 4)
                           .peek(System.out::println)
                           .noneMatch(s -> s.contains("w"));
        System.out.println("------------");
        boolean c = strings.stream()
                           .distinct()
                           .filter(s -> s.length() > 4)
                           .peek(System.out::println)
                           .allMatch(s -> s.contains("o"));



        System.out.println("A :" + a + " B:" + b + " C:" +c);

        System.out.println("------------");
        Optional<String> o = strings.stream()
                                    .distinct()
                                    .filter(s -> s.length() > 4)
                                    .findAny();

    }
}
