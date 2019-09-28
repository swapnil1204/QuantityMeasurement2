package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FootTest {

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        Length zeroFoot = new Length(0);
        Length anotherZeroFoot = new Length(0);

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }

    @Test
    void givenZeroFootAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        Length zeroFoot = new Length(0);

        assertFalse(zeroFoot.equals(new Object()));
    }

    @Test
    void givenOneFootAndTwoFoot_WhenEquals_ThenShouldNotBeEqual() {

        Length oneFoot = new Length(1);
        Length twoFoot = new Length(2);

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenOneFootAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Length oneFoot = new Length(1);
        Length twoFoot = null;

        assertFalse(oneFoot.equals(twoFoot));
    }
}
