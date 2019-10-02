package com.thoughtworks.training.measurement.temperature;

import com.thoughtworks.training.measurement.Unit;

public class Celsius implements Unit {

    private final double conversionFactor = 1;

    @Override
    public double conversionToBase(double value) {
        return value * conversionFactor;
    }

    @Override
    public Unit baseUnit() {
        return new Celsius();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Celsius;
    }

    @Override
    public String toString() {
        return "CELSIUS";
    }
}
