package com.gnevashev;

import com.sun.deploy.util.StringUtils;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.regex.Pattern;

public class String2 {

    //Given a string, return a string where for every char in the original, there are two chars.
    public String doubleChar(String str) {
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        for (char c : arr) {
            sb.append(c).append(c);
        }
        return sb.toString();
    }

    //Return the number of times that the string "hi" appears anywhere in the given string.
    public int countHi(String str) {
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 'h' && arr[i+1] == 'i') {
                count++;
            }
        }
        return count;
    }

    //Return true if the string "cat" and "dog" appear the same number of times in the given string.
    public boolean catDog(String str) {
        char[] arr = str.toCharArray();
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < arr.length-2; i++) {
            if (arr[i] == 'c' && arr[i+1] == 'a' && arr[i+2] == 't') {
                countCat++;
            }
            if (arr[i] == 'd' && arr[i+1] == 'o' && arr[i+2] == 'g') {
                countDog++;
            }
        }
        return (countCat == countDog);
    }

    //Return the number of times that the string "code" appears anywhere in the given string,
    //except we'll accept any letter for the 'd', so "cope" and "cooe" count.
    public int countCode(String str) {
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length-3; i++) {
            if (arr[i] == 'c' && arr[i+1] == 'o' && arr[i+3] == 'e') {
                count++;
            }
        }
        return count;
    }

    //Given two strings, return true if either of the strings appears at the very end of the other string, ignoring
    //upper/lower case differences (in other words, the computation should not be "case sensitive").
    //Note: str.toLowerCase() returns the lowercase version of a string.
    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        return (a.endsWith(b) || b.endsWith(a));
    }

    //Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by
    //a period (.). So "xxyz" counts but "x.xyz" does not.
    public boolean xyzThere(String str) {
        return (str.matches("(.*)([^.]|^)xyz(.*)"));
    }

    //Return true if the given string contains a "bob" string, but where the middle 'o' char
    //can be any char.
    public boolean bobThere(String str) {
        return str.matches("(.*)b.b(.*)");
    }

    //We'll say that a String is xy-balanced if for all the 'x' chars in the string,
    //there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not.
    //One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
    public boolean xyBalance(String str) {
        return (str.lastIndexOf('x') <= str.lastIndexOf('y'));
    }

    //Given two strings, a and b, create a bigger string made of the first char of a, the first char
    //of b, the second char of a, the second char of b, and so on. Any leftover chars go at the
    //end of the result.
    public String mixString(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int aLength = a.length();
        int bLength = b.length();
        for (int i = 0; i < Math.max(aLength, bLength); i++) {
            if (i < aLength) {
                sb.append(a.charAt(i));
            }
            if (i < bLength) {
                sb.append(b.charAt(i));
            }
        }
        return sb.toString();
    }

    //Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
    //You may assume that n is between 0 and the length of the string, inclusive.
    public String repeatEnd(String str, int n) {
        String result = "";
        String end = str.substring(str.length()-n);
        for (int i = 0; i < n; i++) {
            result += end;
        }
        return result;
    }

    //Given a string and an int n, return a string made of the first n characters of the string,
    //followed by the first n-1 characters of the string, and so on. You may assume that n is
    //between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
    public String repeatFront(String str, int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = n; i > 0; i--) {
            sb.append(str.substring(0, i));
        }
        return sb.toString();
    }

    //Given two strings, word and a separator sep, return a big string made of count
    //occurrences of the word, separated by the separator string.
    public String repeatSeparator(String word, String sep, int count) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < count; i++) {
            if (i >= 1) {
                sb.append(sep);
            }
            sb.append(word);
        }
        return sb.toString();
    }

    //Given a string, consider the prefix string made of the first N chars of the string.
    //Does that prefix string appear somewhere else in the string?
    //Assume that the string is not empty and that N is in the range 1..str.length()
    public boolean prefixAgain(String str, int n) {
        return (str.indexOf(str.substring(0, n), n) != -1);
    }

    //Given a string, does "xyz" appear in the middle of the string? To define middle,
    //we'll say that the number of chars to the left and right of the "xyz" must differ
    //by at most one. This problem is harder than it looks.
    public boolean xyzMiddle(String str) {
        int midStringIndex = str.length() / 2;
        int indexOf = -1;
        if (str.length() < 3) return false;
        if (str.length() % 2 == 0) {
            indexOf = str.indexOf("xyz", midStringIndex - 2);
            return (indexOf == midStringIndex-2 || indexOf == midStringIndex-1);
        }
        else {
            indexOf = str.indexOf("xyz", midStringIndex - 1);
            return (indexOf == midStringIndex-1);
        }
    }
}
