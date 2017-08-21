package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarmUp2Test {

    WarmUp2 w = new WarmUp2();

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