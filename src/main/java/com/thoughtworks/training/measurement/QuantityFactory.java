package com.thoughtworks.training.measurement;

import com.thoughtworks.training.measurement.length.Foot;
import com.thoughtworks.training.measurement.length.Inch;
import com.thoughtworks.training.measurement.length.Yard;
import com.thoughtworks.training.measurement.temperature.Celsius;
import com.thoughtworks.training.measurement.temperature.Fahrenheit;
import com.thoughtworks.training.measurement.volume.Gallon;
import com.thoughtworks.training.measurement.volume.Liter;
import com.thoughtworks.training.measurement.weight.Gram;
import com.thoughtworks.training.measurement.weight.KiloGram;

public class QuantityFactory {

    public static AddableQuantity createFoot(double value) {
        return new AddableQuantity(value, new Foot());
    }

    public static AddableQuantity createInch(double value) {
        return new AddableQuantity(value, new Inch());
    }

    public static AddableQuantity createYard(double value) { return new AddableQuantity(value, new Yard()); }

    public static AddableQuantity createLiter(double value) { return new AddableQuantity(value, new Liter()); }

    public static AddableQuantity createGallon(double value) {
        return new AddableQuantity(value, new Gallon());
    }

    public static AddableQuantity createGram(double value) { return new AddableQuantity(value, new Gram()); }

    public static AddableQuantity createKiloGram(double value) { return new AddableQuantity(value, new KiloGram()); }

    public static NonAddableQuantity createCelcius(double value) { return new NonAddableQuantity(value, new Celsius()); }

    public static NonAddableQuantity createFahrenheit(double value) { return new NonAddableQuantity(value, new Fahrenheit()); }
}

