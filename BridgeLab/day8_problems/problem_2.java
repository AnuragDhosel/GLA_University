package day8_problems;
/*
Problem Statement:
2. Maximum of Three Numbers:
   - Write a program that takes three integer inputs from the user
     and finds the maximum of the three numbers.
   - Use separate functions for input and calculating the maximum value.
*/

import java.util.Scanner;

public class problem_2 {

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = findMax(num1, num2, num3);
        System.out.println("Maximum number is: " + max);
        sc.close();
    }
}

