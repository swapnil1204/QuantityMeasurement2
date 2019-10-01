package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    String halfMsg = " are incompactible quantities.";

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity zeroFoot = Quantity.createFoot(0);
        Quantity anotherZeroFoot = Quantity.createFoot(0);

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }

    @Test
    void givenZeroFootAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        Quantity zeroFoot =Quantity.createFoot(0);

        assertFalse(zeroFoot.equals(new Object()));
    }

    @Test
    void givenOneFootAndTwoFoot_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = Quantity.createFoot(1);
        Quantity twoFoot = Quantity.createFoot(2);

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = Quantity.createFoot(1);
        Quantity otherFoot = Quantity.createFoot(1);

        assertEquals(oneFoot, otherFoot);
    }

    @Test
    void givenOneFootAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = Quantity.createFoot(1);
        Quantity twoFoot = null;

        assertNotEquals(oneFoot, twoFoot);
    }

    @Test
    void givenZeroInch_WhenCompare_ThenShouldBeEqual() {
        Quantity zeroInch = Quantity.createFoot(0);
        Quantity anotherZeroInch = Quantity.createInch(0);

        assertEquals(zeroInch, anotherZeroInch);
    }

    @Test
    void givenZeroInchAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {
        Quantity zeroInch = Quantity.createFoot(0);

        assertNotEquals(zeroInch, new Object());
    }

    @Test
    void givenOneInchAndOneInch_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = Quantity.createFoot(1);
        Quantity otherFoot = Quantity.createFoot(1);

        assertEquals(oneFoot, otherFoot);
    }

    @Test
    void givenOneInchAndTwoInch_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = Quantity.createInch(1);
        Quantity twoInch = Quantity.createInch(2);

        assertNotEquals(oneInch, twoInch);
    }

    @Test
    void givenOneInchAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = Quantity.createInch(1);
        Quantity twoInch = null;

        assertNotEquals(oneInch, twoInch);
    }

    @Test
    void givenOneInchOneFoot_WhenEquals_ThenShouldNotBeEqual() {
        Quantity oneInch = Quantity.createInch(1);
        Quantity oneFoot = Quantity.createFoot(1);

        assertNotEquals(oneFoot, oneInch);
    }

    @Test
    void givenZeroInchZeroFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroInch = Quantity.createInch(0);
        Quantity zeroFoot = Quantity.createFoot(0);

        assertEquals(zeroFoot, zeroInch);
    }

    @Test
    void givenOneInchThreeFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = Quantity.createInch(12);
        Quantity oneFoot = Quantity.createFoot(1);

        assertEquals(oneFoot, twelveInch);
    }

    @Test
    void givenTwoFeetAndTwentyFourInch_WhenEquals_ThenShouldBeEqual() {
        Quantity twentyFourInch = Quantity.createInch(24);
        Quantity twoFeet = Quantity.createFoot(2);

        assertEquals(twoFeet, twentyFourInch);
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = Quantity.createInch(12);
        Quantity oneFoot = Quantity.createFoot(1);

        assertEquals(twelveInch, oneFoot);
    }

    @Test
    void givenZeroYardAndZeroYard_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroYard = Quantity.createYard(0);
        Quantity anotherZeroYard = Quantity.createYard(0);;

        assertEquals(zeroYard, anotherZeroYard);
    }

    @Test
    void givenOneYardAndOneYard_WhenEquals_ThenShouldBeEqual() {
        Quantity oneYard = Quantity.createYard(0);;
        Quantity anotherOneYard = Quantity.createYard(0);;

        assertEquals(oneYard, anotherOneYard);
    }

    @Test
    void givenTwoYardAndSeventyTwoInches_WhenEquals_ThenShouldBeEqual() {
        Quantity oneYard = Quantity.createYard(1);;
        Quantity seventyTwoInches = Quantity.createFoot(3);

        assertEquals(oneYard, seventyTwoInches);
    }

    @Test
    void givenZeroInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() {
        Quantity zeroInch = Quantity.createInch(0);
        Quantity anotherZeroInch = Quantity.createInch(0);

        assertEquals(Quantity.createInch(0), zeroInch.add(anotherZeroInch));
    }

    @Test
    void givenTwoInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() {
        Quantity twoInch = Quantity.createInch(2);
        Quantity anotherTwoInch = Quantity.createInch(2);

        assertEquals(Quantity.createInch(4), twoInch.add(anotherTwoInch));
    }

    @Test
    void givenOneFeetAndTwoInches_WhenAdd_ThenShouldBeFourInches() {
        Quantity OneFeet = Quantity.createFoot(1);
        Quantity TwoInches = Quantity.createInch(2);

        assertEquals(Quantity.createInch(14), OneFeet.add(TwoInches));
    }

    @Test
    void givenTwoInchesAndOneFoott_WhenAdd_ThenShouldBeFourInches() {
        Quantity twoInches = Quantity.createInch(2);
        Quantity oneFoot = Quantity.createFoot(1);

        assertEquals(Quantity.createInch(14), twoInches.add(oneFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenAdd_ThenShouldBeReturnTwoFoot() {
        Quantity oneFoot = Quantity.createFoot(1);
        Quantity oneFoot1 = Quantity.createFoot(1);

        assertEquals(Quantity.createFoot(2), oneFoot.add(oneFoot1));
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
        Quantity oneLiter = Quantity.createLiter(1);
        Quantity anotherOneLiter = Quantity.createLiter(1);

        assertEquals(oneLiter, anotherOneLiter);
    }

    @Test
    void givenOneLiterAndOneGallon_WhenAdd_ThenShouldBeReturnFalse() {
        Quantity oneLiter = Quantity.createLiter(1);
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);

        assertNotEquals(oneLiter, oneGallon);
    }

    @Test
    void givenoneGallonAndOoneLiter_WhenAdd_ThenShouldBeReturnFalse() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity oneLiter = Quantity.createLiter(1);

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
        Quantity oneLiter = Quantity.createLiter(1);
        Quantity anotherOneLiter = Quantity.createLiter(1);

        assertEquals(new Quantity(2.0, Unit.LITER), oneLiter.add(anotherOneLiter));
    }

    @Test
    void givenOneLiterAndOneGallon_WhenAdd_ThenShouldBeReturnFourPointSevenEight() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity oneLiter = Quantity.createLiter(1);

        assertEquals(Quantity.createLiter(4.779999999999999), oneGallon.add(oneLiter));
    }

    @Test
    void givenOneLiterAndOneInch_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneLiter = Quantity.createLiter(1);
        Quantity oneInch = new Quantity(1.0, Unit.INCH);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneLiter.add(oneInch);
        });
        assertEquals("LITER and INCH" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneInchAndOneLiter_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneInch = Quantity.createInch(1);
        Quantity oneLiter = Quantity.createLiter(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneLiter);
        });
        assertEquals("INCH and LITER" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneLiterAndOneFoot_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneLiter = Quantity.createLiter(1);
        Quantity oneFoot = Quantity.createFoot(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneLiter.add(oneFoot);
        });
        assertEquals("LITER and FOOT" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneFootAndOneLiter_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneFoot = Quantity.createFoot(1);
        Quantity oneLiter = Quantity.createLiter(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneLiter);
        });
        assertEquals("FOOT and LITER" + halfMsg, exception.getMessage());
    }


    @Test
    void givenOneInchAndOneGallon_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneInch = Quantity.createInch(1);
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneGallon);
        });
        assertEquals("INCH and GALLON" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneGallonAndOneInch_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity oneInch = Quantity.createInch(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneInch);
        });
        assertEquals("GALLON and INCH" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneGallonAndOneFoot_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity oneFoot = Quantity.createFoot(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneFoot);
        });
        assertEquals("GALLON and FOOT" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneFootAndOneGallon_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneFoot = Quantity.createFoot(1);
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneGallon);
        });
        assertEquals("FOOT and GALLON" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneYardAndOneLiter_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneYard = Quantity.createYard(1);
        Quantity oneLiter = Quantity.createLiter(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneYard.add(oneLiter);
        });
        assertEquals("YARD and LITER" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneYardAndOneLiter1_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneLiter = Quantity.createLiter(1);
        Quantity oneYard = Quantity.createYard(1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneLiter.add(oneYard);
        });
        assertEquals("LITER and YARD" + halfMsg, exception.getMessage());
    }
}
