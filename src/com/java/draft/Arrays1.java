package com.java.draft;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int[] numbers = {100, 10, 28, 3};
        int largest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        System.out.println(largest);


        // it is the shortest way

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[numbers.length - 1]);

    }
}
