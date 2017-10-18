package com.gnevashev;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AP1Test {

    AP1 a = new AP1();

    //We'll say that a positive int divides itself if every digit in the number divides into the
    //number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly.
    //We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself.
    //Note: use % to get the rightmost digit, and / to discard the rightmost digit.
    @Test
    void dividesSelf() {
        assertTrue(a.dividesSelf(128));
        assertTrue(a.dividesSelf(12));
        assertFalse(a.dividesSelf(120));
        assertFalse(a.dividesSelf(42));
    }

    //Given a positive int n, return true if it contains a 1 digit.
    //Note: use % to get the rightmost digit, and / to discard the rightmost digit.
    @Test
    void hasOne() {
        assertTrue(a.hasOne(10));
        assertFalse(a.hasOne(22));
        assertFalse(a.hasOne(22));
        assertFalse(a.hasOne(220));
    }

    //Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the
    //given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.
    @Test
    void wordsWithoutList() {
        assertEquals(Arrays.asList("bb", "ccc"), a.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 1));
        assertEquals(Arrays.asList("a", "bb", "b"), a.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 3));
        assertEquals(Arrays.asList("a", "bb", "b", "ccc"), a.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 4));
    }

    //Given an array of strings, return a new array containing the first N strings.
    //N will be in the range 1..length.
    @Test
    void wordsFront() {
        assertArrayEquals(new String[]{"a"}, a.wordsFront(new String[]{"a", "b", "c", "d"}, 1));
        assertArrayEquals(new String[]{"a", "b"}, a.wordsFront(new String[]{"a", "b", "c", "d"}, 2));
        assertArrayEquals(new String[]{"a", "b", "c"}, a.wordsFront(new String[]{"a", "b", "c", "d"}, 3));
    }

    @Test
    void average() {
    }

    //Given an array of strings, return the count of the number of strings with the given length.
    @Test
    void wordsCount() {
        assertEquals(2, a.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1));
        assertEquals(1, a.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 3));
        assertEquals(0, a.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 4));
    }

    //Given an array of scores, compute the int average of the first half and the second half, and
    //return whichever is larger. We'll say that the second half begins at index length/2. The
    //array length will be at least 2. To practice decomposition, write a separate helper method
    //int average(int[] scores, int start, int end) { which computes the average of the
    //elements between indexes start..end. Call your helper method twice to implement scoresAverage().
    //Write your helper method after your scoresAverage() method in the JavaBat text area.
    //Normally you would compute averages with doubles, but here we use ints so the expected results are exact.
    @Test
    void scoresAverage() {
        assertEquals(4, a.scoresAverage(new int[]{2, 2, 4, 4}));
        assertEquals(4, a.scoresAverage(new int[]{4, 4, 4, 2, 2, 2}));
        assertEquals(4, a.scoresAverage(new int[]{3, 4, 5, 1, 2, 3}));
        assertEquals(6, a.scoresAverage(new int[]{5, 6}));
        assertEquals(5, a.scoresAverage(new int[]{5, 4}));
    }

    //Given an array of scores sorted in increasing order, return true if the array
    //contains 3 adjacent scores that differ from each other by at most 2,
    //such as with {3, 4, 5} or {3, 5, 5}.
    @Test
    void scoresClump() {
        assertTrue(a.scoresClump(new int[]{3, 4, 5}));
        assertFalse(a.scoresClump(new int[]{3, 4, 6}));
        assertTrue(a.scoresClump(new int[]{1, 3, 5, 5}));
        assertFalse(a.scoresClump(new int[]{}));
    }

    //Given an array of scores, return true if there are scores of 100 next to each other in the
    //array. The array length will be at least 2.
    @Test
    void scores100() {
        assertTrue(a.scores100(new int[]{1, 100, 100}));
        assertFalse(a.scores100(new int[]{1, 100, 99, 100}));
        assertTrue(a.scores100(new int[]{100, 1, 100, 100}));
        assertFalse(a.scores100(new int[]{1, 2, 3, 4, 5}));
        assertFalse(a.scores100(new int[]{1, 2, 100, 4, 5}));

    }

    //Given an array of scores, return true if each score is equal or greater than the one before.
    //The array will be length 2 or more.
    @Test
    void scoresIncreasing() {
        assertTrue(a.scoresIncreasing(new int[]{1, 3, 4}));
        assertFalse(a.scoresIncreasing(new int[]{1, 3, 2}));
        assertTrue(a.scoresIncreasing(new int[]{1, 1, 4}));
    }

}