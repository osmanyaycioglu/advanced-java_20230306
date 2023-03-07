package org.training.advanced.java.adapter;

import java.math.BigDecimal;
import java.util.Objects;

public class Customer {
    private String name;
    private String surname;
    private BigDecimal balance;
    private ECustomerType customerType;
    private String username;

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

    @Override
    public String toString() {
        return "Customer{" +
               "name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", balance=" + balance +
               ", customerType=" + customerType +
               '}';
    }

    @Override
    public boolean equals(Object oParam) {
        if (this == oParam) return true;
        if (oParam == null || getClass() != oParam.getClass()) return false;
        Customer customer = (Customer) oParam;
        return Objects.equals(name,
                              customer.name)
               && Objects.equals(surname,
                                 customer.surname)
               && Objects.equals(balance,
                                 customer.balance)
               && customerType == customer.customerType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
                            surname,
                            balance,
                            customerType);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String usernameParam) {
        username = usernameParam;
    }
}
