import java.util.Scanner;

public class Question2 {
    // Problem: Calculate sum of n natural numbers using recursion and formula
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sumRecursive = sumRecursive(n);
        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);
    }

    public static int sumRecursive(int n) {
        // Implementation to sum using recursion
    }
}
