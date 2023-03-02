package com.java.class11;

public class Switch1 {

    public static void main(String[] args) {

        int rate = 2;

//        if (rate == 1)  {
//            System.out.println("Awful service");
//        } else if (rate == 2) {
//            System.out.println("Extremely poor service");
//        }
        //just for example they are doing same thing but switch do it cleaner

        // Once java finds the first matching case it will enter the body that case execute it,
        // and it will enter bodies of all of the following cases until the first break or end of the switch
        switch (rate) {
            case 1: //2==1?
                System.out.println("Awful service");
                // Break statement is an optional statement.
                // You end the case with break statement when you want
                // to end the switch statement with the logic of case.
            case 2:
                System.out.println("Extremely poor service");
                break;
            case 3:
                System.out.println("Bad service");
                break;
            case 4:
                System.out.println("Okay service");
                break;
            case 5:
                System.out.println("Good service");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Great service");
            default: // it's same as else statement
                System.out.println("Invalid input");
        }

//        String shipmentState = "Hawaii";
//        String alaska = "Alaska";
//
//        if (shipmentState.equals("Alaska")) {
//
//        } else if (shipmentState.equals("NY")) {
//
//        } else if (shipmentState.equals("Florida")) {
//
//        } else if (shipmentState.equals("California")) {
//
//        }


        // String values in double are literals
        // Values like 5, 10, 143.44

        String shipmentState = "Hawaii";
        String alaska = "Alaska";
        final String il = "Illinois";

        // Add Hawaii -> 10$
        switch (shipmentState)  {
            //if case is Alaska || Hawaii
            case "Alaska":
//            case alaska: // Variables are not allowed in cases
            case "Hawaii":
//            case "Hawaii":// Duplicate cases are not allowed
                System.out.println("Shipment cost is $10");
                break;
            case "NY":
                System.out.println("Shipment cost is $5");
                break;
            case il:
                System.out.println("IL");
                break;
            case "Florida":
                System.out.println("Shipment cost is $7");
                break;
            case "California":
                System.out.println("Shipment cost is $12");
                break;
//            case 10: // Expression data type and case data type must be same
            default:
                System.out.println("The name is incorrect");
        }
        // If you same exact body for 2 or more cases it means they need to be merged


        // Final is a java keyword that ensures the value of a variable can only be initialized once
        // and can not be changed afterwords.

        // This is a constant value - this can not change.
        final int num = 23;
        //num = 10;

        // ex:
        // area code for chicago
        final int areCodeForChicago = 312;
    }
}
