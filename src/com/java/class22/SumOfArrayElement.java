package com.java.class22;

// Write a program to print sum of data stored in the array

public class SumOfArrayElement {
    public static void main(String[] args) {
        int listOfData[] = {10, 30, 50, 30, 70, 40, 45, 32};

        int s = 0;

        for (int i = 0; i < listOfData.length; i++)     {
            s = s +listOfData[i];
        }

        System.out.println(s);

    }
}
