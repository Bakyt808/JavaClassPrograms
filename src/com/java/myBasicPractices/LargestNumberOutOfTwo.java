package com.java.myBasicPractices;

// Program to find the largest number out of two numbers.

import java.util.Scanner;

public class LargestNumberOutOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt(), num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println("The largest number is: " + num1);
        } else {
            System.out.println("The largest number is: " + num2);
        }
    }
}