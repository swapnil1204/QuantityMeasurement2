package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MeasurementTest {

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity zeroFoot = new Quantity(0);
        Quantity anotherZeroFoot = new Quantity(0);

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }
}
