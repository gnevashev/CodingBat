package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Logic1Test {

    Logic1 l = new Logic1();

    //Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden,
    //so in that case just return 20.
    @Test
    void sortaSum() {
        assertEquals(7, l.sortaSum(3, 4));
        assertEquals(20, l.sortaSum(5, 6));
        assertEquals(21, l.sortaSum(10, 11));
    }

    //You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded
    //as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is
    //between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your
    //birthday -- on that day, your speed can be 5 higher in all cases.
    @Test
    void caughtSpeeding() {
        assertEquals(0, l.caughtSpeeding(60, false));
        assertEquals(0, l.caughtSpeeding(50, false));
        assertEquals(1, l.caughtSpeeding(61, false));
        assertEquals(1, l.caughtSpeeding(70, false));
        assertEquals(1, l.caughtSpeeding(80, false));
        assertEquals(2, l.caughtSpeeding(81, false));
        assertEquals(2, l.caughtSpeeding(100, false));

        assertEquals(0, l.caughtSpeeding(65, true));
        assertEquals(0, l.caughtSpeeding(50, true));
        assertEquals(1, l.caughtSpeeding(66, true));
        assertEquals(1, l.caughtSpeeding(70, true));
        assertEquals(1, l.caughtSpeeding(85, true));
        assertEquals(2, l.caughtSpeeding(86, true));
        assertEquals(2, l.caughtSpeeding(100, true));

    }

    //The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is
    //between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90.
    //Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
    @Test
    void squirrelPlay() {
        assertTrue(l.squirrelPlay(70, false));
        assertFalse(l.squirrelPlay(95, false));
        assertTrue(l.squirrelPlay(95, true));
    }

    //You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your
    //clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table
    //is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more,
    //then the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no).
    //Otherwise the result is 1 (maybe).
    @Test
    void dateFashion() {
        assertEquals(2, l.dateFashion(5, 10));
        assertEquals(0, l.dateFashion(5, 2));
        assertEquals(1, l.dateFashion(5, 5));
        assertEquals(0, l.dateFashion(10, 2));
    }

    //When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the
    //number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound
    //on the number of cigars. Return true if the party with the given values is successful, or false otherwise.
    @Test
    void cigarParty() {
        assertFalse(l.cigarParty(30, false));
        assertFalse(l.cigarParty(61, false));
        assertTrue(l.cigarParty(40, false));
        assertTrue(l.cigarParty(45, false));
        assertTrue(l.cigarParty(60, false));
        assertFalse(l.cigarParty(39, true));
        assertTrue(l.cigarParty(70, true));
    }

}