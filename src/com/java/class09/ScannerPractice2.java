package com.java.class09;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        //ask user for their gender in char
        //and if the user gender is M then print out -> go work hard
        //and if the user gender is F then print out -> enjoy your life
        //if the user gender input is not M or F then print out -> wrong input

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your gender:");
        char gender = sc.next().charAt(0);

        if (gender == 'M' && gender == 'm') {
            System.out.println("Go work hard");
        } else if (gender == 'F' && gender == 'f') {
            System.out.println("Enjoy your life");
        }
        else {
            System.out.println("Wrong input");
        }

    }
}
