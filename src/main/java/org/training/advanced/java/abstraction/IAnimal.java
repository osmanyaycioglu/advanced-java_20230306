package org.training.advanced.java.abstraction;

import java.io.Closeable;

public interface IAnimal extends IAnimalInfo,Cloneable, Closeable {
    String test="osman";
    public static final String test1 = "osman";

    void talk();
    void walk();

    default void doAll(){
        System.out.println("Start talking");
        talk();
        System.out.println("Start walking");
        walk();
    }

    public static boolean isEmpty(String str){
        return str == null || str.isEmpty();
    }
}
