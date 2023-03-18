package com.java.MyPracticesLooping;

// Write a program to reverse the given number
// Input 456 , Output 654

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 987654321;
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);
    }
}