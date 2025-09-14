package java_methods.level1;
/*
Problem: Calculate various trigonometric functions using Math class given an angle in degrees
*/
import java.util.Scanner;

public class Question11 {

    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        double[] res = new double[3];
        res[0] = Math.sin(rad);
        res[1] = Math.cos(rad);
        res[2] = Math.tan(rad);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] res = calculateTrigonometricFunctions(angle);
        System.out.println("Sin: " + res[0] + ", Cos: " + res[1] + ", Tan: " + res[2]);
    }
}
