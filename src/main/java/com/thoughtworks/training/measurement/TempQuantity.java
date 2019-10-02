package com.thoughtworks.training.measurement;

import com.thoughtworks.training.measurement.temperature.Base;

public class TempQuantity {
    protected double value;
    protected Unit unit;

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof TempQuantity) {
            TempQuantity that = (TempQuantity) other;

            return this.unit.conversionToBase(this.value) == that.unit.conversionToBase(that.value);
        }
        return false;
    }

    public TempQuantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }

}
