package com.ontariotechu.sofe3980U;

import java.time.LocalTime;
import java.util.Scanner;

public class App {
    /**
     * Main program: The entry point of the program. It allows users to input two binary numbers,
     * choose an operation (ADD, OR, AND, MULTIPLY), and displays the results.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        // Print current local time
        LocalTime currentTime = LocalTime.now();
        System.out.println("The current local time is: " + currentTime);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the first binary number
        System.out.print("Enter the first binary number: ");
        String input1 = scanner.nextLine();
        Binary binary1 = new Binary(input1);
        System.out.println("First binary number (processed): " + binary1.getValue());

        // Input the second binary number
        System.out.print("Enter the second binary number: ");
        String input2 = scanner.nextLine();
        Binary binary2 = new Binary(input2);
        System.out.println("Second binary number (processed): " + binary2.getValue());

        // Display the menu of operations
        System.out.println("\nChoose an operation:");
        System.out.println("1. ADD");
        System.out.println("2. OR");
        System.out.println("3. AND");
        System.out.println("4. MULTIPLY");
        System.out.print("Enter the number of your choice: ");
        int choice = scanner.nextInt();

        // Perform the selected operation and display the result
        Binary result = null;
        switch (choice) {
            case 1:
                result = Binary.add(binary1, binary2);
                System.out.println("Result of ADD: " + result.getValue());
                break;
            case 2:
                result = Binary.or(binary1, binary2);
                System.out.println("Result of OR: " + result.getValue());
                break;
            case 3:
                result = Binary.and(binary1, binary2);
                System.out.println("Result of AND: " + result.getValue());
                break;
            case 4:
                result = Binary.multiply(binary1, binary2);
                System.out.println("Result of MULTIPLY: " + result.getValue());
                break;
            default:
                System.out.println("Invalid choice! Please restart and select a valid option.");
        }

        // Close the scanner
        scanner.close();
    }
}
