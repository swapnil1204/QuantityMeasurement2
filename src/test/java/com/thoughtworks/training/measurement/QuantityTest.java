package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Test;

import static com.thoughtworks.training.measurement.QuantityFactory.*;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    String halfMsg = " are incompactible quantities.";

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity zeroFoot = createFoot(0);
        Quantity anotherZeroFoot = createFoot(0);

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }

    @Test
    void givenZeroFootAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        Quantity zeroFoot = createFoot(0);

        assertFalse(zeroFoot.equals(new Object()));
    }

    @Test
    void givenOneFootAndTwoFoot_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = createFoot(1);
        Quantity twoFoot = createFoot(2);

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = createFoot(1);
        Quantity otherFoot = createFoot(1);

        assertEquals(oneFoot, otherFoot);
    }

    @Test
    void givenOneFootAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = createFoot(1);
        Quantity twoFoot = null;

        assertNotEquals(oneFoot, twoFoot);
    }

    @Test
    void givenZeroInch_WhenCompare_ThenShouldBeEqual() {
        Quantity zeroInch = createFoot(0);
        Quantity anotherZeroInch = createInch(0);

        assertEquals(zeroInch, anotherZeroInch);
    }

    @Test
    void givenZeroInchAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {
        Quantity zeroInch = createFoot(0);

        assertNotEquals(zeroInch, new Object());
    }

    @Test
    void givenOneInchAndOneInch_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = createFoot(1);
        Quantity otherFoot = createFoot(1);

        assertEquals(oneFoot, otherFoot);
    }

    @Test
    void givenOneInchAndTwoInch_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = createInch(1);
        Quantity twoInch = createInch(2);

        assertNotEquals(oneInch, twoInch);
    }

    @Test
    void givenOneInchAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = createInch(1);
        Quantity twoInch = null;

        assertNotEquals(oneInch, twoInch);
    }

    @Test
    void givenOneInchOneFoot_WhenEquals_ThenShouldNotBeEqual() {
        Quantity oneInch = createInch(1);
        Quantity oneFoot = createFoot(1);

        assertNotEquals(oneFoot, oneInch);
    }

    @Test
    void givenZeroInchZeroFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroInch = createInch(0);
        Quantity zeroFoot = createFoot(0);

        assertEquals(zeroFoot, zeroInch);
    }

    @Test
    void givenOneInchThreeFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = createInch(12);
        Quantity oneFoot = createFoot(1);

        assertEquals(oneFoot, twelveInch);
    }

    @Test
    void givenTwoFeetAndTwentyFourInch_WhenEquals_ThenShouldBeEqual() {
        Quantity twentyFourInch = createInch(24);
        Quantity twoFeet = createFoot(2);

        assertEquals(twoFeet, twentyFourInch);
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = createInch(12);
        Quantity oneFoot = createFoot(1);

        assertEquals(twelveInch, oneFoot);
    }

    @Test
    void givenZeroYardAndZeroYard_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroYard = createYard(0);
        Quantity anotherZeroYard = createYard(0);
        ;

        assertEquals(zeroYard, anotherZeroYard);
    }

    @Test
    void givenOneYardAndOneYard_WhenEquals_ThenShouldBeEqual() {
        Quantity oneYard = createYard(0);
        ;
        Quantity anotherOneYard = createYard(0);
        ;

        assertEquals(oneYard, anotherOneYard);
    }

    @Test
    void givenTwoYardAndSeventyTwoInches_WhenEquals_ThenShouldBeEqual() {
        Quantity oneYard = createYard(1);

        Quantity seventyTwoInches = createFoot(3);

        assertEquals(oneYard, seventyTwoInches);
    }

    @Test
    void givenZeroInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() {
        Quantity zeroInch = createInch(0);
        Quantity anotherZeroInch = createInch(0);

        assertEquals(createInch(0), zeroInch.add(anotherZeroInch));
    }

    @Test
    void givenTwoInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() {
        Quantity twoInch = createInch(2);
        Quantity anotherTwoInch = createInch(2);

        assertEquals(createInch(4), twoInch.add(anotherTwoInch));
    }

    @Test
    void givenOneFeetAndTwoInches_WhenAdd_ThenShouldBeFourInches() {
        Quantity OneFeet = createFoot(1);
        Quantity TwoInches = createInch(2);

        assertEquals(createInch(14), OneFeet.add(TwoInches));
    }

    @Test
    void givenTwoInchesAndOneFoott_WhenAdd_ThenShouldBeFourInches() {
        Quantity twoInches = createInch(2);
        Quantity oneFoot = createFoot(1);

        assertEquals(createInch(14), twoInches.add(oneFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenAdd_ThenShouldBeReturnTwoFoot() {
        Quantity oneFoot = createFoot(1);
        Quantity oneFoot1 = createFoot(1);

        assertEquals(createFoot(2), oneFoot.add(oneFoot1));
    }

    /*
    Next Requirement is 1 gallon = 3.78liters
    1 gallon + 1Liter= 4.78 Liters
     */
    @Test
    void givenOneGallonAndAnotherOneGallon_WhenAdd_ThenShouldBeReturn() {
        Quantity oneGallon = createGallon(1);
        Quantity anotherOneGallon = createGallon(1);

        assertEquals(oneGallon, anotherOneGallon);
    }

    @Test
    void givenOneLiterAndAnotherOneLiter_WhenEquals_ThenShouldBeReturn() {
        Quantity oneLiter = createLiter(1);
        Quantity anotherOneLiter = createLiter(1);

        assertEquals(oneLiter, anotherOneLiter);
    }

    @Test
    void givenOneLiterAndOneGallon_WhenAdd_ThenShouldBeReturnFalse() {
        Quantity oneLiter = createLiter(1);
        Quantity oneGallon = createGallon(1);

        assertNotEquals(oneLiter, oneGallon);
    }

    @Test
    void givenoneGallonAndOoneLiter_WhenAdd_ThenShouldBeReturnFalse() {
        Quantity oneGallon = createGallon(1);
        Quantity oneLiter = createLiter(1);

        assertNotEquals(oneGallon, oneLiter);
    }

    @Test
    void givenoneGallonAndanotherOneGallon_WhenAdd_ThenShouldBeReturnOneGallon() {
        Quantity oneGallon = createGallon(1);
        Quantity anotherOneGallon = createGallon(1);

        assertEquals(createGallon(2), oneGallon.add(anotherOneGallon));
    }

    @Test
    void givenOneLiterAndAnotherOneLiter_WhenAdd_ThenShouldBeReturnOneLiter() {
        Quantity oneLiter = createLiter(1);
        Quantity anotherOneLiter = createLiter(1);

        assertEquals(createLiter(2), oneLiter.add(anotherOneLiter));
    }

    @Test
    void givenOneLiterAndOneGallon_WhenAdd_ThenShouldBeReturnFourPointSevenEight() {
        Quantity oneGallon = createGallon(1);
        Quantity oneLiter = createLiter(1);

        assertEquals(createLiter(4.779999999999999), oneGallon.add(oneLiter));
    }

    @Test
    void givenOneLiterAndOneInch_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneLiter = createLiter(1);
        Quantity oneInch = createInch(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneLiter.add(oneInch);
        });
        assertEquals("LITER and INCH" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneInchAndOneLiter_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneInch = createInch(1);
        Quantity oneLiter = createLiter(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneLiter);
        });
        assertEquals("INCH and LITER" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneLiterAndOneFoot_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneLiter = createLiter(1);
        Quantity oneFoot = createFoot(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneLiter.add(oneFoot);
        });
        assertEquals("LITER and FOOT" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneFootAndOneLiter_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneFoot = createFoot(1);
        Quantity oneLiter = createLiter(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneLiter);
        });
        assertEquals("FOOT and LITER" + halfMsg, exception.getMessage());
    }


    @Test
    void givenOneInchAndOneGallon_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneInch = createInch(1);
        Quantity oneGallon = createGallon(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneGallon);
        });
        assertEquals("INCH and GALLON" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneGallonAndOneInch_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneGallon = createGallon(1);
        Quantity oneInch = createInch(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneInch);
        });
        assertEquals("GALLON and INCH" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneGallonAndOneFoot_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneGallon = createGallon(1);
        Quantity oneFoot = createFoot(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneFoot);
        });
        assertEquals("GALLON and FOOT" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneFootAndOneGallon_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneFoot = createFoot(1);
        Quantity oneGallon = createGallon(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneGallon);
        });
        assertEquals("FOOT and GALLON" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneYardAndOneLiter_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneYard = createYard(1);
        Quantity oneLiter = createLiter(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneYard.add(oneLiter);
        });
        assertEquals("YARD and LITER" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneYardAndOneLiter1_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneLiter = createLiter(1);
        Quantity oneYard = createYard(1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneLiter.add(oneYard);
        });
        assertEquals("LITER and YARD" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneGramAndAnotherOneGram_WhenEqual_ThenShouldBeEqual() {
        Quantity oneGram = createGram(1);
        Quantity anotherOneGram = createGram(1);

        assertEquals(oneGram, anotherOneGram);
    }

    @Test
    void givenOneGramAndOneInch_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneGram = createGram(1);
        Quantity oneInch = createInch(1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneGram.add(oneInch);
        });
        assertEquals("GRAM and INCH" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneGramAndOneLiter_WhenAdd_ThenShouldBeReturnException() {
        Quantity oneGram = createGram(1);
        Quantity oneLiter = createLiter(1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneGram.add(oneLiter);
        });
        assertEquals("GRAM and LITER" + halfMsg, exception.getMessage());
    }
}
