package org.training.advanced.java.collections;

import org.training.advanced.java.Car;
import org.training.advanced.java.adapter.Customer;
import org.training.advanced.java.atm.IATMConstants;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest2 {
    public static void main(String[] args) {

        //Set<String> stringsTest = new HashSet<>();
        Set<String> stringsTest = new TreeSet<>();

        Set<Car> cars = new TreeSet<>();

//        Set<Customer> customers = new TreeSet<>((c1, c2) -> c1.getBalance()
//                                                              .compareTo(c2.getBalance()));
        Set<Customer> customers = new HashSet<>();


        Customer customer1 = new Customer();
        customer1.setName("osman");
        customer1.setSurname("yay");
        customer1.setBalance(IATMConstants.DEFAULT_BALANCE);
        Customer customer2 = new Customer();
        customer2.setName("osman");
        customer2.setSurname("yay");
        customer2.setBalance(IATMConstants.DEFAULT_BALANCE);

        customers.add(customer1);
        customers.add(customer2);

        customers.forEach(System.out::println);

        if (customer1 == customer2){
            System.out.println("Heyoo eşit");
        } else {
            System.out.println("eşit değil");
        }
        if (customer1.equals(customer2)){
            System.out.println("Heyoo eşit");
        } else {
            System.out.println("eşit değil");
        }
    }
}
