package com.java.MyPracticesLooping;

// Write a program to find result of the series
// 1^2 + 2^2 + 3^2 + 4^2 + 5^2

public class FindResultOfSeries3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum = sum + i * i;
        }
        System.out.println(sum);
    }
}
