package com.java.class20;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = input.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if(num % i ==0 ){
                count++;
            }
        }
        System.out.println(count);

        if (count==2)   {
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }
}
