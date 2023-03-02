package com.java.class06;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //nextInt(), nextLine(), nextBoolean() -> they are all methods returns a result.
        System.out.println("Please Enter your age:");
        int age = input.nextInt();
        System.out.println(age);
    }
}
