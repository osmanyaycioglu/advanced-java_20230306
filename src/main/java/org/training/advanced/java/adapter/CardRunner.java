package org.training.advanced.java.adapter;

public class CardRunner {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFirstName("osman");
        employee.setLastName("yaycıoğlu");

        CardPrinter cardPrinter = new CardPrinter();
        cardPrinter.print(employee);

        Customer customer = new Customer();
        customer.setName("mehmet");
        customer.setSurname("alaz");
        //
        cardPrinter.print();
    }
}
