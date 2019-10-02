package com.thoughtworks.training.measurement.temperature;

public class Celsius implements Base {

    @Override
    public double conversionToBase(double value) {
        return (value * 9 / 5) + 32;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Celsius;
    }

}
