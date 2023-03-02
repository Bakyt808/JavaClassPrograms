package com.java.class12;

public class MethodsPractice2 {

    // Create a function that return true or false and will let us know if we can sleepIn.
    // It should take 2 params - one to know if's a weekday another param to know if it's a vacation.
    // We sleep in if it is not a weekday, or we're on vacation. Return true if we sleep in.

    public static void main(String[] args) {
        boolean result = sleepIn(7, false);
        System.out.println(result);
    }
    public static boolean sleepIn (int dayOfWeek, boolean isVacation) {
        if (isVacation) {
            return true;
        } else {
            if (dayOfWeek <=5)  {
            return false;
        } else if (dayOfWeek == 5 || dayOfWeek == 7) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}
