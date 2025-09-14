package level2;

import java.util.Scanner;

public class Question1 {
    
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        int myLength = findLength(input);
        int builtinLength = input.length();

        System.out.println("Length (User Defined): " + myLength);
        System.out.println("Length (Built-in): " + builtinLength);

        sc.close();
    }
}