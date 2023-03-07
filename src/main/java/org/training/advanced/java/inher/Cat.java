package org.training.advanced.java.inher;

import org.training.advanced.java.abstraction.IExecute;

public class Cat extends Animal implements IExecute,Comparable<Cat> {

    private String legCount;

    public Cat(String nameParam) {
        super(nameParam,
              "kedi");

    }

    @Override
    public void talk() {
        System.out.println("Miyav miyav");
    }

    @Override
    public void doAll() {
        super.doAll();
    }

    public void jump(){
        System.out.println("Cat jumping");
    }

    public String getLegCount() {
        return legCount;
    }

    public void setLegCount(String legCountParam) {
        legCount = legCountParam;
    }

    @Override
    public String execute(String sParam) {
        return null;
    }

    @Override
    public void test() {
        IExecute.super.test();
    }

    @Override
    public int compareTo(Cat o) {
        return 0;
    }
}
