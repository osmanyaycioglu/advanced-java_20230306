package org.training.advanced.java.atm.oo;

import org.training.advanced.java.adapter.Customer;

import java.util.ArrayList;
import java.util.List;

public class ATMOperationsFactory {

    public static List<IATMOperation> createATMOperations(Customer customerParam){
        List<IATMOperation> operations = new ArrayList<>();
        switch (customerParam.getCustomerType()){
            case FULL:
                operations.add(new ATMWithDrawOperation());
                operations.add(new ATMDepositOperation());
                operations.add(new ATMUSDExchangeOperation());
                operations.add(new ATMShowBalanceOperation());
                break;
            case DISABLED:
                operations.add(new ATMShowBalanceOperation());
                break;
            case LIMITED:
                operations.add(new ATMWithDrawOperation());
                operations.add(new ATMShowBalanceOperation());
                break;
        }
        return operations;
    }

}
