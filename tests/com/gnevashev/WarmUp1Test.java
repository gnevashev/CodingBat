package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarmUp1Test {

    WarmUp1 w = new WarmUp1();
    @Test
    void monkeyTrouble() {
        assertEquals(true, w.monkeyTrouble(true, true));
        assertEquals(true, w.monkeyTrouble(false, false));
        assertEquals(false, w.monkeyTrouble(true, false));
        assertEquals(false, w.monkeyTrouble(false, true));
    }

    @Test
    void sleepIn()
    {
        assertEquals(true, w.sleepIn(false, false)); //it not a vacation, but a dayoff
        assertEquals(true, w.sleepIn(false, true)); //it a vacation
        assertEquals(true, w.sleepIn(true, true)); //it a vacation but a weekday
        assertEquals(false, w.sleepIn(true, false)); //it not a vacation, and a weekday
    }

    @Test
    void sumDouble() {
        assertEquals(3, w.sumDouble(1, 2));
        assertEquals(5, w.sumDouble(3, 2));
        assertEquals(8, w.sumDouble(2, 2));
    }

    @Test
    void diff21() {
        assertEquals(2, w.diff21(19));
        assertEquals(11, w.diff21(10));
        assertEquals(21, w.diff21(0));
        assertEquals(8, w.diff21(25));
    }
    @Test
    void parrotTrouble() {
        assertTrue(w.parrotTrouble(true, 6));
        assertTrue(w.parrotTrouble(true, 23));

        assertFalse(w.parrotTrouble(true, 7));
        assertFalse(w.parrotTrouble(false, 6));

    }

    @Test
    void makes10() {
        assertTrue(w.makes10(10, 0));
        assertTrue(w.makes10(15, 10));
        assertTrue(w.makes10(6, 4));
        assertFalse(w.makes10(4, 4));

    }

    @Test
    void nearHundred() {
        assertTrue(w.nearHundred(93));
        assertTrue(w.nearHundred(90));
        assertTrue(w.nearHundred(110));
        assertTrue(w.nearHundred(190));
        assertTrue(w.nearHundred(210));
        assertFalse(w.nearHundred(89));
        assertFalse(w.nearHundred(189));
        assertFalse(w.nearHundred(211));
    }

    @Test
    void posNeg() {
        assertTrue(w.posNeg(1, -1, false));
        assertTrue(w.posNeg(-1, 1, false));
        assertTrue(w.posNeg(-4, -5, true));

        assertFalse(w.posNeg(4, 5, false));
        assertFalse(w.posNeg(-4, -5, false));
        assertFalse(w.posNeg(1, -1, true));
        assertFalse(w.posNeg(-1, 1, true));

    }

    @Test
    void notString() {
        assertEquals("not candy", w.notString("candy"));
        assertEquals("not x", w.notString("x"));
        assertEquals("not bad", w.notString("not bad"));
    }

    @Test
    void missingChar() {
        assertEquals("ktten", w.missingChar("kitten", 1));
        assertEquals("itten", w.missingChar("kitten", 0));
        assertEquals("kittn", w.missingChar("kitten", 4));
        assertEquals("kitte", w.missingChar("kitten", 5));
    }

    @Test
    void frontBack() {
        assertEquals("eodc", w.frontBack("code"));
        assertEquals("a", w.frontBack("a"));
        assertEquals("ba", w.frontBack("ab"));
        assertEquals("", w.frontBack(""));
    }

    @Test
    void front3() {
        assertEquals("abcabcabc", w.front3("abcd"));
        assertEquals("aaa", w.front3("a"));
        assertEquals("", w.front3(""));
    }

}