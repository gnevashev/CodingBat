package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array3Test {

    Array3 a = new Array3();

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