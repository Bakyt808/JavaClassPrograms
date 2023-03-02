package com.java.class12;

public class MethodsIntro {
    public static void main(String[] args) {
        // When your method has a return type you should use the result & save the result in a variable.
        double num = calculateTax();
        System.out.println(num);

        double taxAmount = calculateTax2(100000);
        System.out.println(taxAmount);
    }
    // Methods are predefined logic that can be used to execute throughout the whole project.

    // First, put an access modifier -> public, protected, default, private
    // Second, put static
    // return data type -> any data type -> int, double, float, boolean, byte, char, short, String
    // return data type can also be void -> use void when you want to create a method that doesn't return any result
    // ex: just print some info.
    // When you have a return type that is not void -> you must have a return statement.
    // return statement must be followed by a value that has same data type as your return data type.
    // you can get that value from calculations as well.

    // What is return data type? => it's the data type of the result info of the function(Method)
    // Next, we have the name of the method -> name of the method should be meaningful and follow camelCase. verbs
    // Ex: sendEmail(), sendReceipt(), printTop10Customers()
    // The name of the method always finishes with parentheses.

    // The body of any method can be as large as you needed to be
    // You can have calculations
    // print out statements,
    // if, switch, for, while = all statements.
    public static double calculateTax   ()  {
        return 10*2;
    }

    // void methods doesn't require a return statement.
    public static void sayHello () {
        int year = 2023;
        double targetSalary = 130000;
        System.out.println("Hello " + year);
        System.out.println("My target salary is: " + targetSalary);
    }

    // Write a function that calculates employees tax amount.
    // if the annual salary is less than $100000 then tax percent is 10%
    // if more than $100000 then 15%
    public static double calculateTax2 (double annualSalary) {

        if (annualSalary >= 100000) {
            return annualSalary * 0.10;
        } else {
            return annualSalary * 0.15;
        }
    }
}
