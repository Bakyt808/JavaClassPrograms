package com.java.MyPracticesLooping;

// Write a program to print 1 10 2 9 3 8 4 7 5 6

public class ProgramToPrintZigZag {
    public static void main(String[] args) {
        int j = 10;
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ", ");
            System.out.print(j + ", ");
            j--;
        }
    }
}
