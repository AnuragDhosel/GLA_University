package java_methods.level1;
/*
Problem: Write a program to take 2 numbers and print their quotient and remainder
*/
import java.util.Scanner;

public class Question8 {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor; // quotient
        result[1] = number % divisor; // remainder
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        int[] res = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + res[0] + ", Remainder: " + res[1]);
    }
}
