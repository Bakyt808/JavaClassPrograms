package com.java.class12;

import java.util.Scanner;

public class InstanceMethodsPractice1 {

    public static void main(String[] args) {
        /**
         * Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
         * Note that the % “mod” operator computes remainders, so 17 % 10 is 7.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("First non-negative integer");
        int a = input.nextInt();
        System.out.println("Second non-negative integer");
        int b = input.nextInt();

        InstanceMethodsPractice1 fifthHarmony = new InstanceMethodsPractice1();

        System.out.println(fifthHarmony.lastDigit(a, b));

        System.out.println(fifthHarmony.giveBool(4));

        System.out.println(fifthHarmony.isTen(3, 3));
    }
    public boolean lastDigit (int a, int b)  {
        if (a>0 && b>0) {
            return a % 10 == b % 10;
        } else {
            return false;
        }
    }
    /**
     * create a method that takes a non-negative int.
     * Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % “mod” operator
     */
    public boolean giveBool (int num)   {
        if (num > 0)    {
            return num % 3 == 0 || num % 5 == 0;
        } else {
            return false;
        }
    }
    /**
     * Create a method that takes 2 integers,
     * Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
     */
    public boolean isTen (int a, int b)   {
        return a == 10 || b == 10 || a + b == 10;
    }
}
