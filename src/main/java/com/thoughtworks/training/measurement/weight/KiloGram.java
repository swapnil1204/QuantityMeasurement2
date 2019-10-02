package com.thoughtworks.training.measurement.weight;

import com.thoughtworks.training.measurement.Unit;

public class KiloGram implements Unit {

    private final double conversionFactor = 1000;

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
        return obj instanceof KiloGram;
    }

    @Override
    public String toString() {
        return "KILOGRAM";
    }
}
