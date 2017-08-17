package com.gnevashev;

import static java.lang.Math.abs;

public class WarmUp1 {

    //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    // We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }

    //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    // We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

    static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile || !aSmile && !bSmile);
    }

    //Given two int values, return their sum.
    // Unless the two values are the same, then return double their sum.
    int sumDouble(int a, int b) {
       if (a == b)
           return (a+b)*2;
       else
           return (a + b);
    }

    //Given an int n, return the absolute difference between n and 21,
    // except return double the absolute difference if n is over 21.

    int diff21(int n) {
        //if n is over 21 return double the absolute difference
        if (n > 21)
            return 2*(n-21);
        //else return the difference between n and 21
        else
            return 21-n;
    }

    //We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
    // We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
    boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    boolean makes10(int a, int b) {
        return (a+b == 10 || a==10 || b==10);
    }


    //Given an int n, return true if it is within 10 of 100 or 200.
    // Note: Math.abs(num) computes the absolute value of a number.
    public boolean nearHundred(int n) {
        return (abs(100-n)<=10 || abs(200-n)<=10);
    }

    //Given 2 int values, return true if one is negative and one is positive.
    // Except if the parameter "negative" is true, then return true only if both are negative.
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative && a < 0 && b < 0) return true;
        return (!negative && ((a < 0 && b > 0) || (a > 0 && b < 0)));
    }
    //Given a string, return a new string where "not " has been added to the front. However, if
    // the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        else {
            return "not ".concat(str);
        }
    }





}
