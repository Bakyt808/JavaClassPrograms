package com.java.MyPtacyicesLooping;

// Write a program to print sum of even number from 1 to 10
// Output 30

public class SumOfEvenNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int sum = 0;
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}
