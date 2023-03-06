package org.training.advanced.java.adapter;

public class CustomerEmployeeAdapter extends Employee {
    private Customer customer;

    public CustomerEmployeeAdapter(Customer customerParam) {
        customer = customerParam;
    }

    @Override
    public String getFirstName() {
        return customer.getName();
    }

    @Override
    public String getLastName() {
        return customer.getSurname();
    }
}
