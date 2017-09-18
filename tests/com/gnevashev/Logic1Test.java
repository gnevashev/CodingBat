package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Logic1Test {

    Logic1 l = new Logic1();

    //Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive,
    //are extra lucky. So if either value is a teen, just return 19.
    @Test
    void teenSum() {
        assertEquals(7, l.teenSum(3, 4));
        assertEquals(19, l.teenSum(10, 13));
        assertEquals(19, l.teenSum(13, 2));
    }

    //Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
    //Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.
    @Test
    void nearTen() {
        assertTrue(l.nearTen(12));
        assertTrue(l.nearTen(19));
        assertFalse(l.nearTen(25));
    }

    //Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
    //So for example 38 and 39 return true, but 40 returns false.
    @Test
    void less20() {
        assertTrue(l.less20(18));
        assertTrue(l.less20(19));
        assertFalse(l.less20(20));
    }

    //Return true if the given non-negative number is a multiple of 3 or 5, but not both.
    @Test
    void old35() {
        assertTrue(l.old35(3));
        assertTrue(l.old35(5));
        assertFalse(l.old35(15));
        assertFalse(l.old35(7));
    }

    //Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
    //See also: Introduction to Mod
    @Test
    void more20() {
        assertTrue(l.more20(21));
        assertTrue(l.more20(22));
        assertFalse(l.more20(20));
    }

    //We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
    //Return true if the given non-negative number is special. Use the % "mod" operator
    @Test
    void specialEleven() {
        assertTrue(l.specialEleven(22));
        assertTrue(l.specialEleven(23));
        assertFalse(l.specialEleven(24));
    }

    //Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true, in which
    //case return true if the number is less or equal to 1, or greater or equal to 10.
    @Test
    void in1To10() {
        assertTrue(l.in1To10(5, false));
        assertTrue(l.in1To10(1, false));
        assertTrue(l.in1To10(10, false));
        assertFalse(l.in1To10(0, false));
        assertFalse(l.in1To10(11, false));

        assertTrue(l.in1To10(0, true));
        assertTrue(l.in1To10(1, true));
        assertTrue(l.in1To10(10, true));
        assertTrue(l.in1To10(11, true));
        assertFalse(l.in1To10(5, true));
    }

    //The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
    //Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
    @Test
    void love6() {
        assertTrue(l.love6(6, 4));
        assertTrue(l.love6(4, 10));
        assertTrue(l.love6(10, 4));
        assertTrue(l.love6(1, 5));
        assertFalse(l.love6(2, 3));
        assertFalse(l.love6(5, 7));
    }

    //Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are
    //on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the
    //alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on
    //weekdays it should be "10:00" and weekends it should be "off".
    @Test
    void alarmClock() {
        assertEquals("7:00", l.alarmClock(1, false));
        assertEquals("7:00", l.alarmClock(5, false));
        assertEquals("10:00", l.alarmClock(0, false));
        assertEquals("off", l.alarmClock(0, true));
        assertEquals("10:00", l.alarmClock(1, true));
    }

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