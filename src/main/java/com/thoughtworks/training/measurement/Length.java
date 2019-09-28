package com.thoughtworks.training.measurement;

public class Length {
    private final int value;
    private final Unit unit;
    private final int ONE_FEET_TO_INCH = 12;

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
            if(this.unit==Unit.inch) {
                int feet = this.value / ONE_FEET_TO_INCH;
                return feet == that.value;
            }
            int inches = this.value * ONE_FEET_TO_INCH;
            return inches == that.value;
        }
        return false;
    }


}