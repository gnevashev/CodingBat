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
    //Given a non-empty string like "Code" return a string like "CCoCodCode".
    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i <= str.length(); i++) {
            result += str.substring(0, i);
        }
        return result;
    }
    //Given a string, return the count of the number of times that a substring length 2 appears in the string
    //and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
    public int last2(String str) {
        if (str.length() < 2) return 0;
        String substr = str.substring(str.length()-2);
        int count = 0;
        for (int i = 0; i < str.length()-2 ; i++) {
           if (str.startsWith(substr, i)) count++;
        }
        return count;
    }

    //Given an array of ints, return the number of 9's in the array.
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) count++;
        }
        return count;
    }

    //Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < Math.min(nums.length, 4) ; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }

    //Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) return true;
        }
        return false;
    }

    //Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
    //So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
    public int stringMatch(String a, String b) {
        int count = 0;
        for (int i = 0; i < Math.min(a.length(), b.length())-1; i++) {
            if (a.startsWith(b.substring(i, i+2), i))
                count++;
        }
        return count;
    }

    //Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
    public String stringX(String str) {
        StringBuilder result = new StringBuilder();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i == arr.length-1 || arr[i] != 'x') {
                result.append(arr[i]);
            }

        }
        return result.toString();
    }



}
