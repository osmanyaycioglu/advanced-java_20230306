package org.training.advanced.java.iterators;

import org.training.advanced.java.collections.lab1.EAccountType;

public class Account {

    private int          amount;
    private EAccountType accountType;

    public Account() {
    }



    public Account setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public Account setAccountType(EAccountType accountType) {
        this.accountType = accountType;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public EAccountType getAccountType() {
        return accountType;
    }


    @Override
    public String toString() {
        return "Account{" +
               "amount=" + amount +
               ", accountType=" + accountType +
               '}';
    }
}
