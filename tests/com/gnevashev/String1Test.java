package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class String1Test {
    String1 w = new String1();

    @Test
    void withoutX2() {
        assertEquals("Hi", w.withoutX2("xHi"));
        assertEquals("", w.withoutX2(""));
        assertEquals("", w.withoutX2("x"));
        assertEquals("H", w.withoutX2("H"));
        assertEquals("Hi", w.withoutX2("Hxi"));
        assertEquals("Hi", w.withoutX2("Hi"));
    }
    @Test
    void firstTwo() {
        assertEquals("", w.firstTwo(""));
        assertEquals("X", w.firstTwo("X"));
        assertEquals("ab", w.firstTwo("abc"));
    }

    @Test
    void extraEnd() {
        assertEquals("lololo", w.extraEnd("Hello"));
        assertEquals("ababab", w.extraEnd("ab"));
        assertEquals("HiHiHi", w.extraEnd("Hi"));
    }

    @Test
    void makeOutWord() {
        assertEquals("<<Yay>>", w.makeOutWord("<<>>", "Yay"));
        assertEquals("<<WooHoo>>", w.makeOutWord("<<>>", "WooHoo"));
        assertEquals("[[word]]", w.makeOutWord("[[]]", "word"));
    }

    @Test
    void makeTags() {
        assertEquals("<i>Yay</i>", w.makeTags("i", "Yay"));
        assertEquals("<i>Hello</i>", w.makeTags("i", "Hello"));
        assertEquals("<cite>Yay</cite>", w.makeTags("cite", "Yay"));
    }

    @Test
    void makeAbba() {
        assertEquals("HiByeByeHi", w.makeAbba("Hi", "Bye"));
        assertEquals("YoAliceAliceYo", w.makeAbba("Yo", "Alice"));
    }
    @Test
    void helloName() {
        assertEquals("Hello Bob!", w.helloName("Bob"));
        assertEquals("Hello X!", w.helloName("X"));
    }

}