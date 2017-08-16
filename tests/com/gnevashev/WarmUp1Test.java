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


}