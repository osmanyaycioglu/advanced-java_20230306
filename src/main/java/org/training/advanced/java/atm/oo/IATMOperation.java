package org.training.advanced.java.atm.oo;

import org.training.advanced.java.adapter.Customer;

import java.util.Scanner;

public interface IATMOperation {
    void execute(Customer customerParam,
                 Scanner scanner);

    String getDesc();
}
