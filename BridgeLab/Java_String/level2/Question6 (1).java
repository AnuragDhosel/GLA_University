package level2;

import java.util.Scanner;

public class Question6 {

    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) >= 0) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] charTypes(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = checkCharType(str.charAt(i));
        }
        return result;
    }

    public static void display(String[][] data) {
        System.out.println("Char\tType");
        for (String[] row : data) System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String[][] result = charTypes(input);
        display(result);
        sc.close();
    }
}