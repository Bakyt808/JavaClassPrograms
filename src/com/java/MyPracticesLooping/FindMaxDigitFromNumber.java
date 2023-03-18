package com.java.MyPracticesLooping;

// Write a program to print max digit of in a given number
// Example
// input - 45364 , output - 6

public class FindMaxDigitFromNumber {
    public static void main(String[] args) {
        int num = 1234564;
        int max = num % 10;

        while (num > 0) {
            if (num % 10 > max) {
                max = num % 10;
            }
            num = num / 10;
        }
        System.out.println(max);
    }
}