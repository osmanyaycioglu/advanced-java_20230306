package org.training.advanced.java.inher;

import org.training.advanced.java.abstraction.IAnimal;

import java.util.Scanner;

public class AnimalRunner {
    public static void main(String[] args) {


        Cat cat = new Cat("mırnav");
        cat.talk();
        cat.walk();
        cat.jump();

        Animal animalX = cat;

        Animal animal = new Cat("mırnav");
        animal.talk();
        animal.walk();
        if (animal instanceof Cat) {
            Cat catX = (Cat) animal;
        }

        Object obj = new Cat("mırnav");

        int intVal = 100;
        long longVal = intVal;
        int intVal2 = (int)longVal;

        System.out.println("-------------------------------------");
        IAnimal animalPolly = new Dog("karabaş");
        animalPolly.walk();
        animalPolly.talk();
        System.out.println("-------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("hayvan tipi:");
        int i = scanner.nextInt();
        IAnimal animal1 = AnimalFactory.createAnimal(i);
        animal1.talk();
        animal1.walk();
    }
}
