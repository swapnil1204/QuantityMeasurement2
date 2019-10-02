package com.thoughtworks.training.measurement.length;

import com.thoughtworks.training.measurement.Unit;

public class Inch implements Unit {

    private final double conversionFactor = 1;

    @Override
    public double conversionToBase(double value) {
        return value * conversionFactor;
    }

    @Override
    public Unit baseUnit() {
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
