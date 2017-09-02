package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array1Test {

    Array1 a = new Array1();

    //Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
    //Return the changed array.
    @Test
    void fix23() {
        assertArrayEquals(new int[]{1, 2, 0}, a.fix23(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{2, 0, 5}, a.fix23(new int[]{2, 3, 5}));
        assertArrayEquals(new int[]{1, 2, 1}, a.fix23(new int[]{1, 2, 1}));
    }


    //Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
    @Test
    void double23() {
        assertTrue(a.double23(new int[]{2, 2}));
        assertTrue(a.double23(new int[]{3, 3}));
        assertFalse(a.double23(new int[]{2, 4}));
        assertFalse(a.double23(new int[]{3}));
        assertFalse(a.double23(new int[]{}));
    }

    //Given an int array, return a new array with double the length where its last element is the same as the original array,
    //and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
    @Test
    void makeLast() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 6}, a.makeLast(new int[]{4, 5, 6}));
        assertArrayEquals(new int[]{0, 0, 0, 2}, a.makeLast(new int[]{1, 2}));
        assertArrayEquals(new int[]{0, 3}, a.makeLast(new int[]{3}));
    }

    //Given an int array length 2, return true if it contains a 2 or a 3.
    @Test
    void has23() {
        assertTrue(a.has23(new int[] {1, 2}));
        assertTrue(a.has23(new int[] {2, 3}));
        assertTrue(a.has23(new int[] {1, 3}));
        assertFalse(a.has23(new int[] {1, 1}));
    }

    //Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
    //The original array will be length 1 or more.
    @Test
    void makeEnds() {
        assertArrayEquals(new int[]{1, 3}, a.makeEnds(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 1}, a.makeEnds(new int[]{1}));
        assertArrayEquals(new int[]{1, 9}, a.makeEnds(new int[]{1, 9}));
    }

    @Test
    void middleWay() {
        assertArrayEquals(new int[]{2, 5}, a.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        assertArrayEquals(new int[]{7, 8}, a.middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0}));
    }

    @Test
    void sum2() {
        assertEquals(3, a.sum2(new int[]{1, 2, 3}));
        assertEquals(2, a.sum2(new int[]{1, 1}));
        assertEquals(1, a.sum2(new int[]{1}));
        assertEquals(0, a.sum2(new int[]{}));
    }

    @Test
    void maxEnd3() {
        assertArrayEquals(new int[]{3, 3, 3}, a.maxEnd3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{11, 11, 11}, a.maxEnd3(new int[]{11, 5, 9}));
        assertArrayEquals(new int[]{3, 3, 3}, a.maxEnd3(new int[]{2, 11, 3}));
    }
    @Test
    void reverse3() {
        assertArrayEquals(new int[]{3, 2, 1}, a.reverse3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{9, 11, 5}, a.reverse3(new int[]{5, 11, 9}));
        assertArrayEquals(new int[]{4, 3, 2, 1}, a.reverse3(new int[]{1, 2, 3, 4}));
    }

    @Test
    void rotateLeft3() {
        assertArrayEquals(new int[]{2, 3, 1}, a.rotateLeft3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{11, 9, 5}, a.rotateLeft3(new int[]{5, 11, 9}));
    }

    @Test
    void sum3() {
        assertEquals(6, a.sum3(new int[]{1, 2, 3}) );
        assertEquals(18, a.sum3(new int[]{5, 11, 2}));
        assertEquals(7, a.sum3(new int[]{7, 0, 0}));
    }

    @Test
    void commonEnd() {
        assertTrue(a.commonEnd(new int[]{1, 2, 3}, new int[] {7, 3}));
        assertTrue(a.commonEnd(new int[]{1, 2, 4}, new int[] {1, 4}));
        assertFalse(a.commonEnd(new int[]{1, 2, 4}, new int[] {7, 3, 2}));
    }

    @Test
    void makePi() {
        assertArrayEquals(new int[]{3, 1, 4}, a.makePi());
    }

    @Test
    void sameFirstLast() {
        assertTrue(a.sameFirstLast(new int[]{1, 2, 3, 4, 5, 1}));
        assertFalse(a.sameFirstLast(new int[]{1, 2, 3, 4, 5}));
        assertTrue(a.sameFirstLast(new int[]{1}));
        assertFalse(a.sameFirstLast(new int[]{}));
    }

    @Test
    void firstLast6() {
        assertTrue(a.firstLast6(new int[]{1, 2, 6}));
        assertTrue(a.firstLast6(new int[]{6, 1}));
        assertFalse(a.firstLast6(new int[]{1, 2, 3}));
    }

    @Test
    void front11() {
        assertArrayEquals(new int[]{1, 7}, a.front11(new int[] {1, 2, 3}, new int[] {7,8}));
        assertArrayEquals(new int[]{1, 2}, a.front11(new int[] {1}, new int[] {2}));
        assertArrayEquals(new int[]{1}, a.front11(new int[] {1, 7}, new int[]{}));
    }

}