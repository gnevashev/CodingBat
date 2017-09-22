package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Logic2Test {

    Logic2 l = new Logic2();

    //We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
    //Return the number of small bars to use, assuming we always use big bars before small bars.
    //Return -1 if it can't be done
    @Test
    void makeChocolate() {
        assertEquals(4, l.makeChocolate(4, 1, 9));
        assertEquals(-1, l.makeChocolate(4, 1, 10));
        assertEquals(2, l.makeChocolate(4, 1, 7));
    }

    //Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three
    //values are evenly spaced, so the difference between small and medium is the same as the difference
    //between medium and large.
    @Test
    void evenlySpaced() {
        assertTrue(l.evenlySpaced(2, 4, 6));
        assertTrue(l.evenlySpaced(9, 3, 6));
        assertTrue(l.evenlySpaced(4, 6, 2));
        assertFalse(l.evenlySpaced(4, 6, 3));
        assertFalse(l.evenlySpaced(2, 2, 3));
        assertFalse(l.evenlySpaced(10, 9, 9));
    }

    //Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
    //Return 0 if they both go over.
    @Test
    void blackjack() {
        assertEquals(21, l.blackjack(19, 21));
        assertEquals(21, l.blackjack(21, 19));
        assertEquals(19, l.blackjack(22, 19));
    }

    //Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the
    //other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute
    //value of a number.
    @Test
    void closeFar() {
        assertTrue(l.closeFar(1, 2, 10));
        assertFalse(l.closeFar(1, 2, 3));
        assertTrue(l.closeFar(4, 1, 3));
        assertTrue(l.closeFar(10, 10, 8));
    }

    //For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more,
    //so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less
    //than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid
    //code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper
    //entirely below and at the same indent level as roundSum().
    @Test
    void roundSum() {
        assertEquals(60, l.roundSum(16, 17, 18));
        assertEquals(30, l.roundSum(12, 13, 14));
        assertEquals(10, l.roundSum(6, 4, 4));
    }

    @Test
    void round10() {
        assertEquals(10, l.round10(14));
        assertEquals(20, l.round10(15));
        assertEquals(0, l.round10(4));
        assertEquals(10, l.round10(5));
    }


    //Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19
    //inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate
    //helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule.
    //In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and
    //at the same indent level as the main noTeenSum().
    @Test
    void noTeenSum() {
        assertEquals(6, l.noTeenSum(1, 2, 3));
        assertEquals(3, l.noTeenSum(2, 13, 1));
        assertEquals(3, l.noTeenSum(2, 1, 14));
    }

    //Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count
    //towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
    @Test
    void luckySum() {
        assertEquals(6, l.luckySum(1, 2, 3));
        assertEquals(3, l.luckySum(1, 2, 13));
        assertEquals(1, l.luckySum(1, 13, 3));
        assertEquals(0, l.luckySum(13, 5, 3));
    }

    //Given 3 int values, a b c, return their sum. However, if one of the values is the
    //same as another of the values, it does not count towards the sum.
    @Test
    void loneSum() {
        assertEquals(6, l.loneSum(1, 2, 3));
        assertEquals(2, l.loneSum(3, 2, 3));
        assertEquals(0, l.loneSum(3, 3, 3));
    }

    //We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each)
    //and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
    //This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
    @Test
    void makeBricks() {
        assertTrue(l.makeBricks(3, 1, 8));
        assertTrue(l.makeBricks(3, 2, 10));
        assertFalse(l.makeBricks(3, 1, 9));
    }

}