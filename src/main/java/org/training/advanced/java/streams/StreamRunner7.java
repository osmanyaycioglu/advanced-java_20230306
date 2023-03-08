package org.training.advanced.java.streams;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class StreamRunner7 {
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
               .distinct()
               .filter(s -> s.length() > 4)
               .flatMap(s -> {
                            char[] chars = s.toCharArray();
                            Character[] ochars = new Character[chars.length];
                            for (int i = 0; i < chars.length; i++) {
                                ochars[i] = chars[i];
                            }
                            return Arrays.stream(ochars);
                        }
               )
               .distinct()
               .sorted()
               .forEach(System.out::println);
        Stream<Stream<Character>> streamStream = strings.stream()
                                                        .distinct()
                                                        .filter(s -> s.length() > 4)
                                                        .map(s -> {
                                                                 char[] chars = s.toCharArray();
                                                                 Character[] ochars = new Character[chars.length];
                                                                 for (int i = 0; i < chars.length; i++) {
                                                                     ochars[i] = chars[i];
                                                                 }
                                                                 return Arrays.stream(ochars);
                                                             }
                                                        );

    }
}
