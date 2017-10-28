package com.gnevashev;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Functional1Test {
    Functional1 f  = new Functional1();

    //Given a list of integers, return a list where each integer is multiplied by 2.
    @Test
    void doubling() {
        assertIterableEquals(Arrays.asList (2, 4, 6), f.doubling(Arrays.asList (1, 2, 3)));
        assertIterableEquals(Arrays.asList (12, 16, 12, 16, -2), f.doubling(Arrays.asList (6, 8, 6, 8, -1)));
        assertIterableEquals(Collections.emptyList(), f.doubling(Collections.emptyList()));
    }

    //Given a list of integers, return a list where each integer is multiplied with itself.
    @Test
    void square() {
        assertIterableEquals(Arrays.asList (1, 4, 9), f.square(Arrays.asList (1, 2, 3)));
        assertIterableEquals(Arrays.asList (36, 64, 36, 64, 1), f.square(Arrays.asList (6, 8, -6, -8, 1)));
        assertIterableEquals(Collections.emptyList(), f.square(Collections.emptyList()));
    }

    //Given a list of strings, return a list where each string has "*" added at its end.
    @Test
    void addStar() {
        assertIterableEquals(Arrays.asList ("a*", "bb*", "ccc*"), f.addStar(Arrays.asList ("a", "bb", "ccc")));
        assertIterableEquals(Arrays.asList ("hello*", "there*"), f.addStar(Arrays.asList ("hello", "there")));
        assertIterableEquals(Arrays.asList ("**"), f.addStar(Arrays.asList ("*")));
    }

    //Given a list of strings, return a list where each string is
    //replaced by 3 copies of the string concatenated together.
    @Test
    void copies3() {
        assertIterableEquals(Arrays.asList ("aaa", "bbbbbb", "ccccccccc"), f.copies3(Arrays.asList ("a", "bb", "ccc")));
        assertIterableEquals(Arrays.asList ("242424", "aaa", ""), f.copies3(Arrays.asList ("24", "a", "")));
        assertIterableEquals(Arrays.asList ("hellohellohello", "theretherethere"), f.copies3(Arrays.asList ("hello", "there")));
    }

    //Given a list of strings, return a list where each string has "y" added at its start and end.
    @Test
    void moreY() {
        assertIterableEquals(Arrays.asList ("yay", "yby", "ycy"), f.moreY(Arrays.asList ("a", "b", "c")));
        assertIterableEquals(Arrays.asList ("yhelloy", "ytherey"), f.moreY(Arrays.asList ("hello", "there")));
        assertIterableEquals(Arrays.asList ("yyayy"), f.moreY(Arrays.asList ("yay")));
    }


    //Given a list of integers, return a list where each integer is added to 1
    //and the result is multiplied by 10.
    @Test
    void math1() {
        assertIterableEquals(Arrays.asList (20, 30, 40), f.math1(Arrays.asList (1, 2, 3)));
        assertIterableEquals(Arrays.asList (70, 90, 70, 90, 20), f.math1(Arrays.asList (6, 8, 6, 8, 1)));
        assertIterableEquals(Arrays.asList (110), f.math1(Arrays.asList (10)));
    }


    //Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
    @Test
    void rightDigit() {
        assertIterableEquals(Arrays.asList (1, 2, 3), f.rightDigit(Arrays.asList (1, 22, 93)));
        assertIterableEquals(Arrays.asList (6, 8, 6, 8, 1), f.rightDigit(Arrays.asList (16, 8, 886, 8, 1)));
        assertIterableEquals(Arrays.asList (0, 0), f.rightDigit(Arrays.asList (10, 0)));
    }

    //Given a list of strings, return a list where each string is converted to lower case
    //(Note: String toLowerCase() method).
    @Test
    void lower() {
        assertIterableEquals(Arrays.asList ("hello", "hi"), f.lower(Arrays.asList ("Hello", "Hi")));
        assertIterableEquals(Arrays.asList ("aaa", "bbb", "ccc"), f.lower(Arrays.asList ("AAA", "BBB", "ccc")));
        assertIterableEquals(Arrays.asList ("kitten", "chocolate"), f.lower(Arrays.asList ("KitteN", "ChocolaTE")));
    }

    //Given a list of strings, return a list where each string has all its "x" removed.
    @Test
    void noX() {
        assertIterableEquals(Arrays.asList ("a", "bb", "c"), f.noX(Arrays.asList ("ax", "bb", "cx")));
        assertIterableEquals(Arrays.asList ("a", "bb", "c"), f.noX(Arrays.asList ("xxax", "xbxbx", "xxcx")));
        assertIterableEquals(Arrays.asList (""), f.noX(Arrays.asList ("x")));
    }

}