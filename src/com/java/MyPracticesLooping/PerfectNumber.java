package com.java.MyPracticesLooping;

// Write a program to check given number is Perfect or not

// Perfect number, a positive integer that is equal to the sum of its proper divisors

// input 6 divisor - 1 2 3  output - Perfect
// input 10 divisors - 2 5  output - not perfect

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28;
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == num) {
            System.out.println("Perfect");
        } else {
            System.out.println("Not Perfect");
        }
    }
}
