package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarmUp2Test {
    WarmUp2 w = new WarmUp2();

    @Test
    void has271() {

        assertTrue(w.has271(new int[] {1, 2, 7, 1}));
        assertTrue(w.has271(new int[] {2, 7, 1}));
        assertTrue(w.has271(new int[] {2, 7, -2, 4, 9, 3}));
        assertTrue(w.has271(new int[] {2, 7, 3}));
        assertTrue(w.has271(new int[] {2, 7, -1}));
        assertFalse(w.has271(new int[] {1, 2, 8, 1}));
        assertFalse(w.has271(new int[] {2, 7, 4}));
        assertFalse(w.has271(new int[] {2, 7, 5, 10, 1}));
    }


    @Test
    void noTriples() {
        assertTrue(w.noTriples(new int[]{1, 1, 2, 2, 1}));
        assertTrue(w.noTriples(new int[]{}));
        assertFalse(w.noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        assertFalse(w.noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
    }

    @Test
    void array667() {
        assertEquals(1, w.array667(new int[]{6, 6, 2}));
        assertEquals(1, w.array667(new int[]{6, 6, 2, 6}));
        assertEquals(1, w.array667(new int[]{6, 7, 2, 6}));
        assertEquals(2, w.array667(new int[]{6, 6, 6, 2}));
    }

    @Test
    void stringYak() {
        assertEquals("pak", w.stringYak("yakpak"));
        assertEquals("pak", w.stringYak("pakyak"));
        assertEquals("123ya", w.stringYak("yak123ya"));
        //assertEquals("123ya", w.stringYak("ywk123ya"));
        assertEquals("", w.stringYak("yak"));
        assertEquals("", w.stringYak(""));
    }

    @Test
    void altPairs() {
        assertEquals("kien", w.altPairs("kitten"));
        assertEquals("Chole", w.altPairs("Chocolate"));
        assertEquals("Congrr", w.altPairs("CodingHorror"));
        assertEquals("ThThThth", w.altPairs("ThisThatTheOther"));
        assertEquals("", w.altPairs(""));
    }

    @Test
    void stringX() {
        assertEquals("xHix", w.stringX("xxHxix"));
        assertEquals("abcd", w.stringX("abxxxcd"));
        assertEquals("xabcdx", w.stringX("xabxxxcdx"));
    }
    @Test
    void stringMatch() {
        assertEquals(3, w.stringMatch("xxcaazz", "xxbaaz"));
        assertEquals(2, w.stringMatch("abc", "abc"));
        assertEquals(0, w.stringMatch("abc", "axc"));
        assertEquals(0, w.stringMatch("", "axc"));
        assertEquals(0, w.stringMatch("a", "axc"));

    }

    @Test
    void array123() {
        assertTrue(w.array123(new int[]{1, 1, 2, 3, 1}));
        assertTrue(w.array123(new int[]{1, 1, 2, 1, 2, 3}));
        assertFalse(w.array123(new int[]{1, 1, 2, 4, 1}));
    }

    @Test
    void arrayFront9() {
        assertTrue(w.arrayFront9(new int[]{1, 2, 9, 3, 4}));
        assertFalse(w.arrayFront9(new int[]{1, 2, 4, 3, 9}));
        assertFalse(w.arrayFront9(new int[]{1, 2, 3, 4, 5}));
        assertTrue(w.arrayFront9(new int[]{1, 2, 9}));
    }

    @Test
    void arrayCount9() {
        assertEquals(1, w.arrayCount9(new int[] {1, 2, 9}));
        assertEquals(2, w.arrayCount9(new int[] {2, 9, 9}));
        assertEquals(3, w.arrayCount9(new int[] {2, 9, 9, 9, 8}));
    }
    @Test
    void last2() {
        assertEquals(1, w.last2("hixxhi"));
        assertEquals(1, w.last2("xaxxaxaxx"));
        assertEquals(2, w.last2("axxxaaxx"));
        assertEquals(0, w.last2(""));
        assertEquals(0, w.last2("a"));
    }
    @Test
    void stringSplosion() {
        assertEquals("CCoCodCode", w.stringSplosion("Code"));
        assertEquals("aababc", w.stringSplosion("abc"));
        assertEquals("aab", w.stringSplosion("ab"));
    }
    @Test
    void stringBits() {
        assertEquals("Hlo", w.stringBits("Hello"));
        assertEquals("H", w.stringBits("Hi"));
        assertEquals("", w.stringBits(""));
        assertEquals("Hello", w.stringBits("Heeololeo"));
    }

    @Test
    void doubleX() {
        assertTrue(w.doubleX("axxbb"));
        assertFalse(w.doubleX("axaxax"));
        assertTrue(w.doubleX("xxxxx"));
        assertFalse(w.doubleX("xaxxx"));
        assertFalse(w.doubleX("x"));
        assertFalse(w.doubleX("aaaax"));
    }

    @Test
    void countXX() {
        assertEquals(1, w.countXX("abcxx"));
        assertEquals(2, w.countXX("xxx"));
        assertEquals(3, w.countXX("xxxx"));
    }
    @Test
    void frontTimes() {
        assertEquals("ChoCho", w.frontTimes("Chocolate", 2));
        assertEquals("ChoChoCho", w.frontTimes("Chocolate", 3));
        assertEquals("AbcAbcAbc", w.frontTimes("Abc", 3));
        assertEquals("AbAbAb", w.frontTimes("Ab", 3));
    }

    @Test
    void stringTimes() {
        //Given a string and a non-negative int n, return a larger string that is n copies of the original string.
        assertEquals("HiHi", w.stringTimes("Hi", 2));
        assertEquals("HiHiHi", w.stringTimes("Hi", 3));
        assertEquals("Hi", w.stringTimes("Hi", 1));
    }



}