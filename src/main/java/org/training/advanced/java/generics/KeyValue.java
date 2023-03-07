package org.training.advanced.java.generics;

import org.training.advanced.java.atm.oo.IATMOperation;

public class KeyValue<K extends CharSequence,T extends IATMOperation> {
    private K key;
    private T value;

    public int keySize(){
        return key.length();
    }

    public K getKey() {
        return key;
    }

    public void setKey(K keyParam) {
        key = keyParam;
    }

    public String getValueDesc(){
        return value.getDesc();
    }

    public T getValue() {
        return value;
    }

    public void setValue(T valueParam) {
        value = valueParam;
    }
}
