package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MeasurementTest {

    @Test
    void givenFeetAndInchZero_WhenCompare_ThenShouldReturnZero() {
        Measurement measurement=new Measurement(0,0);
        Assertions.assertTrue(measurement.compare());
    }
}
