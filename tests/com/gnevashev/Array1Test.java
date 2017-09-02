package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array1Test {

    Array1 a = new Array1();

    //Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from
    //a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more
    //elements available between the 2 arrays.
    @Test
    void make2() {
        assertArrayEquals(new int[]{4, 5}, a.make2(new int[]{4, 5}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{4, 1}, a.make2(new int[]{4}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2}, a.make2(new int[]{}, new int[]{1, 2}));
        assertArrayEquals(new int[]{1, 2}, a.make2(new int[]{}, new int[]{1, 2}));
        assertArrayEquals(new int[]{1}, a.make2(new int[]{}, new int[]{1}));
        assertArrayEquals(new int[]{}, a.make2(new int[]{}, new int[]{}));
    }

    //We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
    //Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
    @Test
    void unlucky1() {
        assertTrue(a.unlucky1(new int[]{1, 3, 4, 5}));
        assertTrue(a.unlucky1(new int[]{2, 1, 3, 4, 5}));
        assertTrue(a.unlucky1(new int[]{2, 1, 3, 4, 5}));
        assertTrue(a.unlucky1(new int[]{2, 2, 3, 1, 3}));
        assertTrue(a.unlucky1(new int[]{1, 3}));
        assertFalse(a.unlucky1(new int[]{1, 1, 1}));
        assertFalse(a.unlucky1(new int[]{1, 2}));
        assertFalse(a.unlucky1(new int[]{1}));
        assertFalse(a.unlucky1(new int[]{}));
    }

    //Given an int array of any length, return a new array of its first 2 elements.
    //If the array is smaller than length 2, use whatever elements are present
    @Test
    void frontPiece() {
        assertArrayEquals(new int[]{}, a.frontPiece(new int[]{}));
        assertArrayEquals(new int[]{5}, a.frontPiece(new int[]{5}));
        assertArrayEquals(new int[]{5, 6}, a.frontPiece(new int[]{5, 6}));
        assertArrayEquals(new int[]{7, 8}, a.frontPiece(new int[]{7, 8, 9}));
    }


    //Given an array of ints of odd length, look at the first, last,
    //and middle values in the array and return the largest.
    //The array length will be a least 1.
    @Test
    void maxTriple() {
        assertEquals(3, a.maxTriple(new int[]{1, 2, 3}));
        assertEquals(5, a.maxTriple(new int[]{1, 5, 3}));
        assertEquals(9, a.maxTriple(new int[]{1, 5, 9, 7, 8}));
        assertEquals(8, a.maxTriple(new int[]{8}));
    }

    //Given an array of ints of odd length, return a new array length 3
    //containing the elements from the middle of the array. The array length will be at least 3.
    @Test
    void midThree() {
        assertArrayEquals(new int[]{2, 3, 4}, a.midThree(new int[] {1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{7, 5, 3}, a.midThree(new int[] {8, 6, 7, 5, 3, 0, 9}));
        assertArrayEquals(new int[]{1, 2, 3}, a.midThree(new int[] {1, 2, 3}));
    }

    //Given an array of ints, swap the first and last elements in the array.
    //Return the modified array. The array length will be at least 1.
    @Test
    void swapEnds() {
        assertArrayEquals(new int[]{4, 2, 3, 1}, a.swapEnds(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{3, 2, 1}, a.swapEnds(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{2, 1}, a.swapEnds(new int[]{1, 2}));
        assertArrayEquals(new int[]{1}, a.swapEnds(new int[]{1}));
        assertArrayEquals(new int[]{}, a.swapEnds(new int[]{}));
    }

    //Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
    @Test
    void plusTwo() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, a.plusTwo(new int[]{1, 2}, new int[]{3, 4}));
        assertArrayEquals(new int[]{4, 4, 2, 2}, a.plusTwo(new int[]{4, 4}, new int[]{2, 2}));
        assertArrayEquals(new int[]{9, 2, 3, 4}, a.plusTwo(new int[]{9, 2}, new int[]{3, 4}));
    }


    //Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
    //The original array will be length 2 or more.
    @Test
    void makeMiddle() {
        assertArrayEquals(new int[]{2, 3}, a.makeMiddle(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{2, 3}, a.makeMiddle(new int[]{7, 1, 2, 3, 4, 9}));
        assertArrayEquals(new int[]{1, 2}, a.makeMiddle(new int[]{1, 2}));
    }

    //Start with 2 int arrays, a and b, each length 2.
    //Consider the sum of the values in each array.
    //Return the array which has the largest sum.
    //In event of a tie, return a.
    @Test
    void biggerTwo() {
        assertArrayEquals(new int[]{3, 4}, a.biggerTwo(new int[]{1, 2}, new int[]{3, 4}));
        assertArrayEquals(new int[]{3, 4}, a.biggerTwo(new int[]{3, 4}, new int[]{1, 2}));
        assertArrayEquals(new int[]{5, 10}, a.biggerTwo(new int[]{5, 10}, new int[]{10, 5}));
    }


    //Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element
    @Test
    void start1() {
        assertEquals(2, a.start1(new int[]{1, 2, 3}, new int[]{1, 3}));
        assertEquals(1, a.start1(new int[]{7, 2, 3}, new int[]{1}));
        assertEquals(1, a.start1(new int[]{1, 2}, new int[]{}));
    }

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