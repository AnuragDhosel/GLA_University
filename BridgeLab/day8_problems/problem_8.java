package day8_problems;

/*
Problem Statement:
8. Temperature Converter:
   - Write a program that converts temperatures between
     Fahrenheit and Celsius.
   - Create separate functions for each conversion.
*/

import java.util.Scanner;

public class problem_8 {

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        if (choice == 1)
            System.out.println("In Fahrenheit: " + celsiusToFahrenheit(temp));
        else
            System.out.println("In Celsius: " + fahrenheitToCelsius(temp));
        sc.close();
    }
}
