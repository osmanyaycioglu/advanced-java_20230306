package org.training.advanced.java.inher;

import org.training.advanced.java.abstraction.IAnimal;

import java.io.Closeable;
import java.io.IOException;

public abstract class Animal implements IAnimal {
    private String name;
    private String animalName;

    public Animal(String nameParam,
                  String animalNameParam) {
        name = nameParam;
        animalName = animalNameParam;
    }

    // abstract String getBehavior();

    @Override
    public void walk(){
        System.out.println("animal walking");
    }

    @Override
    public String getAnimalName() {
        return animalName;
    }

    public String getName() {
        return name;
    }

    @Override
    public void close() throws IOException {

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
