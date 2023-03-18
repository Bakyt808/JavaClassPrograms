package com.java.pattern;

// Write a java program to print below pattern

/**
 * 11111
 * 22222
 * 33333
 * 44444
 * 55555
 */

public class Pattern3 {
    public static void main(String[] args) {
        int num = 5;
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
