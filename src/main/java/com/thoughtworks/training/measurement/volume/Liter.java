package com.thoughtworks.training.measurement.volume;

import com.thoughtworks.training.measurement.Base;

public class Liter implements Base {

    private final double conversionFactor = 1;

    @Override
    public double conversionToBase(double value) {
        return value * conversionFactor;
    }

    @Override
    public Base baseUnit() {
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
