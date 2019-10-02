package com.thoughtworks.training.measurement.temperature;

public class Fahrenheit implements Base {
    private final double conversionFactor = 1;

    @Override
    public double conversionToBase(double value) {
        return value * conversionFactor;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Fahrenheit;
    }

}
