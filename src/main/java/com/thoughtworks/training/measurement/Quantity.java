package com.thoughtworks.training.measurement;

public class Quantity {
    private final double value;
    private final Unit unit;
    private IUnit unitInterface;

    public Quantity(double value, Unit unit, IUnit unitInterface) {
        this.value = value;
        this.unit = unit;
        this.unitInterface = unitInterface;
    }

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Quantity createFoot(double value) {
        return new Quantity(value, Unit.FOOT);
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
            throw new IllegalArgumentException(this.unit+" and "+other.unit+" are incompactible quantities.");
        }
        return new Quantity(this.unit.conversionToBase(this.value) + other.unit.conversionToBase(other.value), unit.baseUnit(), unitInterface);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
