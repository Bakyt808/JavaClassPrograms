package com.java.MyPracticesLooping;

// Write a program to find factorial of given number
// 5! = 1 * 2 * 3 * 4 * 5

public class ToPrintFactorialOfGivenNumber {
    public static void main(String[] args) {

        int fact = 5;
        int sum = 1;

        for (int i = 1; i <= fact; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
