package com.thoughtworks.training.measurement;

public class AddableQuantity {
    private final double value;
    private final Unit Iunit;

    public AddableQuantity(double value, Unit iunit) {
        this.value = value;
        Iunit = iunit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof AddableQuantity) {
            AddableQuantity that = (AddableQuantity) other;

            if (!(this.Iunit.baseUnit().equals(that.Iunit.baseUnit()))) {
                return false;
            }
            return this.Iunit.conversionToBase(this.value) == that.Iunit.conversionToBase(that.value);
        }
        return false;
    }

    public AddableQuantity add(AddableQuantity other) {
        if (!Iunit.baseUnit().equals(other.Iunit.baseUnit())) {
            throw new IllegalArgumentException(this.Iunit + " and " + other.Iunit + " are incompactible quantities.");
        }
        return new AddableQuantity(this.Iunit.conversionToBase(this.value) + other.Iunit.conversionToBase(other.value), Iunit.baseUnit());
    }

    @Override
    public String toString() {
        return "AddableQuantity{" +
                "value=" + value +
                ", unit=" + Iunit +
                '}';
    }
}
