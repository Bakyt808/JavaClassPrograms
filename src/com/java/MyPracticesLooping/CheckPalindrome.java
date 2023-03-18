package com.java.MyPracticesLooping;

// Write a program to check given number is Palindrome number or not
// Palindrome number - remains the same when its digits are reversed.

// Input - 121, Output - Palindrome
// Input - 122, Output - Not Palindrome

public class CheckPalindrome {
    public static void main(String[] args) {
        int num = 121;
        int backup = num;
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        if (rev == backup) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");

        }
    }
}
