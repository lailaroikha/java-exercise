package com.adepuu.exercises.session5;

public class Exercise5 {
    public static void main(String[] args) {
        int[] numbers = {8, 7, 5, 2};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.print("Increasing : ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();


        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {

                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.print("Decreasing: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
