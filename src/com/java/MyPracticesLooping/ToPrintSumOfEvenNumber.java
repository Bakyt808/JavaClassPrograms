package com.java.MyPracticesLooping;

// Write a program to print sum of even number from 1 to 10
// Output 30

public class ToPrintSumOfEvenNumber {
    public static void main(String[] args) {
        int sum = 0;
        int num = 10;
        for (int i = 1; i <= num; i++) {
            if (i%2==0) {
                sum = sum +i;
            }
        }
        System.out.println(sum);
    }
}
