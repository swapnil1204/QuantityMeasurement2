package com.thoughtworks.training.measurement;

public class Foot {
    private final int value;

    public Foot(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Foot) {
            Foot that = (Foot) object;
            return this.value == that.value;
        }
        return false;
    }
}
