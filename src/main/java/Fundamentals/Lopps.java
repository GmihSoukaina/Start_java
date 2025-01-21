package Fundamentals;

public class Lopps {
    public static void main(String[] args) {
        // Using a FOR loop
        System.out.println("Using FOR loop:");
        for (int i = 1; i <= 5; i++) {  // Start from 1, run till 5, increment by 1
            System.out.println(i);
        }

        // Using a WHILE loop
        System.out.println("\nUsing WHILE loop:");
        int j = 1;  // Initialize counter
        while (j <= 5) {  // Condition to check
            System.out.println(j);
            j++;  // Increment counter
        }

        // Using a DO...WHILE loop
        System.out.println("\nUsing DO...WHILE loop:");
        int k = 1;  // Initialize counter
        do {
            System.out.println(k);
            k++;  // Increment counter
        } while (k <= 5);  // Condition to check AFTER executing at least once


        System.out.println("Using break statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Breaking at " + i);
                break;  // Exits the loop when i == 3
            }
            System.out.println(i);
        }

        System.out.println("Using continue statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping " + i);
                continue;  // Skips only this iteration when i == 3
            }
            System.out.println(i);
        }

        System.out.println("Using both break and continue:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping " + i);
                continue;  // Skips iteration when i == 3
            }
            if (i == 5) {
                System.out.println("Breaking at " + i);
                break;  // Exits loop when i == 5
            }
            System.out.println(i);
        }


        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Using for-each loop:");
        for (int num : numbers) {  // Iterates over the array
            System.out.println(num);
        }
    }
}
