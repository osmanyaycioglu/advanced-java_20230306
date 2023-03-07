package org.training.advanced.java.generics;

import org.training.advanced.java.abstraction.IExecute;
import org.training.advanced.java.inher.Animal;

public class AnimalHolder<T extends Animal & Comparable<T> & IExecute> {
    private T value;

    public int compare(T animalParam){
        return  value.compareTo(animalParam);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T valueParam) {
        value = valueParam;
    }
}
