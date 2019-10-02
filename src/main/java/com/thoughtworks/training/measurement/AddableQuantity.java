package com.thoughtworks.training.measurement;

public class AddableQuantity extends NonAddableQuantity {
    private final double value;
    private final Unit unit;

    public AddableQuantity(double value, Unit unit) {
        super(value,unit);
        this.value = value;
        this.unit = unit;
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
