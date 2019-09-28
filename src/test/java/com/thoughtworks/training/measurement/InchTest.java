package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InchTest {

    @Test
    void givenZeroInch_WhenCompare_ThenShouldBeEqual() {
        Inch zeroInch = new Inch(0);
        Inch anotherZeroInch = new Inch(0);

        assertTrue(zeroInch.equals(anotherZeroInch));
    }

    @Test
    void givenZeroInchAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {
        Inch zeroInch = new Inch(0);

        assertFalse(zeroInch.equals(new Object()));
    }

    @Test
    void givenOneInchAndTwoInch_WhenEquals_ThenShouldNotBeEqual() {

        Inch oneInch = new Inch(1);
        Inch twoInch = new Inch(2);

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Inch oneInch = new Inch(1);
        Inch twoInch = null;

        assertFalse(oneInch.equals(twoInch));
    }
}
