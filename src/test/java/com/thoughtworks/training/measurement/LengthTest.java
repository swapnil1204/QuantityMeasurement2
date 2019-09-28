package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        Length zeroFoot = new Length(0, Unit.foot);
        Length anotherZeroFoot = new Length(0, Unit.foot);

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }

    @Test
    void givenZeroFootAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        Length zeroFoot = new Length(0, Unit.foot);

        assertFalse(zeroFoot.equals(new Object()));
    }

    @Test
    void givenOneFootAndTwoFoot_WhenEquals_ThenShouldNotBeEqual() {

        Length oneFoot = new Length(1, Unit.foot);
        Length twoFoot = new Length(2, Unit.foot);

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenOneFootAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Length oneFoot = new Length(1, Unit.foot);
        Length twoFoot = null;

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenZeroInch_WhenCompare_ThenShouldBeEqual() {
        Length zeroInch = new Length(0, Unit.inch);
        Length anotherZeroInch = new Length(0, Unit.inch);

        assertTrue(zeroInch.equals(anotherZeroInch));
    }

    @Test
    void givenZeroInchAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {
        Length zeroInch = new Length(0, Unit.inch);

        assertFalse(zeroInch.equals(new Object()));
    }

    @Test
    void givenOneInchAndTwoInch_WhenEquals_ThenShouldNotBeEqual() {

        Length oneInch = new Length(1, Unit.inch);
        Length twoInch = new Length(2, Unit.inch);

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Length oneInch = new Length(1, Unit.inch);
        Length twoInch = null;

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchOneFoot_WhenEquals_ThenShouldNotBeEqual(){
        Length oneInch = new Length(1, Unit.inch);
        Length oneFoot = new Length(1, Unit.foot);

        assertFalse(oneFoot.equals(oneInch));
    }

    @Test
    void givenZeroInchZeroFoot_WhenEquals_ThenShouldBeEqual(){
        Length zeroInch = new Length(0, Unit.inch);
        Length zeroFoot = new Length(0, Unit.foot);

        assertTrue(zeroFoot.equals(zeroInch));
    }
}
