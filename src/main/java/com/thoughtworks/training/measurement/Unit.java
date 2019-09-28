package com.thoughtworks.training.measurement;

public enum Unit {
    //return value as it is
    INCH {
        @Override
        double conversionToBase(double value) {
            return value * 1;
        }
    },
    // convert value to inch and return
    FOOT {
        @Override
        double conversionToBase(double value) {
            return value * 12;
        }
    };

    abstract double conversionToBase(double value);
}
