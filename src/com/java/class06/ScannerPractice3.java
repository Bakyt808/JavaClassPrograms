package com.java.class06;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please type your username:");
        String username = input.next();

        System.out.println("And password please:");
        String password = input.next();

        boolean isLoggedIn = username == "best@devx.com" && password == "Fall2022";
        


    }
}
