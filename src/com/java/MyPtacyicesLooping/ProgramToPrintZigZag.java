package com.java.MyPtacyicesLooping;

// Write a program to print 1 10 2 9 3 8 4 7 5 6

public class ProgramToPrintZigZag {
    public static void main(String[] args) {
        for (int i = 1, j = 10; i <= 5; i++, j--) {
            System.out.print(i + ", ");
            System.out.print(j + ", ");
        }
    }
}
