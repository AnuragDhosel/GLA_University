package day8_problems;

/*
Problem Statement:
5. Palindrome Checker:
   - Write a program that checks if a given string is a palindrome
     (reads the same backward as forward).
   - Break into functions for input, checking, and displaying the result.
*/

import java.util.Scanner;

public class problem_5 {

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isPalindrome(str))
            System.out.println("The string is a Palindrome");
        else
            System.out.println("The string is NOT a Palindrome");
        sc.close();
    }
}

