package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise7 {
    /**
     * Java String Program to Check Anagram
     *
     * Example 1:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     *
     * Example 2:
     * Input: s = "rat", t = "car"
     * Output: false
     */

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean result = isAnagram(s, t);

        System.out.println("Input: s = \"" + s + "\", t = \"" + t + "\"");
        System.out.println("Output: " + result);
    }

    public static boolean isAnagram(String s, String t) {
        // Jika panjang kedua string berbeda, mereka tidak bisa menjadi anagram
        if (s.length() != t.length()) {
            return false;
        }

        // Mengonversi kedua string ke array karakter
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        // Mengurutkan karakter-karakter dalam kedua array
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Membandingkan kedua array setelah diurutkan
        return Arrays.equals(sChars, tChars);
    }
}

