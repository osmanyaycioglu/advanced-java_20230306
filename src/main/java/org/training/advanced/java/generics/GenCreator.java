package org.training.advanced.java.generics;

public class GenCreator<T> implements IMyCreator<T> {
    @Override
    public T create() {
        return null;
    }

    public T create(Class<T> tClassParam) throws Exception {
        return tClassParam.newInstance();
    }

    public T create(T val) throws Exception {
        Class<T> aClass = (Class<T>) val.getClass();
        return aClass.newInstance();
    }

    @Override
    public String consume(T val) {
        return null;
    }
}
