package org.training.advanced.java.inher;

public class Cat extends Animal {

    private String legCount;

    public Cat(String nameParam) {
        super(nameParam,
              "kedi");

    }

    @Override
    public void talk() {
        System.out.println("Miyav miyav");
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
}
