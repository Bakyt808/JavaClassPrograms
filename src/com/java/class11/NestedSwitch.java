package com.java.class11;

public class NestedSwitch {
    public static void main(String[] args) {

        // case or default statements can have entire switch statement inside

        // Online Store
        // We want to write a program which calculates shipping cost based on total spending
        // If  the customer is spending  less than $5 than charge $5 for shipping
        // If spending more than $5 and less or equal to $10 then charge $10

        // If spending more than $10 then we also look at the shipping destination.
        // if it's USA -> we should charge 10% of the total spending for shipping
        // if it's Canada -> charge 15% of total spending
        // if it's Europe -> charge 20% of total spending
        // if it's any other place -> charge 25% of total spending


        String destination = "USA";
        double totalSpending = -720.45;

        if (totalSpending>0) {
            switch ((int) totalSpending) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Shipping cost will be $5");
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("Shipping cost will be $10");
                    break;
                default:
                    switch (destination) {
                        case "USA"://10%
                            System.out.println("Shipping cost will be: $" + totalSpending * 0.1);
                            break;
                        case "Canada"://15%
                            System.out.println("Shipping cost will be: $" + totalSpending * 0.15);
                            break;
                        case "Europe"://20%
                            System.out.println("Shipping cost will be: $" + totalSpending * 0.2); //totalSpending/100*20) //totalSpending*20/100
                            break;
                        default://25%
                            System.out.println("Shipping cost will be: $" + totalSpending * 0.25);
                            break;
                    }
            }
        }
        else {
            System.out.println("Invalid input");
        }
    }
}