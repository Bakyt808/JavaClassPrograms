package com.java.MyPtacyicesLooping;

// Write a program to print number from 1 to 50 which is divisible by 5 or 3
// Output  - 3 5 6 9 10 12 15
public class ToPrintNumberDivisibleBy5Or3From1To50 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
