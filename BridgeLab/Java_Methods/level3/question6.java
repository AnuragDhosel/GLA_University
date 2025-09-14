package level3;

/*
 * Question 6: NumberChecker – Perfect, Abundant, Deficient, Strong
 * Description: This program checks if a number is Perfect, Abundant, Deficient,
 * or a Strong number (sum of factorial of digits equals number).
 */
public class question6 {

    // Sum of proper divisors
    public static int sumOfProperDivisors(int num) {
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) if (num % i == 0) sum += i;
        return sum;
    }

    // Check perfect number
    public static boolean isPerfect(int num) {
        return sumOfProperDivisors(num) == num;
    }

    // Check abundant number
    public static boolean isAbundant(int num) {
        return sumOfProperDivisors(num) > num;
    }

    // Check deficient number
    public static boolean isDeficient(int num) {
        return sumOfProperDivisors(num) < num;
    }

    // Factorial of a digit
    public static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    // Check strong number
    public static boolean isStrong(int num) {
        int n = num, sum = 0;
        while (n > 0) {
            sum += factorial(n % 10);
            n /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int num = 145;
        System.out.println("Number: " + num);
        System.out.println("Perfect? " + isPerfect(num));
        System.out.println("Abundant? " + isAbundant(num));
        System.out.println("Deficient? " + isDeficient(num));
        System.out.println("Strong? " + isStrong(num));
    }
}
