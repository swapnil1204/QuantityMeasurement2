package com.thoughtworks.training.measurement;

public class Length {
    private final int value;
    private final Unit unit;

    public Length(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object instanceof Length) {
            Length that = (Length) object;
            int inches = this.value * 12;
            return inches == that.value;
        }
        return false;
    }

}