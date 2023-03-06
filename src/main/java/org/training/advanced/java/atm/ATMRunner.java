package org.training.advanced.java.atm;

import org.training.advanced.java.adapter.Customer;

import java.math.BigDecimal;
import java.util.Scanner;

public class ATMRunner {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("osman");
        customer.setSurname("yay");
        customer.setBalance(IATMConstants.DEFAULT_BALANCE);
        try (Scanner scanner = new Scanner(System.in)) {
            rloop:
            while (true) {
                System.out.println(IATMConstants.ATM_WITHDRAW_INDEX + "-Para çekme");
                System.out.println("2-Para yatırma");
                System.out.println("3-Hesap görüntüle");
                System.out.println("seçiminiz:");
                int menuIndex = scanner.nextInt();
                switch (menuIndex) {
                    case IATMConstants.ATM_WITHDRAW_INDEX: {
                        executeATMOperation(customer,
                                            scanner,
                                            ATMOperation.WITHDRAW);
                        break;
                    }
                    case 2: {
                        executeATMOperation(customer,
                                            scanner,
                                            ATMOperation.DEPOSIT);
                        break;
                    }
                    case 3: {
                        System.out.println("Hesabınızdaki miktar : " + customer.getBalance());
                        break;
                    }
                    default:
                        break rloop;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void executeATMOperation(Customer customer,
                                            Scanner scanner,
                                            ATMOperation operationParam) {
        System.out.println(operationParam.getOperationStr());
        BigDecimal bigDecimal = scanner.nextBigDecimal();
        customer.setBalance(operationParam.executeOperation(customer.getBalance(), bigDecimal));
        System.out.println(operationParam.getOperationEndStr());
    }
}
