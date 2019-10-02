package com.thoughtworks.training.measurement.volume;

import com.thoughtworks.training.measurement.Base;

public class Gallon implements Base {

    private final double conversionFactor = 3.78;

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
        return obj instanceof Gallon;
    }

    @Override
    public String toString() {
        return "GALLON";
    }
}
