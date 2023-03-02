package com.java.class16;

public class WhileLoopPractice {
    /*
      Write a program that will count number of vowel characters and consonant characters in a String

      String str = "Hello DevXer";
      4 - vowels
      8 - consonants including the space
     */
    public static void main(String[] args) {
        String str = "Hello DevXer";
        // Iterate through all characters
        // If character is equal to vowel return is vowel, otherwise is consonant.
        int start = 0;
        int counterv = 0;
        int counterc = 0;
        while (start < str.length()) {
            if (str.charAt(start) == 'e' || str.charAt(start) == 'o') {
                System.out.println("It's vowel "+ ++counterv);
            } else {
                System.out.println("It's consonant"+ ++counterc);
            }
            start++;
        }
    }
}
