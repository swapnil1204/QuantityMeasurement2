package com.thoughtworks.training.measurement;

public class Quantity {
    private final double value;
    private final Unit unit;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Quantity createFoot(double value) {
        return new Quantity(value, Unit.FOOT);
    }

    public static Quantity createInch(double value) {
        return new Quantity(value, Unit.INCH);
    }

    public static Quantity createYard(double value) {
        return new Quantity(value, Unit.YARD);
    }

    public static Quantity createLiter(double value) {
        return new Quantity(value, Unit.LITER);
    }

    public static Quantity createGallon(double value) {
        return new Quantity(value, Unit.GALLON);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Quantity) {
            Quantity that = (Quantity) other;

            if (unit.baseUnit() != that.unit.baseUnit()) {
                return false;
            }
            return this.unit.conversionToBase(this.value) == that.unit.conversionToBase(that.value);
        }
        return false;
    }

    public Quantity add(Quantity other) {
        if (!unit.baseUnit().equals(other.unit.baseUnit())) {
            throw new IllegalArgumentException(this.unit + " and " + other.unit + " are incompactible quantities.");
        }
        return new Quantity(this.unit.conversionToBase(this.value) + other.unit.conversionToBase(other.value), unit.baseUnit());
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
