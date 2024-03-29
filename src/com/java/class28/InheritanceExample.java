package com.java.class28;

class Calculator { // Parent / Super Class
    void add(int a, int b) {
        System.out.println("Sum= "+(a + b));
    }

    void sub(int a, int b) {
        System.out.println("Sub= "+ (a - b));
    }
}

// Child / Sub Class
class AdvanceCalculator extends Calculator {

    void mul(int a, int b) {
        System.out.println(a * b);
    }

    void div(int a, int b) {
        System.out.println(a / b);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10, 20);
        c.sub(40, 20);

        AdvanceCalculator ac = new AdvanceCalculator();
        ac.sub(10,20);
        ac.mul(10,20);
        ac.div(40,20);
        ac.add(20,50);
    }
}

// extends is a keyword we are using for inherit Properties which means a variable and the methods of this class.
// So Calculator is a parent class and the AdvancedCalculator is a child class now AdvancedCalculator has four methods,
// two which is created by AdvancedCalculator and two is inherited from the Calculator.
