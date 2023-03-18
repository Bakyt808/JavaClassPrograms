package com.java.pattern;

// Write a java program to print below pattern

//  *********
//   *******
//    *****
//     ***
//      *


public class Pattern9 {
    public static void main(String[] args) {
        int num = 5;
        int row = 1;
        for (int i = 5; i >= row; i--) {
            for (int s = 1; s <= 5 - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
