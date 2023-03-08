package org.training.advanced.java.streams;

import org.training.advanced.java.adapter.Customer;

import java.util.function.*;

public class StreamRunner {
    public static void main(String[] args) {
        Consumer<String> con1 = s -> System.out.println("con1 " + s);
        Consumer<Integer> con2 = i -> System.out.println("sonuç " + (i * i));

        BiConsumer<String, Integer> bicons1 = (s, i) -> System.out.println(s + "=" + (i * i));
        bicons1.accept("result",
                       10);

        Function<String, Integer> func1 = s -> s.length();
        Function<Integer, Integer> func2 = i -> i * i;

        BiFunction<String, String, Integer> bifunc1 = (s1, s2) -> s1.length() + s2.length();

        BinaryOperator<String> bin1 = (s1, s2) -> s1 + "-" + s2;
        BiFunction<String, String, String> bin2 = (s1, s2) -> s1 + "-" + s2;;

        UnaryOperator<String> un1 = s -> s + " lambda";

        Predicate<String> pre1 = s -> s.length() > 6;
        Predicate<Customer> pre2 = cust -> cust.getBalance()
                                               .longValue() > 1000;

        BiPredicate<Integer, Integer> bipre = (i1, i2) -> i1 > i2;

        Supplier<String> sup1 = () -> "osman";


    }
}
