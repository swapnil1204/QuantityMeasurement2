package com.thoughtworks.training.measurement;

import com.thoughtworks.training.measurement.temperature.Base;

public class NonAddableQuantity {

    private final double value;
    private final Base unit;

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof NonAddableQuantity) {
            NonAddableQuantity that = (NonAddableQuantity) other;

            return this.unit.conversionToBase(this.value) == that.unit.conversionToBase(that.value);
        }
        return false;
    }

    public NonAddableQuantity(double value, Base unit) {
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
