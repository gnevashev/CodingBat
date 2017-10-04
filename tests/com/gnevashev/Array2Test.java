package com.gnevashev;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Array2Test {

    Array2 a = new Array2();

    //Given an array of ints, return true if the array contains no 1's and no 3's.
    @Test
    void lucky13() {
        assertTrue(a.lucky13(new int[]{0, 2, 4}));
        assertFalse(a.lucky13(new int[]{1, 2, 3}));
        assertFalse(a.lucky13(new int[]{1, 2, 4}));
    }

    //Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
    @Test
    void has22() {
        assertTrue(a.has22(new int[]{1, 2, 2}));
        assertFalse(a.has22(new int[]{1, 2, 1, 2}));
        assertFalse(a.has22(new int[]{2, 1, 2}));
    }

    //Return the sum of the numbers in the array, except ignore sections of numbers starting
    //with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
    //Return 0 for no numbers.
    @Test
    void sum67() {
        assertEquals(5, a.sum67(new int[]{1, 2, 2}));
        assertEquals(5, a.sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));
        assertEquals(4, a.sum67(new int[]{1, 1, 6, 7, 2}));
    }

    //Return the sum of the numbers in the array, returning 0 for an empty array. Except the
    //number 13 is very unlucky, so it does not count and numbers that come immediately after
    //a 13 also do not count.
    @Test
    void sum13() {
        assertEquals(6, a.sum13(new int[]{1, 2, 2, 1}));
        assertEquals(2, a.sum13(new int[]{1, 1}));
        assertEquals(6, a.sum13(new int[]{1, 2, 2, 1, 13}));
    }

    //Return the "centered" average of an array of ints, which we'll say is the mean average of
    //the values, except ignoring the largest and smallest values in the array. If there are
    //multiple copies of the smallest value, ignore just one copy, and likewise for the largest
    //value. Use int division to produce the final average. You may assume that the array is length 3 or more.
    @Test
    void centeredAverage() {
        assertEquals(3, a.centeredAverage(new int[]{1, 2, 3, 4, 100}));
        assertEquals(5, a.centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
        assertEquals(-3, a.centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
    }

    //Given an array length 1 or more of ints, return the difference between the largest and
    //smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2)
    //methods return the smaller or larger of two values.
    @Test
    void bigDiff() {
        assertEquals(7, a.bigDiff(new int[]{10, 3, 5, 6}));
        assertEquals(8, a.bigDiff(new int[]{7, 2, 10, 9}));
        assertEquals(8, a.bigDiff(new int[]{2, 10, 7, 2}));
    }

    //Return the number of even ints in the given array.
    //Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
    @Test
    void countEvens() {
        assertEquals(3, a.countEvens(new int[]{2, 1, 2, 3, 4}));
        assertEquals(3, a.countEvens(new int[]{2, 2, 0}));
        assertEquals(0, a.countEvens(new int[]{1, 3, 5}));
    }

}