package com.gnevashev;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "";
        System.out.println(str.length());

        String str1 = new String("1111");

        String str2 = "1111";

        if(str1 == str2) {
            System.out.println("passed");
        }
        else{
            System.out.println("not passed");
        }
    }
}
