package com.java.class10;

import java.util.Scanner;

// coding interview process:
// 1. clarify gaps in the requirement by asking
// 2. write pseudocode
// 3. write the code
// 4. debug your code -> checking your code for mistakes
// 5. test your code -> by running

public class IfStatementRecap {
    public static void main(String[] args) {

        //1. Determining the minimum of three numbers:
        //ask the user to input 3 integer numbers
        //write a logic that will print out the largest number

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int num1 = input.nextInt();
        System.out.println("Please enter number 2");
        int num2 = input.nextInt();
        System.out.println("Please enter number 3");
        int num3 = input.nextInt();



        // first step: before we jump to pseudocode - we need to clarify any missing requirements:
        // can all numbers be equal? If yes what should be the output? -> yes, print out all numbers
        // what if 2 numbers are largest and equal? -> print out that number
        // is there a limit for numbers? -> no
        // are these only whole numbers? or decimal pointed number -> whole numbers
        // can we compare negative numbers? -> yes






        // pseudocode -> is the logic of a program written in plain english.
        // I need 3 integer numbers
        // My logic would like this:
        // I need to tackle the numbers 1 by 1.

        // first let's write a logic where my num1 is the largest
        // my num1 would the largest if it's bigger than num2 AND bigger than num3
        // so this is true than print out num1 is the largest number

        // if num1 is equal to num 2 and greater than num 3 then print out n1 and n2 are the greatest number
        if (num1>=num2 && num1>num3) {
            System.out.println(num1 + " is the greatest number");
        }

        // now I need check if the num2 is the largest
        // num2 is the largest if it's larger than num1 and larger than num3
        else if (num2>num1 && num2>=num3) {
            System.out.println(num2 + " is the greatest number");
        }

        // lastly I need check if num3 is the largest
        // num3 is the largest if num3 is larger than num2 and num1.
        else if (num3>=num1 && num3>num2) {
            System.out.println(num3 + " is the greatest number");
        }

        // if all numbers are equal printOut equal
        else if (num1==num2 && num1==num3) {
            System.out.println("All numbers are equal");
        }


    }

    // general rules for debugging:
    // if you have the same exact body for multiple if statements it's bad
    // you can optimize  your code by combining the logics into one if statement
}
