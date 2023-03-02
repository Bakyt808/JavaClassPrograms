package com.java.class11;

import java.util.Scanner;

public class Task2 {
//    Example
//    Input - 1,  Output - 31 days
//    Input - 2,  Output - 28/29 days
//    Input - 3,  Output - 31 days
//    Input - 4,  Output - 30 days
//    Input - 5,  Output - 31 days
//    Input - 6,  Output - 30 days
//    Input - 7,  Output - 31 days
//    Input - 8,  Output - 31 days
//    Input - 9,  Output - 30 days
//    Input - 10,  Output - 31 days
//    Input - 11,  Output - 30 days
//    Input - 12, Output - 31 days
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your month: ");
        int month = input.nextInt();

        switch (month) {
            case 1:
                System.out.println("January has 31 days");
                break;
            case 2:
                System.out.println("February has 28/29 days");
                break;
            case 3:
                System.out.println("March has 31 days");
                break;
            case 4:
                System.out.println("April has 30 days");
                break;
            case 5:
                System.out.println("May has 31 days");
                break;
            case 6:
                System.out.println("June has 30 days");
                break;
            case 7:
                System.out.println("July has 31 days");
                break;
            case 8:
                System.out.println("August has 31 days");
                break;
            case 9:
                System.out.println("September has 30 days");
                break;
            case 10:
                System.out.println("October has 31 days");
                break;
            case 11:
                System.out.println("November has 30 days");
                break;
            case 12:
                System.out.println("December has 31 days");
                break;
            default:
                System.out.println("Sorry, we have only 12 month");
        }
    }
}
