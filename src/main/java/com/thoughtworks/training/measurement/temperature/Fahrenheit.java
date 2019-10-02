package com.thoughtworks.training.measurement.temperature;

import com.thoughtworks.training.measurement.Unit;

public class Fahrenheit implements Unit {

    private final double conversionFactor = 1;

    @Override
    public double conversionToBase(double value) {
        return value * conversionFactor ;
    }

    @Override
    public Unit baseUnit() {
        return new Fahrenheit();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Fahrenheit;
    }
}
