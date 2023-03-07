package org.training.advanced.java.generics;

import org.training.advanced.java.abstraction.IExecute;
import org.training.advanced.java.inher.Animal;

import java.util.List;

public class Operation {

    public <V extends CharSequence> V copy(V value1,
                                           V value2) {
        if (value1.getClass()
                  .equals(value2.getClass())) {
            switch (value1.getClass()
                          .getName()) {
                case "java.lang.String":
                    value2 = value1;
                    return value2;
                case "java.lang.StringBuilder":
                    StringBuilder a = (StringBuilder) value2;
                    StringBuilder b = (StringBuilder) value1;
                    a.append(b);
                    return value2;
            }
        }
        throw new IllegalArgumentException("xyz");
    }

    public <V extends CharSequence> List<? super V> copy(List<? extends V> value1,
                                                         List<? super V> value2) {
        value2.addAll(value1);
        return value2;
    }

    public <T extends Animal & Comparable<T> & IExecute> AnimalHolder<T> copyAnimal(AnimalHolder<T> animal1,
                                                                                    AnimalHolder<T> animal2) {
        animal2.setValue(animal1.getValue());
        return animal2;
    }

}
