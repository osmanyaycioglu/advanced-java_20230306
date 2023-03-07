package org.training.advanced.java;

import java.util.Objects;

public class Car extends Object implements Comparable<Car> {

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

    @Override
    public int compareTo(Car o) {
        return Integer.compare(speed, o.speed);
    }

    @Override
    public boolean equals(Object oParam) {
        if (this == oParam) return true;
        if (oParam == null || getClass() != oParam.getClass()) return false;
        Car car = (Car) oParam;
        return speed == car.speed && turnSpeed == car.turnSpeed && counter == car.counter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed,
                            turnSpeed,
                            counter);
    }
}
