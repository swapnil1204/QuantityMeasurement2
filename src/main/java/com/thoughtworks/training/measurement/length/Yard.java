package com.thoughtworks.training.measurement.length;

import com.thoughtworks.training.measurement.Base;

public class Yard implements Base {

    private final double conversionFactor = 36;

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
        return obj instanceof Yard;
    }

    @Override
    public String toString() {
        return "YARD";
    }
}
