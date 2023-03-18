package com.java.MyPracticesLooping;

// Write a program to print 1 10 2 9 3 8 4 7 5 6
// Clean Version

public class ProgramToPrintZigZagC {
    public static void main(String[] args) {
        for (int i = 1, j = 10; i <= 5; i++, j--) {
            System.out.print(i + ", ");
            System.out.print(j + ", ");
        }
    }
}
