package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MeasurementTest {

    @Test
    void givenZeroFoot_WhenCompare_ThenShouldBeEqual() {

        Quantity zeroFoot = new Quantity(0);

        Assertions.assertTrue(zeroFoot.compare(zeroFoot));
    }

}
