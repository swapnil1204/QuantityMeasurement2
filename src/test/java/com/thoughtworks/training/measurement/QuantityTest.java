package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    String halfMsg = " are incompactible quantities.";

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity zeroFoot = new Quantity(0, Unit.FOOT);
        Quantity anotherZeroFoot = new Quantity(0, Unit.FOOT);

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }

    @Test
    void givenZeroFootAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        Quantity zeroFoot = new Quantity(0, Unit.FOOT);

        assertFalse(zeroFoot.equals(new Object()));
    }

    @Test
    void givenOneFootAndTwoFoot_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = new Quantity(1, Unit.FOOT);
        Quantity twoFoot = new Quantity(2, Unit.FOOT);

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);
        Quantity otherFoot = new Quantity(1.0, Unit.FOOT);

        assertEquals(oneFoot, otherFoot);
    }

    @Test
    void givenOneFootAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = new Quantity(1, Unit.FOOT);
        Quantity twoFoot = null;

        assertNotEquals(oneFoot, twoFoot);
    }

    @Test
    void givenZeroInch_WhenCompare_ThenShouldBeEqual() {
        Quantity zeroInch = new Quantity(0, Unit.INCH);
        Quantity anotherZeroInch = new Quantity(0, Unit.INCH);

        assertEquals(zeroInch, anotherZeroInch);
    }

    @Test
    void givenZeroInchAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {
        Quantity zeroInch = new Quantity(0, Unit.INCH);

        assertNotEquals(zeroInch, new Object());
    }

    @Test
    void givenOneInchAndOneInch_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = new Quantity(1, Unit.FOOT);
        Quantity otherFoot = new Quantity(1, Unit.FOOT);

        assertEquals(oneFoot, otherFoot);
    }

    @Test
    void givenOneInchAndTwoInch_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = new Quantity(1, Unit.INCH);
        Quantity twoInch = new Quantity(2, Unit.INCH);

        assertNotEquals(oneInch, twoInch);
    }

    @Test
    void givenOneInchAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = new Quantity(1, Unit.INCH);
        Quantity twoInch = null;

        assertNotEquals(oneInch, twoInch);
    }

    @Test
    void givenOneInchOneFoot_WhenEquals_ThenShouldNotBeEqual() {
        Quantity oneInch = new Quantity(1, Unit.INCH);
        Quantity oneFoot = new Quantity(1, Unit.FOOT);

        assertNotEquals(oneFoot, oneInch);
    }

    @Test
    void givenZeroInchZeroFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroInch = new Quantity(0, Unit.INCH);
        Quantity zeroFoot = new Quantity(0, Unit.FOOT);

        assertEquals(zeroFoot, zeroInch);
    }

    @Test
    void givenOneInchThreeFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = new Quantity(12, Unit.INCH);
        Quantity oneFoot = new Quantity(1, Unit.FOOT);

        assertEquals(oneFoot, twelveInch);
    }

    @Test
    void givenTwoFeetAndTwentyFourInch_WhenEquals_ThenShouldBeEqual() {
        Quantity twentyFourInch = new Quantity(24, Unit.INCH);
        Quantity twoFeet = new Quantity(2, Unit.FOOT);

        assertEquals(twoFeet, twentyFourInch);
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = new Quantity(12, Unit.INCH);
        Quantity oneFoot = new Quantity(1, Unit.FOOT);

        assertEquals(twelveInch, oneFoot);
    }

    @Test
    void givenZeroYardAndZeroYard_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroYard = new Quantity(0, Unit.YARD);
        Quantity anotherZeroYard = new Quantity(0, Unit.YARD);

        assertEquals(zeroYard, anotherZeroYard);
    }

    @Test
    void givenOneYardAndOneYard_WhenEquals_ThenShouldBeEqual() {
        Quantity oneYard = new Quantity(1, Unit.YARD);
        Quantity anotherOneYard = new Quantity(1, Unit.YARD);

        assertEquals(oneYard, anotherOneYard);
    }

    @Test
    void givenTwoYardAndSeventyTwoInches_WhenEquals_ThenShouldBeEqual() {
        Quantity oneYard = new Quantity(1, Unit.YARD);
        Quantity seventyTwoInches = new Quantity(3, Unit.FOOT);

        assertEquals(oneYard, seventyTwoInches);
    }

    @Test
    void givenZeroInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() {
        Quantity zeroInch = new Quantity(0.0, Unit.INCH);
        Quantity anotherZeroInch = new Quantity(0.0, Unit.INCH);

        assertEquals(new Quantity(0.0, Unit.INCH), zeroInch.add(anotherZeroInch));
    }

    @Test
    void givenTwoInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() {
        Quantity twoInch = new Quantity(2.0, Unit.INCH);
        Quantity anotherTwoInch = new Quantity(2.0, Unit.INCH);

        assertEquals(new Quantity(4.0, Unit.INCH), twoInch.add(anotherTwoInch));
    }

    @Test
    void givenOneFeetAndTwoInches_WhenAdd_ThenShouldBeFourInches() {
        Quantity OneFeet = new Quantity(1.0, Unit.FOOT);
        Quantity TwoInches = new Quantity(2.0, Unit.INCH);

        assertEquals(new Quantity(14.0, Unit.INCH), OneFeet.add(TwoInches));
    }

    @Test
    void givenTwoInchesAndOneFoott_WhenAdd_ThenShouldBeFourInches() {
        Quantity twoInches = new Quantity(2.0, Unit.INCH);
        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);

        assertEquals(new Quantity(14.0, Unit.INCH), twoInches.add(oneFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenAdd_ThenShouldBeReturnTwoFoot() {
        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);
        Quantity oneFoot1 = new Quantity(1.0, Unit.FOOT);

        assertEquals(new Quantity(2.0, Unit.FOOT), oneFoot.add(oneFoot1));
    }

    /*
    Next Requirement is 1 gallon = 3.78liters
    1 gallon + 1Liter= 4.78 Liters
     */
    @Test
    void givenOneGallonAndAnotherOneGallon_WhenAdd_ThenShouldBeReturn() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity anotherOneGallon = new Quantity(1.0, Unit.GALLON);

        assertEquals(oneGallon, anotherOneGallon);
    }

    @Test
    void givenOneLiterAndAnotherOneLiter_WhenEquals_ThenShouldBeReturn() {
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);
        Quantity anotherOneLiter = new Quantity(1.0, Unit.LITER);

        assertEquals(oneLiter, anotherOneLiter);
    }

    @Test
    void givenOneLiterAndOneGallon_WhenAdd_ThenShouldBeReturnFalse() {
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);

        assertNotEquals(oneLiter, oneGallon);
    }

    @Test
    void givenoneGallonAndOoneLiter_WhenAdd_ThenShouldBeReturnFalse() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);

        assertNotEquals(oneGallon, oneLiter);
    }

    @Test
    void givenoneGallonAndanotherOneGallon_WhenAdd_ThenShouldBeReturnOneGallon() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity anotherOneGallon = new Quantity(1.0, Unit.GALLON);

        assertEquals(new Quantity(2.0, Unit.GALLON), oneGallon.add(anotherOneGallon));
    }

    @Test
    void givenOneLiterAndAnotherOneLiter_WhenAdd_ThenShouldBeReturnOneLiter() {
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);
        Quantity anotherOneLiter = new Quantity(1.0, Unit.LITER);

        assertEquals(new Quantity(2.0, Unit.LITER), oneLiter.add(anotherOneLiter));
    }

    @Test
    void givenOneLiterAndOneGallon_WhenAdd_ThenShouldBeReturnFourPointSevenEight() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);

        assertEquals(new Quantity(4.779999999999999, Unit.LITER), oneGallon.add(oneLiter));
    }

    @Test
    void givenOneLiterAndOneInch_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);
        Quantity oneInch = new Quantity(1.0, Unit.INCH);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneLiter.add(oneInch);
        });
        assertEquals("LITER and INCH" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneInchAndOneLiter_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneInch = new Quantity(1.0, Unit.INCH);
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneLiter);
        });
        assertEquals("INCH and LITER" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneLiterAndOneFoot_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);
        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneLiter.add(oneFoot);
        });
        assertEquals("LITER and FOOT" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneFootAndOneLiter_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneLiter);
        });
        assertEquals("FOOT and LITER" + halfMsg, exception.getMessage());
    }


    @Test
    void givenOneInchAndOneGallon_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneInch = new Quantity(1.0, Unit.INCH);
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneGallon);
        });
        assertEquals("INCH and GALLON" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneGallonAndOneInch_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity oneInch = new Quantity(1.0, Unit.INCH);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneInch);
        });
        assertEquals("GALLON and INCH" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneGallonAndOneFoot_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneFoot);
        });
        assertEquals("GALLON and FOOT" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneFootAndOneGallon_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneGallon);
        });
        assertEquals("FOOT and GALLON" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneYardAndOneLiter_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneYard = new Quantity(1.0, Unit.YARD);
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneYard.add(oneLiter);
        });
        assertEquals("YARD and LITER" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneYardAndOneLiter1_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);
        Quantity oneYard = new Quantity(1.0, Unit.YARD);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneLiter.add(oneYard);
        });
        assertEquals("LITER and YARD" + halfMsg, exception.getMessage());
    }
}
