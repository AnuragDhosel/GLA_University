package level1;
import java.util.Scanner;

public class Question5 {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // out of range
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // generateException(text); // Uncomment to see abrupt termination
        handleException(text);
        sc.close();
    }
}