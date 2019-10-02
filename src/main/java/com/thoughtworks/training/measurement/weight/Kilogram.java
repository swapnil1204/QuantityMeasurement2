package com.thoughtworks.training.measurement.weight;

import com.thoughtworks.training.measurement.Base;

public class Kilogram implements Base {

    private final double conversionFactor = 1000;

    @Override
    public double conversionToBase(double value) {
        return value * conversionFactor;
    }

    @Override
    public Base baseUnit() {
        return new Gram();
    }
}
