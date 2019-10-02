package com.thoughtworks.training.measurement.temperature;

import com.thoughtworks.training.measurement.Unit;

public class Celsius implements Unit {

    @Override
    public double conversionToBase(double value) {
        return (value * 9 / 5) + 32;
    }

    @Override
    public Unit baseUnit() {
        return new Celsius();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Celsius;
    }

}
