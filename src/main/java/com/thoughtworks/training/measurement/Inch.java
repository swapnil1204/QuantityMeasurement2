package com.thoughtworks.training.measurement;

public class Inch implements Base{

    private final double conversionFactor = 1;

    @Override
    public double conversionToBase(double value) {
        return value * conversionFactor;
    }

    @Override
    public Base baseUnit() {
        return new Inch();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Inch;
    }

    @Override
    public String toString() {
        return "INCH";
    }
}
