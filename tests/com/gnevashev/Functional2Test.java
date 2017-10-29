package com.gnevashev;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Functional2Test {
    Functional2 f = new Functional2();

    //Given a list of integers, return a list of those numbers squared and the product added to 10,
    //omitting any of the resulting numbers that end in 5 or 6.
    @Test
    void square56() {
        assertIterableEquals(Arrays.asList (19, 11), f.square56(new ArrayList<>(Arrays.asList (3, 1, 4))));
        assertIterableEquals(Collections.singletonList(11), f.square56(new ArrayList<>(Collections.singletonList(1))));
        assertIterableEquals(Collections.singletonList(14), f.square56(new ArrayList<>(Collections.singleton (2))));
    }

    //Given a list of non-negative integers, return a list of those numbers multiplied by 2,
    //omitting any of the resulting numbers that end in 2.
    @Test
    void two2() {
        assertIterableEquals(Arrays.asList (4, 6), f.two2(new ArrayList<>(Arrays.asList (1, 2, 3))));
        assertIterableEquals(Collections.singletonList(4), f.two2(new ArrayList<>(Arrays.asList (2, 6, 11))));
        assertIterableEquals(Collections.singletonList(0), f.two2(new ArrayList<>(Collections.singleton (0))));
    }

    //Given a list of strings, return a list where each string has "y" added at its end, omitting any
    //resulting strings that contain "yy" as a substring anywhere.
    @Test
    void noYY() {
        assertIterableEquals(Arrays.asList ("ay", "by", "cy"), f.noYY(new ArrayList<>(Arrays.asList ("a", "b", "c"))));
        assertIterableEquals(Arrays.asList("ay", "by"), f.noYY(new ArrayList<>(Arrays.asList ("a", "b", "cy"))));
        assertIterableEquals(Arrays.asList("xxy", "yay", "zzy"), f.noYY(new ArrayList<>(Arrays.asList ("xx", "ya", "zz"))));
    }

    //Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
    @Test
    void no34() {
        assertIterableEquals(Arrays.asList ("a", "bb"), f.no34(new ArrayList<>(Arrays.asList ("a", "bb", "ccc"))));
        assertIterableEquals(Arrays.asList("a", "bb"), f.no34(new ArrayList<>(Arrays.asList ("a", "bb", "ccc", "dddd"))));
        assertIterableEquals(Collections.singletonList("apple"), f.no34(new ArrayList<>(Arrays.asList ("ccc", "dddd", "apple"))));
    }

    //Given a list of strings, return a list of the strings, omitting any string that contains a "z".
    //(Note: the str.contains(x) method returns a boolean)
    @Test
    void noZ() {
        assertIterableEquals(Arrays.asList ("aaa", "bbb"), f.noZ(new ArrayList<>(Arrays.asList ("aaa", "bbb", "aza"))));
        assertIterableEquals(Collections.singletonList("hi"), f.noZ(new ArrayList<>(Arrays.asList ("hziz", "hzello", "hi"))));
        assertIterableEquals(Arrays.asList("hello", "are"), f.noZ(new ArrayList<>(Arrays.asList ("hello", "howz", "are", "youz"))));
    }

    //Given a list of strings, return a list of the strings, omitting any string length 4 or more.
    @Test
    void noLong() {
        assertIterableEquals(Arrays.asList ("not", "too"), f.noLong(new ArrayList<>(Arrays.asList ("this", "not", "too", "long"))));
        assertIterableEquals(Arrays.asList("a", "bbb"), f.noLong(new ArrayList<>(Arrays.asList ("a", "bbb", "cccc"))));
        assertIterableEquals(Collections.emptyList(), f.noLong(new ArrayList<>(Arrays.asList ("cccc", "cccc", "cccc"))));
    }

    //Given a list of integers, return a list of those numbers,
    //omitting any that are between 13 and 19 inclusive.
    @Test
    void noTeen() {
        assertIterableEquals(Arrays.asList (12, 20), f.noTeen(new ArrayList<>(Arrays.asList (12, 13, 19, 20))));
        assertIterableEquals(Arrays.asList(1, 1), f.noTeen(new ArrayList<>(Arrays.asList (1, 14, 1))));
        assertIterableEquals(Collections.emptyList(), f.noTeen(new ArrayList<>(Collections.singleton (15))));
    }

    //Given a list of non-negative integers, return a list of those numbers except
    //omitting any that end with 9. (Note: % by 10)
    @Test
    void no9() {
        assertIterableEquals(Arrays.asList (1, 2), f.no9(new ArrayList<>(Arrays.asList (1, 2, 19))));
        assertIterableEquals(Arrays.asList(3), f.no9(new ArrayList<>(Arrays.asList (9, 19, 29, 3))));
        assertIterableEquals(Arrays.asList (1, 2, 3), f.no9(new ArrayList<>(Arrays.asList (1, 2, 3))));
    }

    //Given a list of integers, return a list of the integers, omitting any that are less than 0.
    @Test
    void noNeg() {
        assertIterableEquals(Arrays.asList(1), f.noNeg(new ArrayList<>(Arrays.asList (1, -2))));
        assertIterableEquals(Arrays.asList (3, 3), f.noNeg(new ArrayList<>(Arrays.asList (-3, -3, 3, 3))));
        assertIterableEquals(Collections.emptyList(), f.noNeg(new ArrayList<>(Arrays.asList (-2, -2, -2))));
    }

}