package com.gnevashev;

import java.util.Map;

public class Map1 {

    //Modify and return the given map as follows: if the key "a" has a value, set the key "b" to
    //have that value, and set the key "a" to have the value "". Basically "b" is a bully,
    //taking the value and replacing it with the empty string.
    public Map<String, String> mapBully(Map<String, String> map) {
        String aValue = map.get("a");
        if (aValue != null) {
            map.put("b", aValue);
            map.put("a", "");
        }
        return map;
    }

    //Modify and return the given map as follows: if the key "a" has a value, set the key "b" to
    //have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.
    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

    //Modify and return the given map as follows: for this problem the map may or may not contain
    //the "a" and "b" keys. If both keys are present, append their 2 string values together and
    //store the result under the key "ab".
    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a").concat(map.get("b")));
        }
        return map;
    }

    //Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream"
    //is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }

}
