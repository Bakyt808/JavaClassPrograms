package com.java.myBasicPractices;

// Program to swap values of two variables

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int a = 10, b = 20;

        int c;

        c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);
    }
}
