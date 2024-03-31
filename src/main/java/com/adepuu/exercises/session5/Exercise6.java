package com.adepuu.exercises.session5;

import java.lang.annotation.ElementType;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     *
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     *
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5};
        int[] result = removeDuplicateNumber(arr);
        System.out.println("Original number: " + java.util.Arrays.toString(arr));
        System.out.println("Without duplicates: " + java.util.Arrays.toString(result));
    }

    public static int[] removeDuplicateNumber(int[] arr) {
        ArrayList<Integer> uniqueElements = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueElements.add(arr[i]);
            }
        }

        int[] result = new int[uniqueElements.size()];
        for (int i = 0; i < uniqueElements.size(); i++) {
            result[i] = uniqueElements.get(i);
        }

        return result;
    }
}