package org.training.advanced.java.generics;

import org.training.advanced.java.Car;
import org.training.advanced.java.atm.oo.ATMDepositOperation;
import org.training.advanced.java.atm.oo.ATMWithDrawOperation;
import org.training.advanced.java.inher.Animal;
import org.training.advanced.java.inher.Cat;
import org.training.advanced.java.inher.Dog;
import org.training.advanced.java.inher.Lion;

import java.util.ArrayList;
import java.util.List;

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

        PairValues<String,Integer> pairValues = new PairValues<>();
        pairValues.setValue1("osman");
        pairValues.setValue2(53);

        KeyValue<String, ATMDepositOperation> atmDepositOperationKeyValue = new KeyValue<>();
        atmDepositOperationKeyValue.setKey("deneme");
        atmDepositOperationKeyValue.setValue(new ATMDepositOperation());
        String valueDesc = atmDepositOperationKeyValue.getValueDesc();
        int i = atmDepositOperationKeyValue.keySize();

        KeyValue<StringBuffer, ATMWithDrawOperation> stringStringKeyValue = new KeyValue<>();

        AnimalHolder<Cat> catAnimalHolder = new AnimalHolder<>();
        catAnimalHolder.setValue(new Cat("mırnav"));
        Cat value5 = catAnimalHolder.getValue();

        AnimalHolder<Dog> dogAnimalHolder = new AnimalHolder<>();
        dogAnimalHolder.setValue(new Dog("karabaş"));

        AnimalHolder<?> animalHolder1 = catAnimalHolder;
        animalHolder1 = dogAnimalHolder;
        Animal value4 = animalHolder1.getValue();


        AnimalHolder<? super Cat> animalHolder = catAnimalHolder;
        animalHolder.setValue(new Cat("deneme"));
        animalHolder.setValue(new Lion("aslan"));
        Animal value3 = animalHolder.getValue();

        AnimalHolder<Cat> animalHolder2 = catAnimalHolder;
        animalHolder2.setValue(new Cat("deneme"));
        animalHolder2.setValue(new Lion("aslan"));
        Cat cat3 = animalHolder2.getValue();

        List<? super String> listUsable = new ArrayList<>();
        listUsable.add("osman");


        List<Object> listYouCanUse = new ArrayList<>();
        listYouCanUse.add("osman");
        listYouCanUse.add(109);
        listYouCanUse.add(190282241243L);

        List<Long> longs = new ArrayList<>();

        Operation operation = new Operation();
        StringBuilder builder = new StringBuilder();
        builder.append(100);
        StringBuilder copy = operation.copy(builder,
                                            new StringBuilder());
    }
}
