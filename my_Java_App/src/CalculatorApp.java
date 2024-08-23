package my_Java_App.src;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Step 1: Create a Scanner object

        System.out.println("Enter the first number: "); // Step 2: Prompt for the first number5
        int num1 = scanner.nextInt(); // Step 3: Read the first number

        System.out.println("Enter the second number: "); // Step 4: Prompt for the second number
        int num2 = scanner.nextInt(); // Step 5: Read the second number

        CalculatorApp calculator = new CalculatorApp();
        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));

        scanner.close(); // Close the scanner object to prevent resource leak
    }

    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int divide(int a, int b) {
        return a / b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }

    // Assume the rest of your CalculatorApp class is below...
}