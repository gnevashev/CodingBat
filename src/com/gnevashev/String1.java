package com.gnevashev;

public class String1 {


    public String helloName(String name) {
        return "Hello ".concat(name).concat("!");
    }

    //Given two strings, a and b, return the result of putting them together in the order abba,
    // e.g. "Hi" and "Bye" returns "HiByeByeHi".
    public String makeAbba(String a, String b) {
        return (a + b + b + a);
    }

    //The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
    //In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
    //Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
    public String makeTags(String tag, String word) {
        return ("<"+tag+">" + word + "</"+tag+">");
    }

    //Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string,
    // e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
    public String makeOutWord(String out, String word) {
        return (out.substring(0, 2) + word + out.substring(2));
    }


    //Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    //The string length will be at least 2.
    public String extraEnd(String str) {
        String end = str.substring(str.length()-2);
        return end+end+end;
    }

    //Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string
    //is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields
    //the empty string "". Note that str.length() returns the length of a string.

    public String firstTwo(String str) {
        return (str.substring(0, Math.min(str.length(), 2)));
    }


    //Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
    //and otherwise return the string unchanged. This is a little harder than it looks.
    public String withoutX2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(i < 2 && str.charAt(i) == 'x'))
            {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

}
