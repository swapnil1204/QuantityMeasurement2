package com.thoughtworks.training.measurement.weight;

import com.thoughtworks.training.measurement.Unit;

public class Gram implements Unit {

    private final double conversionFactor = 1;

    @Override
    public double conversionToBase(double value) {
        return value * conversionFactor;
    }

    @Override
    public Unit baseUnit() {
        return new Gram();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Gram;
    }

    @Override
    public String toString() {
        return "GRAM";
    }
}
