package Elements_Practices;
import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        double inches = heightCm / 2.54;
        double feet = Math.floor(inches / 12);
        double remainingInches = inches % 12;

        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + remainingInches);
    }
}