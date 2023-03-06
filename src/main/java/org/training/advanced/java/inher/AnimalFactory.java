package org.training.advanced.java.inher;

import org.training.advanced.java.abstraction.IAnimal;

public class AnimalFactory {

    public static IAnimal createAnimal(int i){
        IAnimal animal1 = null;
        switch (i){
            case 1:
                animal1 = new Cat("kedi");
            case 2:
                animal1 = new Dog("köpek");
            case 3:
            default:
                animal1 = new Horse("at");
        }
        return animal1;
    }
}
