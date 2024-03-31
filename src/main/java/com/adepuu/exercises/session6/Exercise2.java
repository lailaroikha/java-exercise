package com.adepuu.exercises.session6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exercise2 {
    /**
     * Complete the file reader program below
     * and handle all edge cases using try-catch-finally based on the logic given
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        readFileContents(fileName);
        scanner.close();
    }
    static void readFileContents(String fileName){
        BufferedReader reader = null;
        try
        {
         reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line= reader.readLine())!=null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found, Check the file name and try again.");
        } catch (IOException e) {
            System.out.println(" An error occurred while reading the file");
        }
    finally {
            try {
                reader = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (FileNotFoundException e) {
                System.out.println(" File not found. Check the file name and try again.");
            } catch (IOException e) {
                System.out.println("An error occured while closing the file");
            } finally {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        System.out.println(" Sorry.. An error occured while closing the file. ");
                    }
                }
            }
        }
    }
}