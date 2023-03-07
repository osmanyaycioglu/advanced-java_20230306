package org.training.advanced.java.atm.oo;

import org.training.advanced.java.adapter.Customer;
import org.training.advanced.java.atm.ATMOperation;

import java.math.BigDecimal;
import java.util.Scanner;

public abstract class AbstractATMBalanceOperation implements IATMOperation {
    protected void executeATMOperation(Customer customer,
                                            Scanner scanner,
                                            ATMOperation operationParam) {
        System.out.println(operationParam.getOperationStr());
        BigDecimal bigDecimal = scanner.nextBigDecimal();
        customer.setBalance(operationParam.executeOperation(customer.getBalance(), bigDecimal));
        System.out.println(operationParam.getOperationEndStr());
    }

}
