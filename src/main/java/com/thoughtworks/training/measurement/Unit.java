package com.thoughtworks.training.measurement;

public interface Unit {

    double conversionToBase(double value);

    Unit baseUnit();
}
