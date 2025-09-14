package day8_problems;

/*
Problem Statement:
4. Fibonacci Sequence Generator:
   - Write a program that generates the Fibonacci sequence
     up to a specified number of terms entered by the user.
   - Organize the code using a function for calculation and printing.
*/

import java.util.Scanner;

public class problem_4 {

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        generateFibonacci(n);
        sc.close();
    }
}

