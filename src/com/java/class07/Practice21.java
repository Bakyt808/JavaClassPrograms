package com.java.class07;

import java.util.Scanner;

public class Practice21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("It's : ");
        int hourOfDay = input.nextInt();

        if(hourOfDay < 11 ) {
            System.out.println("Good Morning");
        }
        if(hourOfDay >= 11 && hourOfDay < 17) {
            System.out.println("Good Afternoon");
        }
        if (hourOfDay >= 17 && hourOfDay <= 24)    {
            System.out.println("Good evening");
        }
        if (hourOfDay > 24) {
            System.out.println("We have only 24 hours");
        }


    }
}
