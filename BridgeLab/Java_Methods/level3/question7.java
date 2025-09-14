package level3;

import java.util.Arrays;

/*
 * Question 7: Factors of a Number
 * Description: This program finds all factors of a number, calculates the greatest factor,
 * sum, product, and product of cubes of the factors.
 */
public class question7 {

    // Find all factors of the number
    public static int[] factors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) count++;
        int[] arr = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) arr[index++] = i;
        return arr;
    }

    // Find greatest factor
    public static int greatestFactor(int[] arr) {
        return arr[arr.length - 1];
    }

    // Sum of factors
    public static int sumFactors(int[] arr) {
        int sum = 0;
        for (int f : arr) sum += f;
        return sum;
    }

    // Product of factors
    public static long productFactors(int[] arr) {
        long prod = 1;
        for (int f : arr) prod *= f;
        return prod;
    }

    // Product of cubes of factors
    public static double productCubeFactors(int[] arr) {
        double prod = 1;
        for (int f : arr) prod *= Math.pow(f, 3);
        return prod;
    }

    public static void main(String[] args) {
        int num = 12;
        int[] arr = factors(num);
        System.out.println("Factors of " + num + ": " + Arrays.toString(arr));
        System.out.println("Greatest factor: " + greatestFactor(arr));
        System.out.println("Sum of factors: " + sumFactors(arr));
        System.out.println("Product of factors: " + productFactors(arr));
        System.out.println("Product of cubes of factors: " + productCubeFactors(arr));
    }
}
