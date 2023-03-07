package org.training.advanced.java.collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListTest {
    public static void main(String[] args) {
        List<String> tempStrList = Arrays.asList("mehmet","ayşe","fatma");
        List<String> strings = new ArrayList<>();
        strings.add("osman");
        strings.add("ali");
        String s = strings.get(0);
        strings.addAll(tempStrList);
        strings.remove(2);

        List<String> stringsTestIterateSafe = new CopyOnWriteArrayList<>();

        List<String> stringsTestThreadSafe1 = new Vector<>(1_000_000);
        List<String> stringsTestThreadSafe2 = Collections.synchronizedList(new ArrayList<>(1_000_000));

        List<String> stringsTest = new ArrayList<>(1_000_000);
        //List<String> stringsTest = new LinkedList<>();

        System.gc();
        try {
            Thread.sleep(5_000 );
        } catch (InterruptedException eParam) {
        }

        long delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            stringsTest.add("test" + i);
        }
        System.out.println("Delta add : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            String s1 = stringsTest.get(i);
        }
        System.out.println("Delta index : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (String str: stringsTest) {
            String s1 = str;
        }
        System.out.println("Delta iterator : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int i = 200_000; i < 210_000; i++) {
            stringsTest.contains("test" + i);
        }
        System.out.println("Delta contains : " + (System.currentTimeMillis() - delta));
        // Listeler de kullanma
        // stringsTest.removeAll();
        // stringsTest.retainAll();
        // stringsTest.containsAll();

        delta = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            stringsTest.remove(0);
        }
        System.out.println("Delta remove : " + (System.currentTimeMillis() - delta));
//        String[] stringArray = new String[10];
//        String[] newStringArray = new String[20];
//        System.arraycopy(stringArray,
//                         0,
//                         newStringArray,
//                         0,
//                         10);

    }
}
