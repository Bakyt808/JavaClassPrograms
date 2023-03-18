package com.java.MyPracticesLooping;

// Write a program to check given number is Armstrong number or not

// Armstrong number is a number that is equal to the sum of cubes of its digits

// Example
// Input1 - 153 , 1^3 + 5^3 + 3^3 = 152   Output1 - Armstrong
// Input2 - 123 , 1^3 + 2^3 + 3^3 = 36    Output2 - Not Armstrong

public class CheckArmstrongNumber {
    public static void main(String[] args) {

        int num = 371;
        int backup = num;
        int sum = 0;

        while (num > 0) {
            sum = sum + (num % 10) * (num % 10) * (num % 10);
            num = num / 10;
        }
        if (sum == backup) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
