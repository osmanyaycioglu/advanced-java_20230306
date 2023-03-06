package org.training.advanced.java.abstraction;

@FunctionalInterface
public interface IExecute {

    String execute(String sParam);

    default void test(){
        System.out.println("test");
    }

}
