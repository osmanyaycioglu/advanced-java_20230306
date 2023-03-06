package org.training.advanced.java.inher;

public class Dog extends Animal {

    private String legCount;

    public Dog(String nameParam) {
        super(nameParam,
              "köpek");
    }

    @Override
    public void talk() {
        System.out.println("Hav hav");
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
}
