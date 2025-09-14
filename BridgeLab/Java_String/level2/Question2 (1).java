package level2;

import java.util.Scanner;

public class Question2 {

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

    public static String[] customSplit(String text) {
        int len = findLength(text);
        int spaces = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaces++;
        }
        String[] words = new String[spaces + 1];
        int start = 0, index = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = text.substring(start, len);
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] custom = customSplit(text);
        String[] builtin = text.split(" ");

        System.out.println("Custom Split:");
        for (String w : custom) System.out.print(w + " | ");
        System.out.println("\nBuilt-in Split:");
        for (String w : builtin) System.out.print(w + " | ");

        boolean isEqual = compareArrays(custom, builtin);
        System.out.println("\nAre both equal? " + isEqual);
        sc.close();
    }
}