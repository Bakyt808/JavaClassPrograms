package com.java.class18;

public class WhileLoopPractice {

    /*
    Write a program to print all numbers from 1-20 that are divisible by 3
     */

    public static void main(String[] args) {

        int a = 2;

        while (a<20)    {
            a++;
            if (a % 3 ==0)  {
                System.out.println(a);
            }
        }

        int b = 1;

        while (b < 50)  {

            if (b % 5 ==0 || b % 3 ==0) {
                System.out.println(b);
            }
            b++;
        }
    }
}
