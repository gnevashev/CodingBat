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
}