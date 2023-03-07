package org.training.advanced.java.generics;

import org.training.advanced.java.inher.Cat;

public class CatCreator implements IMyCreator<Cat> {

    @Override
    public Cat create() {
        return new Cat("kedicik");
    }

    @Override
    public String consume(Cat val) {
        return val.getName() + " işlendi";
    }
}
