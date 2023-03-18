package com.java.MyPracticesLooping;

// Write a program to print sum of 1-10

public class ToPrintSumOf1To10 {
    public static void main(String[] args) {

        int num = 10;
        int temporary = 0;

        for (int i = 1; i<=num; i++)  {
            temporary = temporary + i;
        }
        System.out.println(temporary);
    }
}