package com.thoughtworks.training.measurement;

public class QuantityFactory {
    public static Quantity createFoot(double value) {
        return new Quantity(value, Unit.FOOT);
    }

    public static Quantity createInch(double value) {
        return new Quantity(value, Unit.INCH);
    }

    public static Quantity createYard(double value) {
        return new Quantity(value, Unit.YARD);
    }

    public static Quantity createLiter(double value) {
        return new Quantity(value, Unit.LITER);
    }

    public static Quantity createGallon(double value) {
        return new Quantity(value, Unit.GALLON);
    }

}
