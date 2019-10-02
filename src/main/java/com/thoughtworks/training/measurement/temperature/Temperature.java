package com.thoughtworks.training.measurement.temperature;

public class Temperature {
    private final double value;
    private final Base unit;


    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Temperature) {
            Temperature that = (Temperature) other;

            return this.unit.conversionToBase(this.value) == that.unit.conversionToBase(that.value);
        }
        return false;
    }

    public Temperature(double value, Base unit) {
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
