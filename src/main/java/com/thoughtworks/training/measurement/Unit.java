package com.thoughtworks.training.measurement;

public enum Unit {
    INCH(1,Measurement.LENGTH), FOOT(12, Measurement.LENGTH), YARD(36, Measurement.LENGTH),
    GALLON(3.78, Measurement.VOLUME), LITER(1, Measurement.VOLUME);

    private final Measurement type;
    private double conversionFactor;

    Unit(double conversionFactor, Measurement type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
    }

    double conversionToBase(double value) {
        return value * conversionFactor;
    }

    Unit baseUnit() {
        if(this.type == Measurement.LENGTH){
            return INCH;
        }
        return LITER;
    }

}
