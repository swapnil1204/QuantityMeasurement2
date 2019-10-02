package com.thoughtworks.training.measurement.volume;

import com.thoughtworks.training.measurement.Unit;

public class Liter implements Unit {

    private final double conversionFactor = 1;

    @Override
    public double conversionToBase(double value) {
        return value * conversionFactor;
    }

    @Override
    public Unit baseUnit() {
        return new Liter();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Liter;
    }

    @Override
    public String toString() {
        return "LITER";
    }
}
