package com.java.myBooleanPractices;

// Write a program to check if given char is vowel or not
// Valid vowel char - a, e, i, o, u

public class Vowels {
    public static void main(String[] args) {
        char c = 'A';

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Not Vowel");
        }
    }
}