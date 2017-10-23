package com.gnevashev;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test {
    Map1 m = new Map1();

    //Modify and return the given map as follows: for this problem the map may or may not contain
    //the "a" and "b" keys. If both keys are present, append their 2 string values together and
    //store the result under the key "ab".
    @Test
    void mapAB() {
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> expected = new HashMap<>();

        //testcase 1
        map.put("a", "Hi");
        map.put("b", "There");

        expected.put("a", "Hi");
        expected.put("b", "There");
        expected.put("ab", "HiThere");
        assertEquals(expected, m.mapAB(map));

        map.clear();
        expected.clear();

        //testcase 2
        map.put("a", "Hi");
        expected.put("a", "Hi");
        assertEquals(expected, m.mapAB(map));

        map.clear();
        expected.clear();
        //testcase 3
        map.put("b", "There");
        expected.put("b", "There");
        assertEquals(expected, m.mapAB(map));
    }

    //Modify and return the given map as follows: if the key "a" has a value, set the key "b" to
    //have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.
    @Test
    void mapShare() {
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> expected = new HashMap<>();
        //test case 1
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");

        expected.put("a", "aaa");
        expected.put("b", "aaa");
        assertEquals(expected, m.mapShare(map));

        map.clear();
        expected.clear();
        //test case 2
        map.put("b", "xyz");
        map.put("c", "ccc");

        expected.put("b", "xyz");
        assertEquals(expected, m.mapShare(map));

        map.clear();
        expected.clear();
        //test case 3
        map.put("a", "aaa");
        map.put("c", "meh");
        map.put("d", "hi");

        expected.put("a", "aaa");
        expected.put("b", "aaa");
        expected.put("d", "hi");
        assertEquals(expected, m.mapShare(map));
    }

    //Modify and return the given map as follows: if the key "a" has a value, set the key "b" to
    //have that value, and set the key "a" to have the value "". Basically "b" is a bully,
    //taking the value and replacing it with the empty string.
    @Test
    void mapBully() {
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> expected = new HashMap<>();

        //test case 1
        map.put ("a", "candy");
        map.put ("b", "dirt");
        expected.put("a", "");
        expected.put("b", "candy");
        assertEquals(expected, m.mapBully(map));

        expected.clear();
        map.clear();

        //test case 2
        map.put("a", "candy");
        expected.put ("a", "");
        expected.put ("b", "candy");
        assertEquals(expected, m.mapBully(map));

        expected.clear();
        map.clear();
        //test case 3
        map.put("a", "candy");
        map.put("b", "carrot");
        map.put("c", "meh");
        expected.put("a", "");
        expected.put("b", "candy");
        expected.put("c", "meh");
        assertEquals(expected, m.mapBully(map));
    }

}