package com.thoughtworks.training.measurement;

public class Quantity {
    private final double value;
    private final Unit unit;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Quantity) {
            Quantity that = (Quantity) other;
            if (this.unit == Unit.INCH && that.unit == Unit.LITER || this.unit == Unit.LITER && that.unit == Unit.INCH) {
                return false;
            }
            return this.unit.conversionToBase(this.value) == that.unit.conversionToBase(that.value);
        }
        return false;
    }

    public Quantity add(Quantity other) {
        if (this.unit == Unit.LITER && other.unit == Unit.INCH || this.unit == Unit.INCH && other.unit == Unit.LITER ||
                this.unit == Unit.LITER && other.unit == Unit.FOOT || this.unit == Unit.FOOT && other.unit == Unit.LITER ||
                this.unit == Unit.GALLON && other.unit == Unit.INCH || this.unit == Unit.INCH && other.unit == Unit.GALLON  ||
                this.unit == Unit.GALLON && other.unit == Unit.FOOT || this.unit == Unit.FOOT && other.unit == Unit.GALLON ||
                this.unit == Unit.YARD && other.unit == Unit.LITER || this.unit == Unit.LITER && other.unit == Unit.YARD) {
            throw new IllegalArgumentException("these two quantities cannot be add");
        }
        if (unit == Unit.GALLON || unit == Unit.LITER)
            return new Quantity(this.unit.conversionToBase(this.value) + other.unit.conversionToBase(other.value), Unit.LITER);
        return new Quantity(this.unit.conversionToBase(this.value) + other.unit.conversionToBase(other.value), Unit.INCH);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
