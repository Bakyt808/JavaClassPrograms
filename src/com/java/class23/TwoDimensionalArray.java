package com.java.class23;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        // Declaration of Two Dimensional Array
        int[][] data = {
                {34, 54, 23, 43},
                {34, 45, 23, 67},
                {54, 56, 34, 87}
        };

        // Access one of the element from 2D array
        System.out.println(data[0][0]);

        // Print all data
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

        // Find Number of Rows in 2D Array
        System.out.println(data.length);

        // Find Number of Column in 2D Array
        System.out.println(data[0].length);

    }
}
