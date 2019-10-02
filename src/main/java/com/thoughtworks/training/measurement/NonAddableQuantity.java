package com.thoughtworks.training.measurement;

public class NonAddableQuantity {

    private final double value;
    private final Unit unit;

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

    public NonAddableQuantity(double value, Unit unit) {
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
