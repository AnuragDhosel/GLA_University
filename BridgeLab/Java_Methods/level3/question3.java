package level3;

import java.util.Arrays;

/*
 * Question 3: NumberChecker – Digits, Sum, Squares, Harshad, Frequency
 * Description: This program performs digit-based operations including calculating
 * the sum of digits, sum of squares, checking Harshad numbers, and finding frequency of each digit.
 */
public class question3 {

    // Count digits in the number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Store digits in an array
    public static int[] storeDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    // Sum of digits
    public static int sumOfDigits(int num) {
        int[] digits = storeDigits(num);
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // Sum of squares of digits
    public static int sumOfSquares(int num) {
        int[] digits = storeDigits(num);
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    // Check Harshad number
    public static boolean isHarshad(int num) {
        return num % sumOfDigits(num) == 0;
    }

    // Frequency of each digit in the number
    public static int[][] frequency(int num) {
        int[] digits = storeDigits(num);
        int[][] freq = new int[10][2]; // 0-9 digits
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) {
        int num = 21;
        System.out.println("Number: " + num);
        System.out.println("Digit count: " + countDigits(num));
        int[] digits = storeDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfDigits(num));
        System.out.println("Sum of squares: " + sumOfSquares(num));
        System.out.println("Is Harshad number? " + isHarshad(num));

        int[][] freq = frequency(num);
        System.out.println("Digit frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] != 0)
                System.out.println("Digit " + freq[i][0] + " : " + freq[i][1]);
        }
    }
}
