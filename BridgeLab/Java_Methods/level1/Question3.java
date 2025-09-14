package java_methods.level1;
/*
Problem: An athlete runs in a triangular park with sides provided as input by the user in meters. 
If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
*/
import java.util.Scanner;

public class Question3 {

    public static double calculateRounds(double side1, double side2, double side3, double distance) {
        double perimeter = side1 + side2 + side3;
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double s1 = sc.nextDouble();
        System.out.print("Enter side2: ");
        double s2 = sc.nextDouble();
        System.out.print("Enter side3: ");
        double s3 = sc.nextDouble();

        double rounds = calculateRounds(s1, s2, s3, 5000);
        System.out.println("Athlete needs to complete " + rounds + " rounds to complete 5 km");
    }
}
