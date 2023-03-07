package org.training.advanced.java.atm.oo;

import org.training.advanced.java.adapter.Customer;
import org.training.advanced.java.atm.ATMOperation;

import java.util.Scanner;

public class ATMDepositOperation extends AbstractATMBalanceOperation {
    @Override
    public void execute(Customer customerParam,
                        Scanner scanner) {
        executeATMOperation(customerParam,
                            scanner,
                            ATMOperation.DEPOSIT);
    }

    @Override
    public String getDesc() {
        return "Para yatırma1";
    }
}
