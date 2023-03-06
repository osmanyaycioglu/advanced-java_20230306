package org.training.advanced.java;

public class Car extends Object {

    private int speed;
    private int turnSpeed;
    private int counter;

//    private int teaTime;
//
//    private void cookTea(){
//
//    }

    public void forward() {
        counter++;
    }

    public void reset(){
        counter = 0;
    }

    public void turn() {

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speedParam) {
        speed = speedParam;
    }


    public int getTurnSpeed() {
        return turnSpeed;
    }

    public int getCounter() {
        return counter;
    }

}
