package org.training.advanced.java.adapter;

import java.math.BigDecimal;

public class Customer {
    private String name;
    private String surname;
    private BigDecimal balance;
    private ECustomerType customerType;

    public String getName() {
        return name;
    }

    public void setName(String nameParam) {
        name = nameParam;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surnameParam) {
        surname = surnameParam;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balanceParam) {
        balance = balanceParam;
    }

    public ECustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(ECustomerType customerTypeParam) {
        customerType = customerTypeParam;
    }
}
