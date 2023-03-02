package com.java.class11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        Homework is to fix the business requirement gap
//        If the weight of the order is 2 lbs or more and the shipping destination is within the United States,
//        the shipping cost is calculated based on the weight of the order. users pay 50 cents per lbs.
//                Fix your code based on the requirement change

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight of your package: ");
        double weight = input.nextInt();

        System.out.println("Enter your shipping destination: ");
        String destination = input.next();

        switch ((int) weight) {
            case 1:
            case 2:
        }
    }
}
