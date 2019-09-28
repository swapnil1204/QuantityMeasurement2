package com.thoughtworks.training.measurement;

public class Length {
    private final int value;

    public Length(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Length) {
            Length that = (Length) object;
            return this.value == that.value;
        }
        return false;
    }
}
