package level2;

import java.util.Scanner;

public class Question4 {

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
        for (int i = 0; i < len; i++) if (text.charAt(i) == ' ') spaces++;
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

    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestLongest(String[][] data) {
        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < data.length; i++) {
            int length = Integer.parseInt(data[i][1]);
            if (length < min) { min = length; minIndex = i; }
            if (length > max) { max = length; maxIndex = i; }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] data = wordWithLength(words);
        int[] result = findShortestLongest(data);

        System.out.println("Shortest Word: " + data[result[0]][0]);
        System.out.println("Longest Word: " + data[result[1]][0]);
        sc.close();
    }
}