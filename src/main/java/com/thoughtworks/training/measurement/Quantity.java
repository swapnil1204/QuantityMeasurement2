package com.thoughtworks.training.measurement;

public class Quantity {
    private final int value;

    Quantity(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Quantity;
    }
}
