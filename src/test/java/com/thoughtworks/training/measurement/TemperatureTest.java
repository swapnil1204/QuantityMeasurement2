package com.thoughtworks.training.measurement;

import com.thoughtworks.training.measurement.temperature.Temperature;
import org.junit.jupiter.api.Test;

import static com.thoughtworks.training.measurement.QuantityFactory.createCelcius;
import static com.thoughtworks.training.measurement.QuantityFactory.createFahrenheit;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureTest {
    @Test
    void givenOneCelsiusAndOneCelsius_WhenEquals_ThenShouldBeEqual() {
        Temperature oneCelsius = createCelcius(1);
        Temperature anotherOneCelsius = createCelcius(1);

        assertEquals(oneCelsius, anotherOneCelsius);
    }

    @Test
    void givenOneFahrenheitAndOneFahrenheit_WhenEquals_ThenShouldBeEqual() {
        Temperature oneFahrenheit = createFahrenheit(1);
        Temperature anotherOneFahrenheit = createFahrenheit(1);

        assertEquals(oneFahrenheit, anotherOneFahrenheit);
    }

    @Test
    void givenZeroCelciusAndThirtyTwoFahrenheit_WhenEquals_ThenShouldBeEqual() {
        Temperature ZeroCelsius = createCelcius(0);
        Temperature thirtyTwoFahrenheit = createFahrenheit(32);

        assertEquals(ZeroCelsius, thirtyTwoFahrenheit);
    }

    @Test
    void givenTwoCelsiusAndThirtyFivePointSix_WhenEquals_ThenShouldBeEqual() {
        Temperature oneCelsius = createCelcius(2);
        Temperature thirtyTwoFahrenheit = createFahrenheit(35.6);

        assertEquals(oneCelsius, thirtyTwoFahrenheit);
    }
}
