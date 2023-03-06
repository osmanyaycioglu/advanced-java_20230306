package org.training.advanced.java.inher;

public class Horse extends Animal {

    private String legCount;

    public Horse(String nameParam) {
        super(nameParam,
              "at");
    }

    @Override
    public void talk() {
        System.out.println("Ahhiii");
    }

    public String getLegCount() {
        return legCount;
    }

    public void setLegCount(String legCountParam) {
        legCount = legCountParam;
    }
}
