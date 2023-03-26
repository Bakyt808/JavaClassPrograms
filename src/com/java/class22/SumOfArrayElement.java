package com.java.class22;

// Write a program to print sum of data stored in the array

import java.util.Scanner;

public class SumOfArrayElement {
    public static void main(String[] args) {
        int[] listOfData = new int[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 numbers to find summation: ");

        for (int m = 0; m < listOfData.length; m++) {
            listOfData[m] = input.nextInt();
        }

        int s = 0;

        for (int i = 0; i < listOfData.length; i++) {
            s = s + listOfData[i];
        }

        System.out.println(s);

    }
}
