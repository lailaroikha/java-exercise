package com.adepuu.exercises.session5;

import java.util.Scanner;

public class Exercise3 {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     * <p>
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     * <p>
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     * <p>
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
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

        if (checkDuplicate(dataNumber)) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
        scanner.close();
    }
        public static boolean checkDuplicate(int[] dataNumber) {
            for (int i = 0; i < dataNumber.length - 1; i++) {
                for (int j = i +1; j < dataNumber.length; j++) {
                    if (dataNumber[i]==dataNumber[j]){
                        return true;
                    }
                }
            }
        return false;
    }

}