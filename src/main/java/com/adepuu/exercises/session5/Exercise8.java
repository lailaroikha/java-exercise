package com.adepuu.exercises.session5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Exercise8 {
    /**
     * Java String Program to Find all Duplicates on Array
     *
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     *
     * Example 2:
     * Input: nums = [1,1,2]
     * Output: [1]
     *
     * Example 3:
     * Input: nums = [1]
     * Output: []
     */
     public static void main(String[] args) {
            int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

            List<Integer> duplicates = findDuplicates(nums);

            System.out.println("Input: nums = " + Arrays.toString(nums));
            System.out.println("Output: " + duplicates);
        }

        public static List<Integer> findDuplicates(int[] nums) {
            List<Integer> duplicates = new ArrayList<>();

            // Array untuk melacak jumlah kemunculan setiap angka
            int[] count = new int[nums.length + 1];

            // Mencatat jumlah kemunculan setiap angka
            for (int num : nums) {
                count[num]++;
            }

            // Menambahkan angka ke dalam list jika jumlah kemunculannya lebih dari 1
            for (int i = 1; i < count.length; i++) {
                if (count[i] > 1) {
                    duplicates.add(i);
                }
            }

            return duplicates;
        }
    }
