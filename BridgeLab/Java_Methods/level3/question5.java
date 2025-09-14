package level3;

/*
 * Question 5: NumberChecker – Prime, Neon, Spy, Automorphic, Buzz
 * Description: This program checks various special number properties:
 * Prime, Neon, Spy, Automorphic, and Buzz numbers.
 */
public class question5 {

    // Check if number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) if (num % i == 0) return false;
        return true;
    }

    // Check if number is neon
    public static boolean isNeon(int num) {
        int sum = 0;
        int sq = num * num;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == num;
    }

    // Check if number is a spy number
    public static boolean isSpy(int num) {
        int sum = 0, prod = 1, n = num;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            prod *= d;
            n /= 10;
        }
        return sum == prod;
    }

    // Check if number is automorphic
    public static boolean isAutomorphic(int num) {
        int sq = num * num;
        return String.valueOf(sq).endsWith(String.valueOf(num));
    }

    // Check if number is buzz
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || String.valueOf(num).endsWith("7");
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println("Number: " + num);
        System.out.println("Prime? " + isPrime(num));
        System.out.println("Neon? " + isNeon(num));
        System.out.println("Spy? " + isSpy(num));
        System.out.println("Automorphic? " + isAutomorphic(num));
        System.out.println("Buzz? " + isBuzz(num));
    }
}
