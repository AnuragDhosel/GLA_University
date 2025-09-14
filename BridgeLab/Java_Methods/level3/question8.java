package level3;

import java.util.HashSet;
import java.util.Random;

/*
 * Question 8: 6-digit OTP Generator
 * Description: Generates 10 six-digit OTP numbers and checks if all OTPs are unique.
 */
public class question8 {

    // Generate a random 6-digit OTP
    public static int generateOTP() {
        return 100000 + new Random().nextInt(900000);
    }

    // Check if all OTPs in array are unique
    public static boolean areUnique(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        return set.size() == arr.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();

        System.out.println("Generated OTPs:");
        for (int otp : otps) System.out.println(otp);

        System.out.println("All OTPs unique? " + areUnique(otps));
    }
}

