
package com.adepuu.exercises.session5;

import java.util.Scanner;

public class Exercise2 {

    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
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

        System.out.println("Enter the number of rotations: ");
        int rotations = scanner.nextInt();

        for (int i = 0; i < rotations; i++) {
            int temp = dataNumber[0];

            for (int j = 1; j < dataNumber.length; j++) {

                dataNumber[j - 1] = dataNumber[j];
            }
            dataNumber[dataNumber.length - 1] = temp;
        }
        System.out.println("Rotated array: ");
        for (int i = 0 ; i < dataNumber.length; i++){
            System.out.print(dataNumber[i] + " ");
        }

        System.out.println();
        scanner.close();
    }
}




