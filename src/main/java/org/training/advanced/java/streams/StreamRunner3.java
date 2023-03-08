package org.training.advanced.java.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRunner3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("osman",
                                             "ali",
                                             "veli",
                                             "ali",
                                             "veli",
                                             "fatma",
                                             "mehmet",
                                             "mahmut");
        final List<String> uniqueList = new ArrayList<>();
        strings.stream()
               .peek(s -> System.out.println("Before Distinct : " + s + " Thread : " + Thread.currentThread()
                                                                                             .getName()))
               .distinct()
               .peek(uniqueList::add)
               .peek(s -> System.out.println("Before Filter : " + s + " Thread : " + Thread.currentThread()
                                                                                           .getName()))
               .filter(s -> s.length() > 4)
               .peek(s -> System.out.println("Before Forech : " + s + " Thread : " + Thread.currentThread()
                                                                                           .getName()))
               .forEach(s -> System.out.println("data : "
                                                + s));//        strings.stream().forEach(s -> System.out.println(s));
//        strings.stream().sorted().forEach(s -> System.out.println(s));
    }
}
