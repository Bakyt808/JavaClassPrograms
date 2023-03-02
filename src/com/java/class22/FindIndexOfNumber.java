package com.java.class22;

// Write a program to print sum of data stored in the array

import java.util.Scanner;

public class FindIndexOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int listOfData[] = {10, 30, 50, 30, 70, 40, 45, 32};

        int targetNumber = input.nextInt();

        for (int i =3; i< listOfData.length; i++)   {
            if (targetNumber==listOfData[i])    {
                System.out.println(i);
            }
        }




    }
}
