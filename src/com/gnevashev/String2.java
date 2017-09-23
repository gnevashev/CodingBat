package com.gnevashev;

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
}
