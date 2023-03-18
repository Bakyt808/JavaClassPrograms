package com.java.MyPracticesLooping;

// Write a program to print even number from 1 to 10
// Output should be 2 4 6 8 10

public class ToPrintEvenNumberFrom1To10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if ( i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
