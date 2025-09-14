package level2;

import java.util.Scanner;

public class Question9 {

    public static String getComputerChoice() {
        int val = (int)(Math.random() * 3);
        if (val == 0) return "rock";
        else if (val == 1) return "paper";
        else return "scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if (user.equals("rock") && comp.equals("scissors")) return "User";
        if (user.equals("paper") && comp.equals("rock")) return "User";
        if (user.equals("scissors") && comp.equals("paper")) return "User";
        return "Computer";
    }

    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {
        String[][] result = new String[2][2];
        result[0][0] = "User"; result[0][1] = (userWins * 100 / totalGames) + "%";
        result[1][0] = "Computer"; result[1][1] = (compWins * 100 / totalGames) + "%";
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        int userWins = 0, compWins = 0, draws = 0;
        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = findWinner(user, comp);
            System.out.println("Computer chose: " + comp);
            System.out.println("Winner: " + winner);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;
        }
        System.out.println("\nFinal Stats:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + draws);
        String[][] stats = calculateStats(userWins, compWins, games);
        System.out.println("\nWinning Percentages:");
        for (String[] row : stats) System.out.println(row[0] + ": " + row[1]);
        sc.close();
    }
}