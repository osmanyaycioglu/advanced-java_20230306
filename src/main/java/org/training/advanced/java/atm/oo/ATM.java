package org.training.advanced.java.atm.oo;

import org.training.advanced.java.adapter.Customer;

import java.util.List;
import java.util.Scanner;

public class ATM {
    private final Customer customer;
    private final Scanner scanner;
    private List<IATMOperation> operations;

    public ATM(Customer customerParam,
               Scanner scannerParam) {
        customer = customerParam;
        scanner = scannerParam;
        operations = ATMOperationsFactory.createATMOperations(customerParam);
    }

    public void showMenu() {
        int index = 1;
        for (IATMOperation operation : operations) {
            System.out.println(index + "-" + operation.getDesc());
            index++;
        }
    }

    public void executeOperation(int index) {
        IATMOperation iatmOperation = operations.get(index);
        iatmOperation.execute(customer, scanner);
    }

    public IATMOperation getOperation(int index){
        return operations.get(index);
    }

    public int getOpSize(){
        return operations.size();
    }
}
