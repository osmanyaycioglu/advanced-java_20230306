package org.training.advanced.java.atm.oo;

import org.training.advanced.java.adapter.Customer;
import org.training.advanced.java.atm.ATMOperation;

import java.util.Scanner;

public class ATMWithDrawOperation extends AbstractATMBalanceOperation {
    @Override
    public void execute(Customer customerParam,
                        Scanner scanner) {
        executeATMOperation(customerParam,
                            scanner,
                            ATMOperation.WITHDRAW);
    }

    @Override
    public String getDesc() {
        return "Para çekme";
    }
}
