package com.gnevashev;

public class String3 {

    //Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and
    //the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z
    //is at the end of a word if there is not an alphabetic letter immediately following it.
    //Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
    public int countYZ(String str) {
        String[] splitStr = str.toUpperCase().split("(\\W|[0-9])");
        //String[] splitStr = str.toUpperCase().split("[0-9]");
        int count = 0;
        for (int i = 0; i < splitStr.length; i++) {
            if (splitStr[i].endsWith("Y") || splitStr[i].endsWith("Z")) {
                count++;
            }
        }
        return count;
    }

    //Given two strings, base and remove, return a version of the base string where all
    //instances of the remove string have been removed (not case sensitive). You may assume
    //that the remove string is length 1 or more. Remove only non-overlapping instances, so
    //with "xxx" removing "xx" leaves "x".
    public String withoutString(String base, String remove) {
        remove = "(?i)" + remove; //make case insensitive;
        return base.replaceAll(remove, "");
    }

    //Given a string, return true if the number of appearances of "is" anywhere in the string is
    //equal to the number of appearances of "not" anywhere in the string (case sensitive).
    public boolean equalIsNot(String str) {
        int fromIndex = 0;
        int countOfIs = 0;
        int countOfNot = 0;
        do {
            fromIndex = str.indexOf("is", fromIndex);
            if (fromIndex != - 1) {
                countOfIs++;
                fromIndex++;
            }
        } while (fromIndex != -1);

        fromIndex = 0; //return fromIndex to the begining of the string

        do {
            fromIndex = str.indexOf("not", fromIndex);
            if (fromIndex != - 1) {
                countOfNot++;
                fromIndex++;
            }
        } while (fromIndex != -1);

        return (countOfIs == countOfNot);
    }

    //We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its
    //left or right. Return true if all the g's in the given string are happy.
    public boolean gHappy(String str) {
        return (!str.matches("(.*)(^|[^g])g([^g]|$)(.*)"));
    }

    //We'll say that a "triple" in a string is a char appearing three times in a row.
    //Return the number of triples in the given string. The triples may overlap.
    public int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)) {
                count++;
            }
        }
        return count;
    }


    //Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
    //Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
    //Integer.parseInt(string) converts a string to an int.)
    public int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(str.substring(i, i+1));
            }
        }
        return sum;
    }
}