package com.java.pattern;

// Write a java program to print below pattern

/**
 * 1
 * 22
 * 333
 * 4444
 * 55555
 */

public class Pattern5 {
    public static void main(String[] args) {
        int num = 5;
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int s = 1; s <= 5 - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
