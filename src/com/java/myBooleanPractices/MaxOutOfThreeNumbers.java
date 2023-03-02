package com.java.myBooleanPractices;

// Write a program to find maximum number out of three numbers

// Input - 40, 10, 20,  Output - 40;
// Input - 100, 50, 99,  Output - 100;

public class MaxOutOfThreeNumbers {
    public static void main(String[] args) {
        int a = 40, b = 50, c = 100;

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
