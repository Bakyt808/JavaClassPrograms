package com.java.MyPtacyicesLooping;

// Write a program to print sum of 1 to 10

public class FindTableOfGivenNumber {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}