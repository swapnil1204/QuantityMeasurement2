package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Test;

import static com.thoughtworks.training.measurement.QuantityFactory.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureTest {
    @Test
    void givenOneCelsiusAndOneCelsius_WhenEquals_ThenShouldBeEqual() {
        NonAddableQuantity oneCelsius = createCelcius(1);
        NonAddableQuantity anotherOneCelsius = createCelcius(1);

        assertEquals(oneCelsius, anotherOneCelsius);
    }

    @Test
    void givenOneFahrenheitAndOneFahrenheit_WhenEquals_ThenShouldBeEqual() {
        NonAddableQuantity oneFahrenheit = createFahrenheit(1);
        NonAddableQuantity anotherOneFahrenheit = createFahrenheit(1);

        assertEquals(oneFahrenheit, anotherOneFahrenheit);
    }

    @Test
    void givenZeroCelciusAndThirtyTwoFahrenheit_WhenEquals_ThenShouldBeEqual() {
        NonAddableQuantity ZeroCelsius = createCelcius(0);
        NonAddableQuantity thirtyTwoFahrenheit = createFahrenheit(32);

        assertEquals(ZeroCelsius, thirtyTwoFahrenheit);
    }

    @Test
    void givenTwoCelsiusAndThirtyFivePointSix_WhenEquals_ThenShouldBeEqual() {
        NonAddableQuantity oneCelsius = createCelcius(2);
        NonAddableQuantity thirtyTwoFahrenheit = createFahrenheit(35.6);

        assertEquals(oneCelsius, thirtyTwoFahrenheit);
    }
}
