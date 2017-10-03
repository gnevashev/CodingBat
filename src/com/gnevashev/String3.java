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

    //Given a string, return the longest substring that appears at both the beginning and end of
    //the string without overlapping. For example, sameEnds("abXab") is "ab".
    public String sameEnds(String string) {
        int maxLength = 0;
        for (int i = 0; i < string.length()/2; i++) {
            if (string.substring(0, i+1).equals(string.substring(string.length() - i- 1))){
                maxLength = i + 1;
            }

        }
        return string.substring(0, maxLength);
    }

    //Given a string, look for a mirror image (backwards) string at both the beginning and end of
    //the given string. In other words, zero or more characters at the very begining of the given
    //string, and at the very end of the string in reverse order (possibly overlapping). For
    //example, the string "abXYZba" has the mirror end "ab".
    public String mirrorEnds(String string) {
        char[] arr = string.toCharArray();
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < arr.length && arr[i] == arr[arr.length - 1 - i]) {
            sb.append(arr[i]);
            i++;
        }
        return sb.toString();
    }

    //Given a string, return the length of the largest "block" in the string. A block is a run of
    //adjacent chars that are the same.
    public int maxBlock(String str) {
        char[] arr = str.toCharArray();
        if (arr.length == 0) return 0; //if string is empty
        char arrI = arr[0];
        int maxBlock = 1;
        int curBlock = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arrI == arr[i]) { //looping through "block" of adjustment chars
                curBlock++;
            }
            else { //if adjacent chars are over
                curBlock = 1;
                arrI = arr[i];
            }
            maxBlock = Math.max(maxBlock, curBlock);
        }
        return maxBlock;
    }

    //Given a string, return the sum of the numbers appearing in the string, ignoring all other
    //characters. A number is a series of 1 or more digit chars in a row. (Note:
    //Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
    //Integer.parseInt(string) converts a string to an int.)
    public int sumNumbers(String str) {
        String[] arrStr = str.split("\\D");
        int total = 0;
        for (int i = 0; i < arrStr.length; i++) {
            if (!arrStr[i].isEmpty()) {
                total += Integer.parseInt(arrStr[i]);
            }
        }
        return total;
    }

    //Given a string, return a string where every appearance of the lowercase word "is" has been
    //replaced with "is not". The word "is" should not be immediately preceeded or followed by a
    //letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char)
    //tests if a char is a letter.)
    public String notReplace(String str) {
        return str.replaceAll("\\bis\\b", "is not");
    }
}
