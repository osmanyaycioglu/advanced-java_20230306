package org.training.advanced.java.inher;

public class Lion extends Cat{

    public Lion(String nameParam) {
        super(nameParam);
    }

    @Override
    public void talk() {
        System.out.println("rooooor");;
    }
}
