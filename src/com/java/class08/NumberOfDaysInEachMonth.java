package com.java.class08;

import java.util.Scanner;

public class NumberOfDaysInEachMonth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the month in number:");

        int numOfTheMonth = input.nextInt();

        if (numOfTheMonth ==1) {
            System.out.println("It's January");
        } else if (numOfTheMonth ==2) {
            System.out.println("It's February");
        } else if (numOfTheMonth ==3) {
            System.out.println("It's March");
        } else if (numOfTheMonth ==4) {
            System.out.println("It's April");
        } else if (numOfTheMonth ==5) {
            System.out.println("It's May");
        } else if (numOfTheMonth ==6) {
            System.out.println("It's June");
        } else if (numOfTheMonth ==7) {
            System.out.println("It's July");
        } else if (numOfTheMonth ==8) {
            System.out.println("It's August");
        } else if (numOfTheMonth ==9) {
            System.out.println("It's September");
        } else if (numOfTheMonth ==10) {
            System.out.println("It's October");
        } else if (numOfTheMonth ==11) {
            System.out.println("It's November");
        } else if (numOfTheMonth ==12) {
            System.out.println("It's December");
        }
        else {
            System.out.println("Wrong Entry only number 1-12 are allowed, please try again.");
        }
    }
}
