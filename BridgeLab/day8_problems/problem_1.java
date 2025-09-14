/*
Problem Statement:
1. Number Guessing Game:
   - Write a Java program where the user thinks of a number between 1 and 100,
     and the computer tries to guess the number by generating random guesses.
   - The user provides feedback: 'high', 'low', or 'correct'.
   - The program should be modular with functions for generating guesses,
     receiving user feedback, and determining the next guess.
*/

package day8_problems;
import java.util.*;

public class problem_1 {
    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback = "";

        System.out.println("Think of a number between 1 and 100. I'll try to guess!");

        while (!feedback.equalsIgnoreCase("correct")) {
            int guess = generateGuess(low, high);
            System.out.println("My guess is: " + guess);
            System.out.print("Is it 'high', 'low', or 'correct'? ");
            feedback = sc.next();

            if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            }
        }
        System.out.println("Hooray! I guessed your number.");
        sc.close();
    }
}
