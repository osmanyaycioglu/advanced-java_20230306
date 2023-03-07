package org.training.advanced.java.atm.oo;

import org.training.advanced.java.adapter.Customer;
import org.training.advanced.java.adapter.ECustomerType;
import org.training.advanced.java.atm.ATMOperation;
import org.training.advanced.java.atm.IATMConstants;

import java.util.Scanner;

public class ATMNewRunner {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("osman");
        customer.setSurname("yay");
        customer.setBalance(IATMConstants.DEFAULT_BALANCE);
        customer.setCustomerType(ECustomerType.DISABLED);

        try (Scanner scanner = new Scanner(System.in)) {
            ATM atm = new ATM(customer,
                              scanner);
            rloop:
            while (true) {
                atm.showMenu();
                System.out.println("seçiminiz:");
                int menuIndex = scanner.nextInt();
                if (menuIndex > atm.getOpSize()) {
                    break rloop;
                }
//                IATMOperation operation = atm.getOperation(menuIndex - 1);
//                operation.execute(customer, scanner);
                atm.executeOperation(menuIndex - 1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
