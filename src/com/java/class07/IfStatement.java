package com.java.class07;

public class IfStatement {

    //if statement is a logical flow control you can write a program that executes certain portion of the code only in certain conditions.

    public static void main(String[] args) {

        if (false)  {
            System.out.println("Hello World");
            System.out.println("Hello Mars");
        }

        //proceed with a normal execution
        System.out.println("I'm outside of If Statement");


        //when you have only one statement inside if statement you can skip {}
        if (true)  {
            System.out.println("Hello Jupiter");
            System.out.println("Hello Saturn"); //this line is in fact outside the if statement scope it will print in any condition

        //I want to print out hello Venus only if my ga
        int gallonOfOil = 400;

        if (gallonOfOil>1000)  {
            System.out.println("Hello Venus");
        }
        }
    }
}
