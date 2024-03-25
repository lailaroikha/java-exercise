package com.adepuu.exercises.session5;

import java.util.Scanner;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int number = scanner.nextInt();
        System.out.println("Enter the number of the array: ");
        int[] dataNumber = new int[number];
        for (int i = 0; i < number; i++) {
            dataNumber[i] = scanner.nextInt();
        }
        int length = dataNumber.length;

        for (int i = 0; i < length; i++) {
            boolean sameNumber = false;
            for (int j = i + 1; j < length; j++) {
                if (dataNumber[i] == dataNumber[j]) {
                    sameNumber = true;
                    break;
                }
            }
            if (!sameNumber) {
                System.out.print( dataNumber[i] + " ");
            }
        }
    }
}