package com.thoughtworks.training.measurement;

public enum Unit {
    INCH(1, Measurement.LENGTH), FOOT(12, Measurement.LENGTH, INCH), YARD(36, Measurement.LENGTH, INCH),
    LITER(1, Measurement.VOLUME), GALLON(3.78, Measurement.VOLUME, LITER);

    private final Unit unit;
    private Measurement type;
    private double conversionFactor;

    Unit(double conversionFactor, Measurement type, Unit baseUnit) {
        this.conversionFactor = conversionFactor;
        this.type = type;
        this.unit = baseUnit;
    }

    Unit(double conversionFactor, Measurement type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
        unit = this;
    }

    double conversionToBase(double value) {
        return value * conversionFactor;
    }

    //Unit telling which is baseUnit of quantity i.e it is immutable
    Unit baseUnit() {
        return unit;
    }
}
