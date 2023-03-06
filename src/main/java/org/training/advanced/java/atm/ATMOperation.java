package org.training.advanced.java.atm;

import java.math.BigDecimal;

public enum ATMOperation {
    WITHDRAW("Çekeceğiniz miktar:",
             "Para çekme tamamlandı") {
        @Override
        public BigDecimal executeOperation(BigDecimal balance,
                                           BigDecimal amount) {
            return balance.subtract(amount);
        }
    }, DEPOSIT("Yatıracağınız miktar:",
               "Para yatırma tamamlandı") {
        @Override
        public BigDecimal executeOperation(BigDecimal balance,
                                           BigDecimal amount) {
            return balance.add(amount);
        }
    };

    private String operationStr;
    private String operationEndStr;

    ATMOperation(String operationStrParam,
                 String operationEndStrParam) {
        operationStr = operationStrParam;
        operationEndStr = operationEndStrParam;
    }

    public BigDecimal executeOperation(BigDecimal balance,
                                       BigDecimal amount) {
        throw new IllegalStateException("Shouldnt be here");
    }

    public String getOperationStr() {
        return operationStr;
    }

    public String getOperationEndStr() {
        return operationEndStr;
    }
}
