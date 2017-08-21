package com.gnevashev;

class WarmUp2 {
    //Given a string and a non-negative int n, return a larger string that is n copies of the original string.
    String stringTimes(String str, int n) {
        String resultStr="";
        for (int i=0; i<n; i++){
            resultStr = resultStr + str;
        }
        return resultStr;
    }

    //Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
    // or whatever is there if the string is less than length 3. Return n copies of the front;
    String frontTimes(String str, int n) {
        String result = "";
        if (str.length() > 3) {
            str = str.substring(0, 3);
        }

        for (int i = 0; i < n; i++){
            result += str;
        }
        return result;
    }


    //Count the number of "xx" in the given string.
    //We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
    int countXX(String str) {
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 'x' && arr[i+1] == 'x') {
                count++;
            }
        }
        return count;
    }

    //Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
    boolean doubleX(String str) {
        int i = str.indexOf('x');
        //if x not found or first x found in the last character
        if (i == -1 || i == str.length()-1) return false;

        //if the following also x
        if (str.charAt(i+1) == 'x') return true;
        return false;
    }

    //Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i=i+2) {
            result += str.charAt(i);
        }
        return result;
    }

}
