package com.thoughtworks.training.measurement;

public class AddableQuantity {
    private final double value;
    private final Unit unit;

    public AddableQuantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof AddableQuantity) {
            AddableQuantity that = (AddableQuantity) other;

            if (!(this.unit.baseUnit().equals(that.unit.baseUnit()))) {
                return false;
            }
            return this.unit.conversionToBase(this.value) == that.unit.conversionToBase(that.value);
        }
        return false;
    }

    public AddableQuantity add(AddableQuantity other) {
        if (!unit.baseUnit().equals(other.unit.baseUnit())) {
            throw new IllegalArgumentException(this.unit + " and " + other.unit + " are incompactible quantities.");
        }
        return new AddableQuantity(this.unit.conversionToBase(this.value) + other.unit.conversionToBase(other.value), unit.baseUnit());
    }

    @Override
    public String toString() {
        return "AddableQuantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
