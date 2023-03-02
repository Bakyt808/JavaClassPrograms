package com.java.class10;

import java.util.Scanner;

public class IfStatementRecapByMyself {
    public static void main(String[] args) {
        //1. Determining the minimum of three numbers:
        //ask the user to input 3 integer numbers
        //write a logic that will print out the largest number

        Scanner sc = new Scanner(System.in);
        System.out.println("Hey! Enter 3 integer and I'll find you the greatest one. Let's go!");
        System.out.println("Enter your first number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter your second number: ");
        int n2 = sc.nextInt();

        System.out.println("Enter your third number: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is the greatest number");
        } else {
            if (n2 >= n1 && n2 > n3) {
                System.out.println(n2 + " is the greatest number");
            } else if (n1 == n2 && n1 == n3) {
                System.out.println("All numbers are equal");
            } else {
                System.out.println(n3 + " is the greatest number");
            }
        }
    }
}
