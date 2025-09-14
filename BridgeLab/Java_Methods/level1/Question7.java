package java_methods.level1;
/*
Problem: Write a program to find the smallest and the largest of the 3 numbers.
*/
import java.util.Scanner;

public class Question7 {

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int findMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Maximum number: " + findMax(a,b,c));
        System.out.println("Minimum number: " + findMin(a,b,c));
    }
}
