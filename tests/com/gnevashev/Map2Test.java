package com.gnevashev;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test {
    private Map2 m = new Map2();

    private HashMap<String, Integer> map = new HashMap<>();
    private HashMap<String, Integer> expected = new HashMap<>();

    //The classic word-count algorithm: given an array of strings, return a Map<String, Integer>
    //with a key for each different string, with the value the number of times that string appears in the array.
    @Test
    void wordCount() {
        //testcase1
        //wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
        map.clear();
        expected.clear();
        expected.put("a", 2);
        expected.put("b", 2);
        expected.put("c", 1);
        assertEquals(expected, m.wordCount(new String[]{"a", "b", "a", "c", "b"}));

        //testcase2
        //wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
        expected.clear();
        expected.put("a", 1);
        expected.put("b", 1);
        expected.put("c", 1);
        assertEquals(expected, m.wordCount(new String[]{"c", "b", "a"}));

        //testcase3
        //wordCount(["c", "c", "c", "c"]) → {"c": 4}
        expected.clear();
        expected.put("c", 4);
        assertEquals(expected, m.wordCount(new String[]{"c", "c", "c", "c"}));

    }

    //Given an array of non-empty strings, create and return a Map<String, String> as follows:
    //for each string add its first character as a key with its last character as the value.
    @Test
    void pairs() {
        Map<String, String> expected = new HashMap<>();
        //testcase1
        //pairs(["code", "bug"]) → {"b": "g", "c": "e"}
        map.clear();
        expected.clear();
        expected.put("b", "g");
        expected.put("c", "e");
        assertEquals(expected, m.pairs(new String[]{"code", "bug"}));

        //testcase2
        //pairs(["man", "moon", "main"]) → {"m": "n"}
        expected.clear();
        expected.put("m", "n");
        assertEquals(expected, m.pairs(new String[]{"man", "moon", "main"}));

        //testcase3
        // pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
        expected.clear();
        expected.put("g", "d");
        expected.put("m", "n");
        expected.put("n", "t");
        assertEquals(expected, m.pairs(new String[]{"man", "moon", "good", "night"}));
    }

    //Given an array of strings, return a Map<String, Integer> containing a key
    //for every different string in the array, and the value is that string's length.
    @Test
    void wordLen() {
        //testcase1
        //wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
        expected.clear();
        expected.put("bb", 2);
        expected.put("a", 1);
        assertEquals(expected, m.wordLen(new String[]{"a", "bb", "a", "bb"}));

        //testcase2
        //wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
        expected.clear();
        expected.put("that", 4);
        expected.put("and", 3);
        expected.put("this", 4);
        assertEquals(expected, m.wordLen(new String[]{"this", "and", "that", "and"}));

        //testcase3
        //wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
        expected.clear();
        expected.put("code", 4);
        expected.put("bug", 3);
        assertEquals(expected, m.wordLen(new String[]{"code", "code", "code", "bug"}));
    }

    //Given an array of strings, return a Map<String, Integer> containing a key for every
    //different string in the array, always with the value 0. For example the string "hello" makes
    //the pair "hello":0. We'll do more complicated counting later, but for this problem the value
    //is simply 0.
    @Test
    void word0() {
        //testcase1
        expected.clear();
        expected.put("a", 0);
        expected.put("b", 0);
        assertEquals(expected, m.word0(new String[]{"a", "b", "a", "b"}));

        //testcase2
        expected.clear();
        expected.put("a", 0);
        expected.put("b", 0);
        expected.put("c", 0);
        assertEquals(expected, m.word0(new String[]{"a", "b", "a", "c", "b"}));

        //testcase3
        expected.clear();
        expected.put("a", 0);
        expected.put("b", 0);
        expected.put("c", 0);
        assertEquals(expected, m.word0(new String[]{"c", "b", "a"}));
    }

}