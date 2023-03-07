package org.training.advanced.java.atm.oo;

import org.training.advanced.java.adapter.Customer;

import java.util.Scanner;

public class ATMShowBalanceOperation implements IATMOperation{
    @Override
    public void execute(Customer customerParam,
                        Scanner scanner) {
        System.out.println("TL hesabınızda : " + customerParam.getBalance());
    }

    @Override
    public String getDesc() {
        return "TL hesabı görüntüle";
    }
}
