package day8_problems;

/*
Problem Statement:
9. Basic Calculator:
   - Write a program that performs basic mathematical operations
     (addition, subtraction, multiplication, division) based on user input.
   - Each operation should be in its own function.
*/

import java.util.Scanner;

public class problem_9 {

    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.print("Choose operation: ");
        int choice = sc.nextInt();

        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double result = 0;
        switch (choice) {
            case 1: result = add(a, b); break;
            case 2: result = subtract(a, b); break;
            case 3: result = multiply(a, b); break;
            case 4: result = divide(a, b); break;
            default: System.out.println("Invalid Choice");
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}

