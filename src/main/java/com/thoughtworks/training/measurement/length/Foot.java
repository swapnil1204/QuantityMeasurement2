package com.thoughtworks.training.measurement.length;

import com.thoughtworks.training.measurement.Base;

public class Foot implements Base {
    private final double conversionFactor = 12;

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
        return obj instanceof Foot;
    }

    @Override
    public String toString() {
        return "FOOT";
    }
}
