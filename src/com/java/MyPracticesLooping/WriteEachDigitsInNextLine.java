package com.java.MyPracticesLooping;

// Write a program to separate each digit of a number

// Example input - 123
// Output
// 3
// 2
// 1

public class WriteEachDigitsInNextLine {
    public static void main(String[] args) {
        int num = 12345;
        while (num != 0) {
            System.out.println(num % 10);
            num = num / 10;
        }
    }

}
