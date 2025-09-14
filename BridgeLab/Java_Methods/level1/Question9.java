package java_methods.level1;
/*
Problem: Divide N number of chocolates among M children. Print chocolates each child gets and remaining chocolates
*/
import java.util.Scanner;

public class Question9 {

    public static int[] distributeChocolates(int totalChocolates, int children) {
        int[] result = new int[2];
        result[0] = totalChocolates / children; // chocolates each child
        result[1] = totalChocolates % children; // remaining chocolates
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] res = distributeChocolates(chocolates, children);
        System.out.println("Each child gets: " + res[0] + ", Remaining chocolates: " + res[1]);
    }
}
