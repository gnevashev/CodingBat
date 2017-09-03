package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class String1Test {

    String1 w = new String1();

    //Given a string and an index, return a string length 2 starting at the given index.
    //If the index is too big or too small to define a string length 2, use the first 2 chars.
    //The string length will be at least 2.
    @Test
    void twoChar() {
        assertEquals("ja", w.twoChar("java", 0));
        assertEquals("va", w.twoChar("java", 2));
        assertEquals("ja", w.twoChar("java", 3));
        assertEquals("ja", w.twoChar("java", -1));
        assertEquals("ja", w.twoChar("java", 15));
    }

    //Given a string and an int n, return a string made of the first and last n chars from the string.
    //The string length will be at least n.
    @Test
    void nTwice() {
        assertEquals("Helo", w.nTwice("Hello", 2));
        assertEquals("Choate", w.nTwice("Chocolate", 3));
        assertEquals("Ce", w.nTwice("Chocolate", 1));
    }

    //Given a string, return true if it ends in "ly".
    @Test
    void endsLy() {
        assertTrue(w.endsLy("oddly"));
        assertFalse(w.endsLy("y"));
        assertFalse(w.endsLy(""));
        assertFalse(w.endsLy("oddy"));
    }

    //Given a string, return a version without both the first and last char of the string.
    // The string may be any length, including 0.
    @Test
    void withouEnd2() {
        assertEquals("ell", w.withouEnd2("Hello"));
        assertEquals("b", w.withouEnd2("abc"));
        assertEquals("", w.withouEnd2("ab"));
        assertEquals("", w.withouEnd2(""));
    }

    //Given a string, return a string length 1 from its front, unless front is false,
    //in which case return a string length 1 from its back. The string will be non-empty.
    @Test
    void theEnd() {
        assertEquals("H", w.theEnd("Hello", true));
        assertEquals("o", w.theEnd("Hello", false));
        assertEquals("o", w.theEnd("oh", true));
    }

    //Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
    //The string length will be at least 2.
    @Test
    void right2() {
        assertEquals("loHel", w.right2("Hello"));
        assertEquals("Hi", w.right2("Hi"));
    }

    //Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
    //The string length will be at least 2.
    @Test
    void left2() {
        assertEquals("lloHe", w.left2("Hello"));
        assertEquals("Hi", w.left2("Hi"));
    }

    //Given 2 strings, return their concatenation, except omit the first char of each.
    //The strings will be at least length 1.
    @Test
    void nonStart() {
        assertEquals("ellohere", w.nonStart("Hello", "There"));
        assertEquals("avaode", w.nonStart("java", "code"));
        assertEquals("", w.nonStart("a", "b"));
    }

    //Given 2 strings, a and b, return a string of the form short+long+short,
    //with the shorter string on the outside and the longer string on the inside.
    //The strings will not be the same length, but they may be empty (length 0).
    @Test
    void comboString() {
      assertEquals("hiHellohi", w.comboString("Hello", "hi"));
      assertEquals("hiHellohi", w.comboString("hi", "Hello"));
      assertEquals("aaa", w.comboString("aaa", ""));
    }

    //Given a string, return a version without the first and last char,
    //so "Hello" yields "ell". The string length will be at least 2.
    @Test
    void withoutEnd() {
        assertEquals("ell", w.withoutEnd("Hello"));
        assertEquals("av", w.withoutEnd("java"));
        assertEquals("odin", w.withoutEnd("coding"));
        assertEquals("", w.withoutEnd("ab"));
    }

    //Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    @Test
    void firstHalf() {
        assertEquals("Woo", w.firstHalf("WooHoo"));
        assertEquals("Hello", w.firstHalf("HelloThere"));
    }

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