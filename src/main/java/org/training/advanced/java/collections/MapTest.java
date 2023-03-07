package org.training.advanced.java.collections;

import org.training.advanced.java.Car;
import org.training.advanced.java.adapter.Customer;
import org.training.advanced.java.atm.IATMConstants;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapTest {
    public static void main(String[] args) {

        //Set<String> stringsTest = new HashSet<>();

        Set<Car> cars = new TreeSet<>();

        Set<Customer> customers = new TreeSet<>((c1, c2) -> c1.getBalance()
                                                              .compareTo(c2.getBalance()));

        Customer customer1 = new Customer();
        customer1.setName("osman");
        customer1.setSurname("yay");
        customer1.setBalance(IATMConstants.DEFAULT_BALANCE);
        Customer customer2 = new Customer();
        customer2.setName("osman");
        customer2.setSurname("yay");
        customer2.setBalance(IATMConstants.DEFAULT_BALANCE);

        Map<String,String> stringsTest = new HashMap<>();


        System.gc();
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException eParam) {
        }

        long delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            stringsTest.put("test" + i,"test");
        }
        System.out.println("Delta add : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (String str : stringsTest.values()) {
            String s1 = str;
        }
        System.out.println("Delta iterator : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int i = 200_000; i < 210_000; i++) {
            stringsTest.containsKey("test" + i);
        }
        System.out.println("Delta contains : " + (System.currentTimeMillis() - delta));
        // Listeler de kullanma
        // stringsTest.removeAll();
        // stringsTest.retainAll();
        // stringsTest.containsAll();

        delta = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            stringsTest.remove("test" + i);
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
