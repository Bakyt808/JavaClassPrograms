package com.java.pattern;

// Write a java program to print below pattern

/**
 * 12345
 * 12345
 * 12345
 * 12345
 * 12345
 */

public class Pattern1 {
    public static void main(String[] args) {
        int num = 5;
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
