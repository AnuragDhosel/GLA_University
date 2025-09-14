import java.util.Scanner;

public class Question4 {
    // Problem: Convert kilometers to miles and meters to feet
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();

        double miles = kmToMiles(km);
        double feet = metersToFeet(meters);

        System.out.println(km + " kilometers = " + miles + " miles");
        System.out.println(meters + " meters = " + feet + " feet");
    }

    public static double kmToMiles(double km) {
        // Implementation to convert km to miles
    }

    public static double metersToFeet(double meters) {
        // Implementation to convert meters to feet
    }
}
