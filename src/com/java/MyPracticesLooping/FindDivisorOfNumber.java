package com.java.MyPracticesLooping;

// Write a program to find divisor or factorial of given number

// Divisor - a number that divides an integer num perfectly

// Example - Input 6, Output - 1, 2, 3, 6

public class FindDivisorOfNumber {
    public static void main(String[] args) {
        int num = 20;
        for (int i = 1; i<=num; i++)    {
            if (num%i==0) {
                System.out.print(i +", ");
            }
        }
    }
}
