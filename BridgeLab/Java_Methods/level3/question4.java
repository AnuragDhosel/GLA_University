package level3;

import java.util.Arrays;

/*
 * Question 4: NumberChecker – Reverse, Palindrome, Duck
 * Description: This program checks if a number is a palindrome, a duck number,
 * and also reverses the digits of the number.
 */
public class question4 {

    public static int[] storeDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    // Reverse an array of digits
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    // Check if number is a palindrome
    public static boolean isPalindrome(int num) {
        int[] digits = storeDigits(num);
        return Arrays.equals(digits, reverseArray(digits));
    }

    // Check if number is a duck number
    public static boolean isDuckNumber(int num) {
        int[] digits = storeDigits(num);
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int num = 121;
        System.out.println("Number: " + num);
        System.out.println("Digits: " + Arrays.toString(storeDigits(num)));
        System.out.println("Reversed: " + Arrays.toString(reverseArray(storeDigits(num))));
        System.out.println("Is Palindrome? " + isPalindrome(num));
        System.out.println("Is Duck Number? " + isDuckNumber(num));
    }
}
