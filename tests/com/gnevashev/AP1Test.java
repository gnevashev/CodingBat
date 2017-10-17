package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AP1Test {
    AP1 a = new AP1();

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