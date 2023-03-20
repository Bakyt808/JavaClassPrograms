package com.java.class22;

// Write a program to print sum of data stored in the array

import java.util.Scanner;

public class FindIndexOfNumber {
    public static void main(String[] args) {

        // Declaration of array
        int listOfData[] = new int[8];

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 8 numbers: ");

        // Getting the numbers from the user
        for (int i = 0; i < listOfData.length; i++) {
            listOfData[i] = input.nextInt();
        }

        System.out.println("Please enter target number we need to find index");

        int targetNumber = input.nextInt();

        for (int i = 0; i < listOfData.length; i++) {
            if (targetNumber == listOfData[i]) {
                System.out.println(i);
            }
        }
    }
}
