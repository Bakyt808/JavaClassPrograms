package com.java.class07;

import java.util.Scanner;

public class IfStatement2 {

    public static void main(String[] args) {

        //take age from user
        Scanner input = new Scanner(System.in);

        //write a program that tells me if I am eligible to drive
        System.out.println("Please type your age here: ");
        int age = input.nextInt();
        //print out you are eligible to drive for people older than 16

        if (age > 16)  {
            System.out.println("You are Eligible to Drive");
        }

        if (age<= 16)  {
            System.out.println("You are NOT Eligible to Drive");
        }




        //Write a program that asks the user for weather in fahrenheit
        //If the weather is less than 32 than print out it's Freezing. Stay Home
        //if weather is more or equal to 32 and less than 41 than print out -> it's little chilly outside
        //if weather is more or equal to 68 -> print -> it's a good weather outside. Go get some Fresh air
        //if weather is more than or equal to 68 -> it's amazing outside. let's go to pool


        System.out.println("What is the weather like?");
        int weather = input.nextInt();

        if (weather < 32)  {

            System.out.println("It's freezing outside! Stay Home");
        }
        System.out.println("An hour's passed. Please update about the weather?");
        int weather2 = input.nextInt();

        if (weather2 >= 32 || weather2 > 41)  {

            System.out.println("it's little chilly outside");
        }

    }
}
