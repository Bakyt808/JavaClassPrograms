package com.java.class28;

class Calculator11 {

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("Sum = " + (a - b));
    }
}

class AdvancedCalculator11 extends Calculator11{

    void mul(int a, int b) {
        System.out.println("Sum =" + (a * b));
    }

    void div(int a, int b) {
        System.out.println("Sum =" + (a / b));
    }
}

public class InheritancePractice {
    public static void main(String[] args) {

        Calculator11 c = new Calculator11();

        c.add(10, 20);
        c.sub(50, 50);

        AdvancedCalculator11 ac = new AdvancedCalculator11();

        ac.add(10, 50);
        ac.div(50, 30);
        ac.sub(60, 50);
        ac.mul(80,8);

    }
}
