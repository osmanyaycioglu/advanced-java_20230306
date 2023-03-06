package org.training.advanced.java.inher;

public class Kangroo extends Animal {

    private String legCount;

    public Kangroo(String nameParam) {
        super(nameParam,
              "kanguru");
    }

    @Override
    public void talk() {
        System.out.println("iiikkkk");
    }

    @Override
    public void walk() {
        System.out.println("Kanguru zıplıyor");
    }

    public String getLegCount() {
        return legCount;
    }

    public void setLegCount(String legCountParam) {
        legCount = legCountParam;
    }
}
