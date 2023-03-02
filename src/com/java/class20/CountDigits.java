package com.java.class20;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");

        long num = input.nextLong();
        int count = 0;

        while (num > 0) {
            num = num / 10; // remove one digit from number
            count++;
        }
        System.out.println(count);
    }
}
