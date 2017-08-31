package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array1Test {
    Array1 a = new Array1();

    @Test
    void reverse3() {
        assertArrayEquals(new int[]{3, 2, 1}, a.reverse3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{9, 11, 5}, a.reverse3(new int[]{5, 11, 9}));
        assertArrayEquals(new int[]{4, 3, 2, 1}, a.reverse3(new int[]{1, 2, 3, 4}));
    }

    @Test
    void rotateLeft3() {
        assertArrayEquals(new int[]{2, 3, 1}, a.rotateLeft3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{11, 9, 5}, a.rotateLeft3(new int[]{5, 11, 9}));
    }

    @Test
    void sum3() {
        assertEquals(6, a.sum3(new int[]{1, 2, 3}) );
        assertEquals(18, a.sum3(new int[]{5, 11, 2}));
        assertEquals(7, a.sum3(new int[]{7, 0, 0}));
    }

    @Test
    void commonEnd() {
        assertTrue(a.commonEnd(new int[]{1, 2, 3}, new int[] {7, 3}));
        assertTrue(a.commonEnd(new int[]{1, 2, 4}, new int[] {1, 4}));
        assertFalse(a.commonEnd(new int[]{1, 2, 4}, new int[] {7, 3, 2}));
    }

    @Test
    void makePi() {
        assertArrayEquals(new int[]{3, 1, 4}, a.makePi());
    }

    @Test
    void sameFirstLast() {
        assertTrue(a.sameFirstLast(new int[]{1, 2, 3, 4, 5, 1}));
        assertFalse(a.sameFirstLast(new int[]{1, 2, 3, 4, 5}));
        assertTrue(a.sameFirstLast(new int[]{1}));
        assertFalse(a.sameFirstLast(new int[]{}));
    }

    @Test
    void firstLast6() {
        assertTrue(a.firstLast6(new int[]{1, 2, 6}));
        assertTrue(a.firstLast6(new int[]{6, 1}));
        assertFalse(a.firstLast6(new int[]{1, 2, 3}));
    }

    @Test
    void front11() {
        assertArrayEquals(new int[]{1, 7}, a.front11(new int[] {1, 2, 3}, new int[] {7,8}));
        assertArrayEquals(new int[]{1, 2}, a.front11(new int[] {1}, new int[] {2}));
        assertArrayEquals(new int[]{1}, a.front11(new int[] {1, 7}, new int[]{}));
    }

}