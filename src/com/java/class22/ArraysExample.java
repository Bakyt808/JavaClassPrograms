package com.java.class22;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // Create and initialize an array
        int listOfData[] = {10, 30, 50, 30, 70, 40, 45, 32};

        // Access element from the array
        System.out.println(listOfData[2]);

        System.out.println(listOfData.length);

        for (int i = 0; i < listOfData.length; i++) {
            System.out.println(listOfData[i]);
        }

        System.out.println(listOfData); // Memory Address

        System.out.println(Arrays.toString(listOfData)); // Data

        System.out.println(listOfData[7]);
    }
}
