package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array3Test {

    Array3 a = new Array3();

    //Given two arrays of ints sorted in increasing order, outer and inner, return true if all of
    //the numbers in inner appear in outer. The best solution makes only a single "linear" pass of
    //both arrays, taking advantage of the fact that both arrays are already in sorted order.
    @Test
    void linearIn() {
        assertTrue(a.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
        assertFalse(a.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
        assertTrue(a.linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));
        assertTrue(a.linearIn(new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{-1, 0, 3, 12}));
    }

    //Given a non-empty array, return true if there is a place to split the array so that the sum
    //of the numbers on one side is equal to the sum of the numbers on the other side.
    @Test
    void canBalance() {
        assertTrue(a.canBalance(new int[]{1, 1, 1, 2, 1}));
        assertFalse(a.canBalance(new int[]{2, 1, 1, 2, 1}));
        assertFalse(a.canBalance(new int[]{2}));
        assertTrue(a.canBalance(new int[]{10, 10}));
    }

    //(This is a slightly harder version of the fix34 problem.) Return an array that contains
    //exactly the same numbers as the given array, but rearranged so that every 4 is immediately
    //followed by a 5. Do not move the 4's, but every other number may move. The array contains
    //the same number of 4's and 5's, and every 4 has a number after it that is not a 4.
    //In this version, 5's may appear anywhere in the original array.
    @Test
    void fix45() {
        assertArrayEquals(new int[]{9, 4, 5, 4, 5, 9}, a.fix45(new int[]{5, 4, 9, 4, 9, 5}));
        assertArrayEquals(new int[]{1, 4, 5, 1}, a.fix45(new int[]{1, 4, 1, 5}));
        assertArrayEquals(new int[]{1, 4, 5, 1, 1, 4, 5}, a.fix45(new int[]{1, 4, 1, 5, 5, 4, 1}));
        assertArrayEquals(new int[]{1, 4, 5, 4, 5}, a.fix45(new int[]{5, 4, 5, 4, 1}));
        assertArrayEquals(new int[]{1, 4, 5, 4, 5}, a.fix45(new int[]{5, 4, 5, 4, 1}));
        assertArrayEquals(new int[]{4, 5, 4, 5, 1}, a.fix45(new int[]{4, 5, 4, 1, 5}));
    }


    //Return an array that contains exactly the same numbers as the given array, but rearranged
    //so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move.
    //The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3,
    //and a 3 appears in the array before any 4.
    @Test
    void fix34() {
        assertArrayEquals(new int[]{1, 3, 4, 1}, a.fix34(new int[]{1, 3, 1, 4}));
        assertArrayEquals(new int[]{1, 3, 4, 1, 1, 3, 4}, a.fix34(new int[]{1, 3, 1, 4, 4, 3, 1}));
        assertArrayEquals(new int[]{3, 4, 2, 2}, a.fix34(new int[]{3, 2, 2, 4}));
        assertArrayEquals(new int[]{5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4}, a.fix34(new int[]{5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5}));
    }

    //Consider the leftmost and righmost appearances of some value in an array. We'll say that
    //the "span" is the number of elements between the two inclusive. A single value has a span
    //of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
    @Test
    void maxSpan() {
        assertEquals(4, a.maxSpan(new int[]{1, 2, 1, 1, 3}));
        assertEquals(6, a.maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
        assertEquals(6, a.maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));
        assertEquals(0, a.maxSpan(new int[]{}));
        assertEquals(1, a.maxSpan(new int[]{5}));
    }

}