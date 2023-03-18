package com.java.MyPracticesLooping;

// Write a program to print sum of digit of in a given number


public class SumOfEachDigit {
    public static void main(String[] args) {
        int num = 45645;
        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
