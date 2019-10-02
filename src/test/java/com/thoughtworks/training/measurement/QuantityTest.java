package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Test;

import static com.thoughtworks.training.measurement.QuantityFactory.*;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    String halfMsg = " are incompactible quantities.";

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        AddableQuantity zeroFoot = createFoot(0);
        AddableQuantity anotherZeroFoot = createFoot(0);

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }

    @Test
    void givenZeroFootAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity zeroFoot = createFoot(0);

        assertFalse(zeroFoot.equals(new Object()));
    }

    @Test
    void givenOneFootAndTwoFoot_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity oneFoot = createFoot(1);
        AddableQuantity twoFoot = createFoot(2);

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenEquals_ThenShouldBeEqual() {

        AddableQuantity oneFoot = createFoot(1);
        AddableQuantity otherFoot = createFoot(1);

        assertEquals(oneFoot, otherFoot);
    }

    @Test
    void givenOneFootAndNull_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity oneFoot = createFoot(1);
        AddableQuantity twoFoot = null;

        assertNotEquals(oneFoot, twoFoot);
    }

    @Test
    void givenZeroInch_WhenCompare_ThenShouldBeEqual() {
        AddableQuantity zeroInch = createFoot(0);
        AddableQuantity anotherZeroInch = createInch(0);

        assertEquals(zeroInch, anotherZeroInch);
    }

    @Test
    void givenZeroInchAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {
        AddableQuantity zeroInch = createFoot(0);

        assertNotEquals(zeroInch, new Object());
    }

    @Test
    void givenOneInchAndOneInch_WhenEquals_ThenShouldBeEqual() {

        AddableQuantity oneFoot = createFoot(1);
        AddableQuantity otherFoot = createFoot(1);

        assertEquals(oneFoot, otherFoot);
    }

    @Test
    void givenOneInchAndTwoInch_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity oneInch = createInch(1);
        AddableQuantity twoInch = createInch(2);

        assertNotEquals(oneInch, twoInch);
    }

    @Test
    void givenOneInchAndNull_WhenEquals_ThenShouldNotBeEqual() {

        AddableQuantity oneInch = createInch(1);
        AddableQuantity twoInch = null;

        assertNotEquals(oneInch, twoInch);
    }

    @Test
    void givenOneInchOneFoot_WhenEquals_ThenShouldNotBeEqual() {
        AddableQuantity oneInch = createInch(1);
        AddableQuantity oneFoot = createFoot(1);

        assertNotEquals(oneFoot, oneInch);
    }

    @Test
    void givenZeroInchZeroFoot_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity zeroInch = createInch(0);
        AddableQuantity zeroFoot = createFoot(0);

        assertEquals(zeroFoot, zeroInch);
    }

    @Test
    void givenOneInchThreeFoot_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity twelveInch = createInch(12);
        AddableQuantity oneFoot = createFoot(1);

        assertEquals(oneFoot, twelveInch);
    }

    @Test
    void givenTwoFeetAndTwentyFourInch_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity twentyFourInch = createInch(24);
        AddableQuantity twoFeet = createFoot(2);

        assertEquals(twoFeet, twentyFourInch);
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity twelveInch = createInch(12);
        AddableQuantity oneFoot = createFoot(1);

        assertEquals(twelveInch, oneFoot);
    }

    @Test
    void givenZeroYardAndZeroYard_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity zeroYard = createYard(0);
        AddableQuantity anotherZeroYard = createYard(0);
        ;

        assertEquals(zeroYard, anotherZeroYard);
    }

    @Test
    void givenOneYardAndOneYard_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity oneYard = createYard(0);
        AddableQuantity anotherOneYard = createYard(0);

        assertEquals(oneYard, anotherOneYard);
    }

    @Test
    void givenTwoYardAndSeventyTwoInches_WhenEquals_ThenShouldBeEqual() {
        AddableQuantity oneYard = createYard(1);

        AddableQuantity seventyTwoInches = createFoot(3);

        assertEquals(oneYard, seventyTwoInches);
    }

    @Test
    void givenZeroInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() {
        AddableQuantity zeroInch = createInch(0);
        AddableQuantity anotherZeroInch = createInch(0);

        assertEquals(createInch(0), zeroInch.add(anotherZeroInch));
    }

    @Test
    void givenTwoInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() {
        AddableQuantity twoInch = createInch(2);
        AddableQuantity anotherTwoInch = createInch(2);

        assertEquals(createInch(4), twoInch.add(anotherTwoInch));
    }

    @Test
    void givenOneFeetAndTwoInches_WhenAdd_ThenShouldBeFourInches() {
        AddableQuantity OneFeet = createFoot(1);
        AddableQuantity TwoInches = createInch(2);

        assertEquals(createInch(14), OneFeet.add(TwoInches));
    }

    @Test
    void givenTwoInchesAndOneFoott_WhenAdd_ThenShouldBeFourInches() {
        AddableQuantity twoInches = createInch(2);
        AddableQuantity oneFoot = createFoot(1);

        assertEquals(createInch(14), twoInches.add(oneFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenAdd_ThenShouldBeReturnTwoFoot() {
        AddableQuantity oneFoot = createFoot(1);
        AddableQuantity oneFoot1 = createFoot(1);

        assertEquals(createFoot(2), oneFoot.add(oneFoot1));
    }

//    /*
//    Next Requirement is 1 gallon = 3.78liters
//    1 gallon + 1Liter= 4.78 Liters
//     */
    @Test
    void givenOneGallonAndAnotherOneGallon_WhenAdd_ThenShouldBeReturn() {
        AddableQuantity oneGallon = createGallon(1);
        AddableQuantity anotherOneGallon = createGallon(1);

        assertEquals(oneGallon, anotherOneGallon);
    }

    @Test
    void givenOneLiterAndAnotherOneLiter_WhenEquals_ThenShouldBeReturn() {
        AddableQuantity oneLiter = createLiter(1);
        AddableQuantity anotherOneLiter = createLiter(1);

        assertEquals(oneLiter, anotherOneLiter);
    }

    @Test
    void givenOneLiterAndOneGallon_WhenAdd_ThenShouldBeReturnFalse() {
        AddableQuantity oneLiter = createLiter(1);
        AddableQuantity oneGallon = createGallon(1);

        assertNotEquals(oneLiter, oneGallon);
    }

    @Test
    void givenoneGallonAndOoneLiter_WhenAdd_ThenShouldBeReturnFalse() {
        AddableQuantity oneGallon = createGallon(1);
        AddableQuantity oneLiter = createLiter(1);

        assertNotEquals(oneGallon, oneLiter);
    }

    @Test
    void givenoneGallonAndanotherOneGallon_WhenAdd_ThenShouldBeReturnOneGallon() {
        AddableQuantity oneGallon = createGallon(1);
        AddableQuantity anotherOneGallon = createGallon(1);

        assertEquals(createGallon(2), oneGallon.add(anotherOneGallon));
    }

    @Test
    void givenOneLiterAndAnotherOneLiter_WhenAdd_ThenShouldBeReturnOneLiter() {
        AddableQuantity oneLiter = createLiter(1);
        AddableQuantity anotherOneLiter = createLiter(1);

        assertEquals(createLiter(2), oneLiter.add(anotherOneLiter));
    }

    @Test
    void givenOneLiterAndOneGallon_WhenAdd_ThenShouldBeReturnFourPointSevenEight() {
        AddableQuantity oneGallon = createGallon(1);
        AddableQuantity oneLiter = createLiter(1);

        assertEquals(createLiter(4.779999999999999), oneGallon.add(oneLiter));
    }

    @Test
    void givenOneLiterAndOneInch_WhenAdd_ThenShouldBeReturnException() {
        AddableQuantity oneLiter = createLiter(1);
        AddableQuantity oneInch = createInch(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneLiter.add(oneInch);
        });
        assertEquals("LITER and INCH" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneInchAndOneLiter_WhenAdd_ThenShouldBeReturnException() {
        AddableQuantity oneInch = createInch(1);
        AddableQuantity oneLiter = createLiter(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneLiter);
        });
        assertEquals("INCH and LITER" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneLiterAndOneFoot_WhenAdd_ThenShouldBeReturnException() {
        AddableQuantity oneLiter = createLiter(1);
        AddableQuantity oneFoot = createFoot(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneLiter.add(oneFoot);
        });
        assertEquals("LITER and FOOT" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneFootAndOneLiter_WhenAdd_ThenShouldBeReturnException() {
        AddableQuantity oneFoot = createFoot(1);
        AddableQuantity oneLiter = createLiter(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneLiter);
        });
        assertEquals("FOOT and LITER" + halfMsg, exception.getMessage());
    }


    @Test
    void givenOneInchAndOneGallon_WhenAdd_ThenShouldBeReturnException() {
        AddableQuantity oneInch = createInch(1);
        AddableQuantity oneGallon = createGallon(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneGallon);
        });
        assertEquals("INCH and GALLON" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneGallonAndOneInch_WhenAdd_ThenShouldBeReturnException() {
        AddableQuantity oneGallon = createGallon(1);
        AddableQuantity oneInch = createInch(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneInch);
        });
        assertEquals("GALLON and INCH" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneGallonAndOneFoot_WhenAdd_ThenShouldBeReturnException() {
        AddableQuantity oneGallon = createGallon(1);
        AddableQuantity oneFoot = createFoot(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneFoot);
        });
        assertEquals("GALLON and FOOT" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneFootAndOneGallon_WhenAdd_ThenShouldBeReturnException() {
        AddableQuantity oneFoot = createFoot(1);
        AddableQuantity oneGallon = createGallon(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneGallon);
        });
        assertEquals("FOOT and GALLON" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneYardAndOneLiter_WhenAdd_ThenShouldBeReturnException() {
        AddableQuantity oneYard = createYard(1);
        AddableQuantity oneLiter = createLiter(1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneYard.add(oneLiter);
        });
        assertEquals("YARD and LITER" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneYardAndOneLiter1_WhenAdd_ThenShouldBeReturnException() {
        AddableQuantity oneLiter = createLiter(1);
        AddableQuantity oneYard = createYard(1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneLiter.add(oneYard);
        });
        assertEquals("LITER and YARD" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneGramAndAnotherOneGram_WhenEqual_ThenShouldBeEqual() {
        AddableQuantity oneGram = createGram(1);
        AddableQuantity anotherOneGram = createGram(1);

        assertEquals(oneGram, anotherOneGram);
    }

    @Test
    void givenOneGramAndOneInch_WhenAdd_ThenShouldBeReturnException() {
        AddableQuantity oneGram = createGram(1);
        AddableQuantity oneInch = createInch(1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneGram.add(oneInch);
        });
        assertEquals("GRAM and INCH" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneGramAndOneLiter_WhenAdd_ThenShouldBeReturnException() {
        AddableQuantity oneGram = createGram(1);
        AddableQuantity oneLiter = createLiter(1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneGram.add(oneLiter);
        });
        assertEquals("GRAM and LITER" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneKilogramAndAnotherOneKilogram_WhenEqual_ThenShouldBeEqual() {
        AddableQuantity oneKilogram = createKiloGram(1);
        AddableQuantity anotherOneKiloGram = createKiloGram(1);

        assertEquals(oneKilogram, anotherOneKiloGram);
    }

    @Test
    void givenOneKiloGramAndOneInch_WhenAdd_ThenShouldBeReturnException() {
        AddableQuantity oneKiloGram = createKiloGram(1);
        AddableQuantity oneInch = createInch(1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneKiloGram.add(oneInch);
        });
        assertEquals("KILOGRAM and INCH" + halfMsg, exception.getMessage());
    }

    @Test
    void givenOneKiloGramAndOneLiter_WhenAdd_ThenShouldBeReturnException() {
        AddableQuantity oneKiloGram = createKiloGram(1);
        AddableQuantity oneLiter = createLiter(1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            oneKiloGram.add(oneLiter);
        });
        assertEquals("KILOGRAM and LITER" + halfMsg, exception.getMessage());
    }
}
