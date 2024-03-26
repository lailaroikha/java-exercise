package com.adepuu.exercises.session6;

import java.util.Scanner;

public class Exercise1 {
//    /**
//     * Write a Java Program to Enter numbers to calculate average and enter 'q' to finish.
//     *
//     * Input: 1, 2, 3, 4, 5, q
//     * Output: 3
//     *
//     * Input: 1, 2, 3, a, b, 4, 5, q
//     * Output: 3
//     *
//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter your number on array : ");
            try {
            String inputNumber = scanner.nextLine();
            if (inputNumber.equalsIgnoreCase("q")) {
                break;
            }
                int number = Integer.parseInt(inputNumber);
                sum += number;
                count++;
            }    catch (NumberFormatException e) {
                System.out.println(" Invalid input, Please enter valid number or 'q' to finish :) .");
                break;
            }
        }

        if ( count > 0 ) {
            double average = (double) sum / count;
            System.out.println();
            System.out.println(" the avarege is " +  average);

            }
        }
    }
