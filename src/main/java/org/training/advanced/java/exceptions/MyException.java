package org.training.advanced.java.exceptions;

import org.training.advanced.java.Car;

public class MyException extends Exception {
    private String desc;
    private int errorCause;
    private int errorRoot;
    private Car car;

    public MyException(String descParam,
                       int errorCauseParam,
                       int errorRootParam,
                       Car carParam) {
        desc = descParam;
        errorCause = errorCauseParam;
        errorRoot = errorRootParam;
        car = carParam;
    }

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String descParam) {
        desc = descParam;
    }

    public int getErrorCause() {
        return errorCause;
    }

    public void setErrorCause(int errorCauseParam) {
        errorCause = errorCauseParam;
    }

    public int getErrorRoot() {
        return errorRoot;
    }

    public void setErrorRoot(int errorRootParam) {
        errorRoot = errorRootParam;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car carParam) {
        car = carParam;
    }

    @Override
    public String toString() {
        return "MyException{" +
               "desc='" + desc + '\'' +
               ", errorCause=" + errorCause +
               ", errorRoot=" + errorRoot +
               ", car=" + car +
               '}';
    }
}
