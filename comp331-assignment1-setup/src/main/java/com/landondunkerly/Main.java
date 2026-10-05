package com.landondunkerly;

public class Main {

    // method to reverse a string
    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello, I am landon"));   // expect: olleh
        System.out.println(reverse(""));        // expect: (empty line)
    }
}