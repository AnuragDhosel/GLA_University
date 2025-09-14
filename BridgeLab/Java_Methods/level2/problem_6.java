import java.util.Scanner;

public class Question6 {
    // Problem: Convert Fahrenheit to Celsius, pounds to kilograms, gallons to liters
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.print("Enter volume in gallons: ");
        double gallons = sc.nextDouble();

        double celsius = fahrenheitToCelsius(fahrenheit);
        double kilograms = poundsToKilograms(pounds);
        double liters = gallonsToLiters(gallons);

        System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celsius");
        System.out.println(pounds + " pounds = " + kilograms + " kilograms");
        System.out.println(gallons + " gallons = " + liters + " liters");
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        // Implementation to convert Fahrenheit to Celsius
    }

    public static double poundsToKilograms(double pounds) {
        // Implementation to convert pounds to kilograms
    }

    public static double gallonsToLiters(double gallons) {
        // Implementation to convert gallons to liters
    }
}
