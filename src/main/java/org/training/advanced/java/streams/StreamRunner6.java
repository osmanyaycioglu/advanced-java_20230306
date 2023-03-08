package org.training.advanced.java.streams;

import org.training.advanced.java.adapter.Customer;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamRunner6 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("osman",
                                             "ali",
                                             "veli",
                                             "ali",
                                             "veli",
                                             "fatma",
                                             "mehmet",
                                             "mahmut");


        Integer count = strings.stream()
                               .distinct()
                               .filter(s -> s.length() > 4)
                               .reduce(0,
                                       (i, s) -> i + s.length(),
                                       (i1, i2) -> i1 + i2);

        ArrayList<String> reduce = strings.stream()
                                          .distinct()
                                          .filter(s -> s.length() > 4)
                                          .reduce(new ArrayList<String>(),
                                                  (al, s) -> {
                                                      al.add(s);
                                                      return al;
                                                  },
                                                  (al1, al2) -> {
                                                      al1.addAll(al2);
                                                      return al1;
                                                  });


        Collector<String, ArrayList<String>, ArrayList<String>> myCollector = new Collector<String, ArrayList<String>, ArrayList<String>>() {
            @Override
            public Supplier<ArrayList<String>> supplier() {
                return ArrayList::new;
            }

            @Override
            public BiConsumer<ArrayList<String>, String> accumulator() {
                return ArrayList::add;
            }

            @Override
            public BinaryOperator<ArrayList<String>> combiner() {
                return (al1, al2) -> {
                    al1.addAll(al2);
                    return al1;
                };
            }

            @Override
            public Function<ArrayList<String>, ArrayList<String>> finisher() {
                return al -> al;
            }

            @Override
            public Set<Characteristics> characteristics() {
                Set<Characteristics> car= new HashSet<>();
                car.add(Characteristics.CONCURRENT);
                car.add(Characteristics.UNORDERED);
                return car;
            }
        };
        ArrayList<String> collect = strings.stream()
                                           .distinct()
                                           .filter(s -> s.length() > 4)
                                           .collect(myCollector);
        System.out.println(collect);

    }
}
