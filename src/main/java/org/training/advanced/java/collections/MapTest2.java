package org.training.advanced.java.collections;

import org.training.advanced.java.Car;
import org.training.advanced.java.adapter.Customer;
import org.training.advanced.java.atm.IATMConstants;

import java.util.*;

public class MapTest2 {
    public static void main(String[] args) {

        //Set<String> stringsTest = new HashSet<>();


        Customer customer1 = new Customer();
        customer1.setName("osman");
        customer1.setSurname("yay");
        customer1.setBalance(IATMConstants.DEFAULT_BALANCE);
        customer1.setUsername("osman1");
        Customer customer2 = new Customer();
        customer2.setName("osman");
        customer2.setSurname("yayla");
        customer2.setBalance(IATMConstants.DEFAULT_BALANCE);
        customer1.setUsername("osman2");

        Map<String,Customer> customerMap = new HashMap<>();
        customerMap.put(customer1.getUsername(), customer1);
        customerMap.put(customer2.getUsername(), customer2);

        Set<String> strings = customerMap.keySet();
        for (String string : strings) {
            Customer customer = customerMap.get(string);
            System.out.println(customer);
        }
        System.out.println("-------------------");
        Collection<Customer> values = customerMap.values();
        for (Customer value : values) {
            System.out.println(value);
        }
        System.out.println("-------------------");
        Set<Map.Entry<String, Customer>> entries = customerMap.entrySet();
        for (Map.Entry<String, Customer> entry : entries) {
            System.out.println(entry.getKey()  + ":" + entry.getValue());
        }
    }
}
