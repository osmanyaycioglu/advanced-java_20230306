package org.training.advanced.java.adapter;

public class CardPrinterAdapter extends CardPrinter {

    public void print(Customer customerParam){
        Employee employee = new Employee();
        employee.setFirstName(customerParam.getName());
        employee.setLastName(customerParam.getSurname());
        super.print(employee);
    }

}
