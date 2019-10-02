package com.thoughtworks.training.measurement;

public class Quantity {
    private final double value;
    private final Unit Iunit;


    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Quantity) {
            Quantity that = (Quantity) other;

            if (!(this.Iunit.baseUnit().equals(that.Iunit.baseUnit()))) {
                return false;
            }
            return this.Iunit.conversionToBase(this.value) == that.Iunit.conversionToBase(that.value);
        }
        return false;
    }

    public Quantity add(Quantity other) {
        if (!Iunit.baseUnit().equals(other.Iunit.baseUnit())) {
            throw new IllegalArgumentException(this.Iunit + " and " + other.Iunit + " are incompactible quantities.");
        }
        return new Quantity(this.Iunit.conversionToBase(this.value) + other.Iunit.conversionToBase(other.value), Iunit.baseUnit());
    }

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.Iunit = unit;
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + Iunit +
                '}';
    }
}
