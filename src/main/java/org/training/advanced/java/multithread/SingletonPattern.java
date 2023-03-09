package org.training.advanced.java.multithread;

public class SingletonPattern {
    private static volatile SingletonPattern instance;

    public static SingletonPattern getInstance() {
        if (instance == null) {
            synchronized (SingletonPattern.class) {
                if (instance == null) {
                    instance = new SingletonPattern();
                }
            }
        }
        return instance;
    }

    public void hello() {
        System.out.println("Hello world");
    }
}
