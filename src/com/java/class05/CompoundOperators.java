package com.java.class05;

/**
 * Compound Operators are easy way to use the current value of a variable and add, substruct
 */

public class CompoundOperators {
    public static void main(String[] args) {

        int num1 = 10;
        num1+=5; // num2 = num2(10) + 5
        System.out.println(num1);

        int num2 = 11;
        num2+=22;
        System.out.println(num2);

        num2+=5;
        System.out.println(num2);

        num2+=11;
        System.out.println(num2);

        num2+=14;
        System.out.println(num2);

        num2-=11;
        System.out.println(num2);

        num2-=5;
        System.out.println(num2);

        System.out.println(num2-5);

        num2-=2;
        System.out.println(num2);//45


        int numberOfChicken  = 100;
        numberOfChicken+=50;

        System.out.println(numberOfChicken);

        numberOfChicken*=2; //numberOfChicken = numberOfChicken*2
        System.out.println(numberOfChicken);

        numberOfChicken/=10; //numberOfChicken = numberOfChicken/10
        System.out.println(numberOfChicken);

        numberOfChicken%=2;
        System.out.println(numberOfChicken);//0


        System.out.println("=====================================");

        int num = 10;
        System.out.println(num+5);
        num*=2;
        num+=5;

        System.out.println(num+1);

        num-=5;

        System.out.println(num);

    }
}
