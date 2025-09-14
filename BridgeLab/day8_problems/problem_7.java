package day8_problems;

/*
Problem Statement:
7. GCD and LCM Calculator:
   - Create a program that calculates the Greatest Common Divisor (GCD)
     and Least Common Multiple (LCM) of two numbers using functions.
   - Use separate functions for GCD and LCM calculations.
*/

import java.util.Scanner;

public class problem_7 {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
        sc.close();
    }
}

