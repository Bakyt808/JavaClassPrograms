package com.java.class09;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        //How to take just one character from a user?
        //ex: What is your gender? M or F

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your gender? M or F");
        //When you hit . and have a name ending with a () it means it's a method(function)
        String gender = sc.next();
        System.out.println(gender);
    }
}
