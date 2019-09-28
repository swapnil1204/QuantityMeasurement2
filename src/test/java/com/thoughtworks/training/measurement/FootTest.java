package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FootTest {

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        Foot zeroFoot = new Foot(0);
        Foot anotherZeroFoot = new Foot(0);

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }

    @Test
    void givenZeroFootAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        Foot zeroFoot = new Foot(0);

        assertFalse(zeroFoot.equals(new Object()));
    }

    @Test
    void givenOneFootAndTwoFoot_WhenEquals_ThenShouldNotBeEqual() {

        Foot oneFoot = new Foot(1);
        Foot twoFoot = new Foot(2);

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenOneFootAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Foot oneFoot = new Foot(1);
        Foot twoFoot = null;

        assertFalse(oneFoot.equals(twoFoot));
    }
}
