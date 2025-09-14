package level3;

import java.util.Arrays;

/*
 * Question 2: NumberChecker – Basic Digit Analysis
 * Description: Provides utility methods to count digits, store digits in an array,
 * check for duck number, Armstrong number, largest/second largest and smallest/second smallest digits.
 */
public class question2 {

    // Count number of digits in the number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Store digits of number in an array
    public static int[] storeDigits(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) digits[i] = str.charAt(i) - '0';
        return digits;
    }

    // Check if number is a duck number (contains zero)
    public static boolean isDuckNumber(int num) {
        int[] digits = storeDigits(num);
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    // Check if number is an Armstrong number
    public static boolean isArmstrongNumber(int num) {
        int[] digits = storeDigits(num);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, n);
        return sum == num;
    }

    // Find largest and second largest digits
    public static int[] largestAndSecondLargest(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    // Find smallest and second smallest digits
    public static int[] smallestAndSecondSmallest(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        int num = 153;

        System.out.println("Number: " + num);
        System.out.println("Digit count: " + countDigits(num));
        int[] digits = storeDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Is Duck Number? " + isDuckNumber(num));
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(num));
        System.out.println("Largest & Second Largest: " + Arrays.toString(largestAndSecondLargest(digits)));
        System.out.println("Smallest & Second Smallest: " + Arrays.toString(smallestAndSecondSmallest(digits)));
    }
}

