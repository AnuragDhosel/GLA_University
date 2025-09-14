import java.util.Scanner;

public class Question5 {
    // Problem: Convert yards to feet, meters to inches, inches to centimeters
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in yards: ");
        double yards = sc.nextDouble();
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();
        System.out.print("Enter distance in inches: ");
        double inches = sc.nextDouble();

        double feet = yardsToFeet(yards);
        double inchesConverted = metersToInches(meters);
        double cm = inchesToCm(inches);

        System.out.println(yards + " yards = " + feet + " feet");
        System.out.println(meters + " meters = " + inchesConverted + " inches");
        System.out.println(inches + " inches = " + cm + " centimeters");
    }

    public static double yardsToFeet(double yards) {
        // Implementation to convert yards to feet
    }

    public static double metersToInches(double meters) {
        // Implementation to convert meters to inches
    }

    public static double inchesToCm(double inches) {
        // Implementation to convert inches to centimeters
    }
}
