package com.java.class12;

public class MethodsPractice1 {
    // Create a function that prints "I want to travel to ______"
    // ____ -> should be a variable
    // I used be able to use multiple times and just provide different values.

    public static void main(String[] args) {
        goTo("Amsterdam");
    }

    public static void goTo (String destination) {

        // The biggest difference between a parameters and variables is that variables need to be initialized right away
        System.out.println("I want to travel to " + destination);
    }
}
