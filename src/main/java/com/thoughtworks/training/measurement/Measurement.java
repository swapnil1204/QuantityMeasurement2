package com.thoughtworks.training.measurement;

public class Measurement {

    private final int feet;
    private final int inch;

    public Measurement(int feet, int inch) {
        this.feet = feet;
        this.inch = inch;
    }

    public boolean compare() {
        return true;
    }
}
