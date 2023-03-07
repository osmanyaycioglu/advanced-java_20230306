package org.training.advanced.java.inher;

import org.training.advanced.java.abstraction.IExecute;

public class Dog extends Animal implements IExecute,Comparable<Dog> {

    private String legCount;

    public Dog(String nameParam) {
        super(nameParam,
              "köpek");
    }

    @Override
    public void talk() {
        System.out.println("Hav hav");
    }

    @Override
    public void doAll() {
        super.doAll();
    }

    public void eat(){
        System.out.println("Dog eating");
    }

    public String getLegCount() {
        return legCount;
    }

    public void setLegCount(String legCountParam) {
        legCount = legCountParam;
    }

    @Override
    public int compareTo(Dog o) {
        return 0;
    }

    @Override
    public String execute(String sParam) {
        return null;
    }

    @Override
    public void test() {
        IExecute.super.test();
    }
}
