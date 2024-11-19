package com.mycompany.countnumbers;

import java.util.HashMap;
import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> numberCount = new HashMap<>();
        int[] numbers = new int[10];
        int count = 0;

        System.out.println("Enter an integer between 1 and 50 (-1 to end):");

        while (count < 10) {
            int input = scanner.nextInt();

            if (input == -1) {
                break;
            }

            if (input < 1 || input > 50) {
                System.out.println("Please enter a valid integer between 1 and 50.");
                continue;
            }

            numbers[count] = input;
            count++;

            // Update the count for each number
            if (numberCount.containsKey(input)) {
                numberCount.put(input, numberCount.get(input) + 1);
            } else {
                numberCount.put(input, 1);
            }
        }

        System.out.println("\nThe number of integers entered was: " + count);

        // Print occurrences of each integer
        for (Integer key : numberCount.keySet()) {
            System.out.println(key + " occurred " + numberCount.get(key) + " times");
        }

        scanner.close();
    }
}

