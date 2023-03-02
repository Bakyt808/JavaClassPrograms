package com.java.class17;

public class WhileLoopPractice {

    public static void main(String[] args) {
        /*
          write a program to Print
          1 10 2 9 3 8 4 7 5 6
         */

        int num1 = 1;//starting point

        //() -> how many times it should run?
        //if your problems is asking to run specific
        //number of times.
        //there should at least one var
        while (num1 < 10) {
            //in the body of the while I must have a
            //boolean expression updater
            System.out.println("Hello");
            num1++;//updater
        }


        //1. define the right starting point
        //2. define a boolean expression where you are using the variable of starting point
        //3. write body of the while loop.
        //4. make sure you have an updater of a variable in the boolean expression
    }
}
