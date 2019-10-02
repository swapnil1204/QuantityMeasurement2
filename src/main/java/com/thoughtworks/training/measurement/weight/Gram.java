package com.thoughtworks.training.measurement.weight;

import com.thoughtworks.training.measurement.Base;

public class Gram implements Base {

    private final double conversionFactor = 1;

    @Override
    public double conversionToBase(double value) {
        return value * conversionFactor;
    }

    @Override
    public Base baseUnit() {
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
