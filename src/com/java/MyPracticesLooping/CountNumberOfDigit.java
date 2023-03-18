package com.java.MyPracticesLooping;

// Write a program to count number of digit of in a given number
// Example
// input - 45364 , output - 5

public class CountNumberOfDigit {
    public static void main(String[] args) {
        int num = 123565;
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
