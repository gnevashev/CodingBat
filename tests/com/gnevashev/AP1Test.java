package com.gnevashev;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AP1Test {
    AP1 a = new AP1();

    //Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates.
    //Return the count of the number of strings which appear in both arrays.
    //The best "linear" solution makes a single pass over both arrays,
    //taking advantage of the fact that they are in alphabetical order.
    @Test
    void commonTwo() {
        assertEquals(2, a.commonTwo(new String[]{"a", "c", "x", "x"}, new String[]{"b", "c", "d", "x", "x"}));
        assertEquals(3, a.commonTwo(new String[]{"a", "c", "x"}, new String[]{"a", "b", "c", "x", "z"}));
        assertEquals(3, a.commonTwo(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}));
        assertEquals(0, a.commonTwo(new String[]{}, new String[]{"a", "b", "c"}));
    }

    @Test
    void maxHelper() {
    }

    //Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
    //Return a new array containing the first N elements from the two arrays.
    //The result array should be in alphabetical order and without duplicates. A and B will both have a length which is N or more.
    //The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order,
    //copying elements directly to the new array.
    @Test
    void mergeTwo() {
        assertArrayEquals(new String[]{"a", "b", "c"}, a.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"b", "f", "z"}, 3));
        assertArrayEquals(new String[]{"a", "c", "f"}, a.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"c", "f", "z"}, 3));
        assertArrayEquals(new String[]{"c", "f", "g"}, a.mergeTwo(new String[]{"f", "g", "z"}, new String[]{"c", "f", "g"}, 3));
    }

    //We have data for two users, A and B, each with a String name and an int id.
    //The goal is to order the users such as for sorting.
    //Return -1 if A comes before B, 1 if A comes after B, and 0 if they are the same.
    //Order first by the string names, and then by the id numbers if the names are the same.
    //Note: with Strings str1.compareTo(str2) returns an int value which is negative/0/positive
    //to indicate how str1 is ordered to str2 (the value is not limited to -1/0/1).
    //(On the AP, there would be two User objects, but here the code simply takes the two strings
    //and two ints directly. The code logic is the same.)
    @Test
    void userCompare() {
        assertEquals(-1, a.userCompare("bb", 1, "zz", 2));
        assertEquals(1, a.userCompare("bb", 1, "aa", 2));
        assertEquals(0, a.userCompare("bb", 1, "bb", 1));
        assertEquals(-1, a.userCompare("adam", 1, "bob", 5));
    }

    //(A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail.
    //Given start/end indexes into the array, return the number of "big" steps for a walk starting at the start index and ending
    //at the end index. We'll say that step is big if it is 5 or more up or down.
    //The start end end index will both be valid indexes into the array with start <= end.
    @Test
    void bigHeights() {
        assertEquals(1, a.bigHeights(new int[]{5, 3, 6, 7, 2}, 2, 4));
        assertEquals(0, a.bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 1));
        assertEquals(1, a.bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 4));
    }

    //(A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail.
    //Given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending
    //at the end index, however increases in height count double. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4
    //yields a sum of 1*2 + 5 = 7. The start end end index will both be valid indexes into the array with start <= end.
    @Test
    void sumHeights2() {
        assertEquals(7, a.sumHeights2(new int[]{5, 3, 6, 7, 2}, 2, 4));
        assertEquals(2, a.sumHeights2(new int[]{5, 3, 6, 7, 2}, 0, 1));
        assertEquals(15, a.sumHeights2(new int[]{5, 3, 6, 7, 2}, 0, 4));
    }

    //We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array,
    //return the sum of the changes for a walk beginning at the start index and ending at the end index.
    //For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6.
    //The start end end index will both be valid indexes into the array with start <= end.
    @Test
    void sumHeights() {
        assertEquals(6, a.sumHeights(new int[]{5, 3, 6, 7, 2}, 2, 4));
        assertEquals(2, a.sumHeights(new int[]{5, 3, 6, 7, 2}, 0, 1));
        assertEquals(11, a.sumHeights(new int[]{5, 3, 6, 7, 2}, 0, 4));
    }

    //Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10,
    //such as 40 or 90. Return the sum of largest special score in A and the largest special score in B.
    //To practice decomposition, write a separate helper method which finds the largest special score in an array.
    //Write your helper method after your scoresSpecial() method in the JavaBat text area.
    @Test
    void scoresSpecial() {
        assertEquals(40, a.scoresSpecial(new int[]{12, 10, 4}, new int[]{2, 20, 30}));
        assertEquals(40, a.scoresSpecial(new int[]{20, 10, 4}, new int[]{2, 20, 10}));
        assertEquals(20, a.scoresSpecial(new int[]{12, 11, 4}, new int[]{2, 20, 31}));
    }

    //Given an array of strings, return a new array without the strings that are equal to the target string.
    //One approach is to count the occurrences of the target string, make a new array of the correct length,
    //and then copy over the correct strings.
    @Test
    void wordsWithout() {
        assertArrayEquals(new String[]{"b", "c"}, a.wordsWithout(new String[] {"a", "b", "c", "a"}, "a"));
        assertArrayEquals(new String[]{"a", "c", "a"}, a.wordsWithout(new String[] {"a", "b", "c", "a"}, "b"));
        assertArrayEquals(new String[]{"a", "b", "a" }, a.wordsWithout(new String[] {"a", "b", "c", "a"}, "c"));
    }

    //The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}.
    //the "answers" array contains a student's answers, with "?" representing a question left blank.
    //The two arrays are not empty and are the same length. Return the score for this array of answers,
    //giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.
    @Test
    void scoreUp() {
        assertEquals(6, a.scoreUp(new String[]{"a", "a", "b", "b"}, new String[] {"a", "c", "b", "c"}));
        assertEquals(11, a.scoreUp(new String[]{"a", "a", "b", "b"}, new String[] {"a", "a", "b", "c"}));
        assertEquals(16, a.scoreUp(new String[]{"a", "a", "b", "b"}, new String[] {"a", "a", "b", "b"}));
    }

    //Given 2 arrays that are the same length containing strings, compare the 1st string in one
    //array to the 1st string in the other array, the 2nd to the 2nd and so on. Count the number
    //of times that the 2 strings are non-empty and start with the same char. The strings may be
    //any length, including 0.
    @Test
    void matchUp() {
        assertEquals(1, a.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "xx", "bb"}));
        assertEquals(2, a.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "b", "bb"}));
        assertEquals(1, a.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"", "", "ccc"}));
        assertEquals(1, a.matchUp(new String[]{"", "", "ccc"}, new String[]{"aa", "bb", "cc"}));
    }

    //We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive).
    //Given an array of positive ints, return a new array of length "count" containing the first
    //test if a number is endy. The original array will contain at least "count" endy numbers.
    //endy numbers from the original array. Decompose out a separate isEndy(int n) method to
    @Test
    void copyEndy() {
        assertArrayEquals(new int[]{9, 90}, a.copyEndy(new int[]{9, 11, 90, 22, 6}, 2));
        assertArrayEquals(new int[]{9, 90, 6}, a.copyEndy(new int[]{9, 11, 90, 22, 6}, 3));
        assertArrayEquals(new int[]{1, 1}, a.copyEndy(new int[]{12, 1, 1, 13, 0, 20}, 2));
    }

    @Test
    void isEndy() {
        assertTrue(a.isEndy(0));
        assertTrue(a.isEndy(10));
        assertFalse(a.isEndy(20));
        assertTrue(a.isEndy(90));
        assertTrue(a.isEndy(100));
        assertFalse(a.isEndy(101));
        assertFalse(a.isEndy(89));
    }

    //Given an array of positive ints, return a new array of length "count" containing the first
    //even numbers from the original array. The original array will contain at least "count" even
    //numbers.
    @Test
    void copyEvens() {
        assertArrayEquals(new int[]{2, 4}, a.copyEvens(new int[]{3, 2, 4, 5, 8}, 2));
        assertArrayEquals(new int[]{2, 4, 8}, a.copyEvens(new int[]{3, 2, 4, 5, 8}, 3));
        assertArrayEquals(new int[]{6, 2, 4}, a.copyEvens(new int[]{6, 1, 2, 4, 5, 8}, 3));
    }

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