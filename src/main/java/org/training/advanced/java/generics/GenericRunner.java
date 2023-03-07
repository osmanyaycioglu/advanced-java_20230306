package org.training.advanced.java.generics;

import org.training.advanced.java.Car;

public class GenericRunner {
    public static void main(String[] args) {
        ValueHolder valueHolder = new ValueHolder();
        valueHolder.setValue(100);
        valueHolder.setValue("djhs");

        Object value = valueHolder.getValue();
        if (value instanceof String){
            String s = (String) value;
        }

        ValueHolder<String> stringValueHolder = new ValueHolder<>();
        stringValueHolder.setValue("osman");
        String value1 = stringValueHolder.getValue();

        ValueHolder<Car> carValueHolder = new ValueHolder<>();
        carValueHolder.setValue(new Car());
        Car value2 = carValueHolder.getValue();

    }
}
