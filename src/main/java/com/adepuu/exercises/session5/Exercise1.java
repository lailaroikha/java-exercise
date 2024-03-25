package com.adepuu.exercises.session5;

public class Exercise1 {
    public static void main(String[] args) {
        int[] numbers = {7 , 2 , 5 , 1 , 4};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
            {
                max = numbers[i];
            }
        }
        System.out.print("The large number : " + max);

    }

}