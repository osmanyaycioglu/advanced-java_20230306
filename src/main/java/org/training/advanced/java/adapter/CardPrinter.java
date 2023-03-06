package org.training.advanced.java.adapter;

public class CardPrinter {

    public void print(Employee employeeParam) {
        System.out.println("Sayın " + employeeParam.getFirstName() + " " + employeeParam.getLastName());
    }
}
