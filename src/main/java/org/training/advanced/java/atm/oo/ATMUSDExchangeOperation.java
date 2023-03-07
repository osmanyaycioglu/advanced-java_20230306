package org.training.advanced.java.atm.oo;

import org.training.advanced.java.adapter.Customer;

import java.math.BigDecimal;
import java.util.Scanner;

public class ATMUSDExchangeOperation implements IATMOperation{
    @Override
    public void execute(Customer customerParam,
                        Scanner scanner) {
        System.out.println("USD miktarı");
        BigDecimal usdAmount = scanner.nextBigDecimal();
        BigDecimal tlAmount = usdAmount.multiply(new BigDecimal(20));
        customerParam.setBalance(customerParam.getBalance().subtract(tlAmount));
    }

    @Override
    public String getDesc() {
        return "USD alma";
    }
}
