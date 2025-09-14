package day8_problems;

/*
Problem Statement:
6. Factorial Using Recursion:
   - Write a program that calculates the factorial of a number using recursion.
   - Include modular code for input, calculation, and output processes.
*/

import java.util.Scanner;

public class problem_6 {

    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factorial of " + n + " is: " + factorial(n));
        sc.close();
    }
}

