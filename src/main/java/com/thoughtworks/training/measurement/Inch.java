package com.thoughtworks.training.measurement;

public class Inch {
    private final int value;

    public Inch(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Inch) {
            Inch that = (Inch) object;
            return this.value == that.value;
        }
        return false;
    }
}
