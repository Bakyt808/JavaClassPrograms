package com.java.draft;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {

            System.out.println("Enter the number : " +1);

            int num = input.nextInt();

            if (num / 2 == 0) {
                System.out.println("The " + num + " is even");
            } else {
                System.out.println("The " + num + " is odd");
            }
        }
    }
}
