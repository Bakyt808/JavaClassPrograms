package com.java.myBasicPractices;

// Program to swap values of two variables without using third variable.

public class SwapTwoNumbersWithoutUsingThirdVariable {
    public static void main(String[] args) {

        int a = 10, b = 20;

        a=a+b; //30
        b=a-b; //10
        a=a-b; //20

        System.out.println(a);
        System.out.println(b);
    }
}
