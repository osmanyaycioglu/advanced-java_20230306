package org.training.advanced.java.collections;

import org.training.advanced.java.Car;
import org.training.advanced.java.adapter.Customer;
import org.training.advanced.java.atm.IATMConstants;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest3 {

    public static class CounterService {
        int counter;
    }

    public static void main(String[] args) {

        Set<String> stringsTest = new HashSet<>();
        // Set<String> stringsTest = new TreeSet<>();
        stringsTest.add("osman");
        stringsTest.add("ali");
        stringsTest.add("veli");
        stringsTest.add("mehmet");
        stringsTest.add("mahmut");
        stringsTest.add("ayşe");
        final CounterService counterService = new CounterService();
        stringsTest.forEach(s -> System.out.println(s +" -- " + (++counterService.counter) + " data"));

        Set<String> stringsTest2 = new HashSet<>();
        // Set<String> stringsTest = new TreeSet<>();
        stringsTest2.add("osman");
        stringsTest2.add("ali");
        stringsTest2.add("fatma");
        stringsTest2.add("zeki");

        // stringsTest.retainAll(stringsTest2);
        // stringsTest.removeAll(stringsTest2);
        stringsTest.addAll(stringsTest2);

        for (String s : stringsTest) {
            System.out.println(s);
        }
    }
}
