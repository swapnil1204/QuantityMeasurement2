package com.thoughtworks.training.measurement;

public class QuantityFactory {
    public static Quantity createFoot(double value) {
        return new Quantity(value, new Foot());
    }

    public static Quantity createInch(double value) {
        return new Quantity(value, new Inch());
    }

    public static Quantity createYard(double value) {
        return new Quantity(value, new Yard());
    }

    public static Quantity createLiter(double value) {
        return new Quantity(value, new Liter());
    }

    public static Quantity createGallon(double value) {
        return new Quantity(value, new Gallon());
    }

}
