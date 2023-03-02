package com.java.class12;

public class Methods2 {
    public static void main(String[] args) {
        /**
         * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
         */
        //int result = sumUp(4, 4);
        System.out.println(sumUp(3, 4));

        Methods2 someVarName = new Methods2();
        System.out.println(someVarName.inTheRange(5, 10));
        // You can use methods with return type(not void) directly inside sout to print the result of the method
    }

    public static int sumUp(int a, int b) {
//      return a + b; // return statement is like a finish line.
        // When your code runs return statement   it means  you want break out of this method.
        if (a == b) {
            return (a + b) * 2;
        }
        return a + b;

    }
    /**
     * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
     */
    // If at least one of two numbers more or equal to 10 and less or equal to 20 return true.
    // Otherwise, return false.
    public boolean inTheRange (int a, int b)   {
        // Local variables are variables that are defined without a certain scope, so you can use same variable names
        // as long as they are defined in completely different scopes.
            return a>=10 && a<=20 || b>=10 && b<=20;
            // 2. If you have a method that returns boolean.
            // 1. If you have just a simple if and else logic you can put the condition expression with return
    }
}
