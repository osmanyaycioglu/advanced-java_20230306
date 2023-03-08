package org.training.advanced.java.streams;

import org.training.advanced.java.adapter.Customer;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamRunner4 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("osman",
                                             "ali",
                                             "veli",
                                             "ali",
                                             "veli",
                                             "fatma",
                                             "mehmet",
                                             "mahmut");

        strings.stream()
               .skip(2)
               .peek(System.out::println)
               .limit(3)
               .distinct()
               .filter(s -> s.length() > 4)
               .forEach(s -> System.out.println("data : " + s));

        strings.stream()
               .distinct()
               .map(s -> new Customer(s))
               .filter(c -> c.getName()
                             .length() > 4)
               .peek(c -> c.setBalance(BigDecimal.TEN))
               .forEach(c -> System.out.println("data : " + c));

        IntSummaryStatistics collect = strings.stream()
                                              .distinct()
                                              .map(s -> s.length())
                                              .filter(i -> i > 4)
                                              .collect(Collectors.summarizingInt(i -> i));
        System.out.println("Stats: " + collect);

        IntSummaryStatistics intSummaryStatistics = strings.stream()
                                                           .distinct()
                                                           .mapToInt(s -> s.length())
                                                           .filter(i -> i > 4)
                                                           .summaryStatistics();
        System.out.println("Stats 2 : " + intSummaryStatistics);
    }
}
