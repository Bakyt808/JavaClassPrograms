package com.java.MyPracticesLooping;

// Write a program to check given number is prime or not

// Prime number - a number that is divisible only by 1 itself
// Example - 2, 3, 5, 7, 11, 13

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 8;
        int count = 0;
        for (int i = 1; i<=num; i++)    {
            if (num % i ==0)    {
                count++;
            }
        }
        //System.out.println(count);
        // 12345678 == 1234
        if (count==2)  {
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }
}