package day8_problems;
/*
Problem Statement:
3. Prime Number Checker:
   - Create a program that checks whether a given number is a prime number.
   - Use a separate function to perform the prime check and return the result.
*/

import java.util.Scanner;

public class problem_3 {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n))
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is NOT a Prime Number");
        sc.close();
    }
}

