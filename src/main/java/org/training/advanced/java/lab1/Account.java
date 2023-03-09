package org.training.advanced.java.lab1;

public class Account {

    private int          amount;
    private EAccountType accountType;

    public Account() {
    }

    public Account(int amount,
                   EAccountType accountType) {
        this.amount = amount;
        this.accountType = accountType;
    }

    public static AccountBuilder builder() {
        return new AccountBuilder();
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

    public static class AccountBuilder {
        private int          amount;
        private EAccountType accountType;

        AccountBuilder() {
        }

        public AccountBuilder withAmount(int amount) {
            this.amount = amount;
            return this;
        }

        public AccountBuilder withAccountType(EAccountType accountType) {
            this.accountType = accountType;
            return this;
        }

        public Account build() {
            return new Account(amount,
                               accountType);
        }

        public String toString() {
            return "Account.AccountBuilder(amount=" + this.amount + ", accountType=" + this.accountType + ")";
        }
    }
}
