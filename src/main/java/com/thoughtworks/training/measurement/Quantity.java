package com.thoughtworks.training.measurement;

public class Quantity {
    private final int value;

    Quantity(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Quantity) {
            Quantity that = (Quantity) object;
            return this.value == that.value;
        }
        return false;
    }
}
