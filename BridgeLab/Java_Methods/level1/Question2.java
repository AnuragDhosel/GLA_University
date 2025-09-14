package java_methods.level1;
/*
Problem: Create a program to find the maximum number of handshakes among students.
Formula: combination = (n * (n - 1)) / 2
*/
import java.util.Scanner;

public class Question2 {

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        System.out.println("Maximum number of handshakes possible: " + calculateHandshakes(n));
    }
}
