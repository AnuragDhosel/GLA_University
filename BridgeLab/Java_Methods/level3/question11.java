package level3;

import java.util.Random;

/*
 * Question 11: Employee Bonus Calculation
 * Description: Calculates bonus for 10 employees based on years of service.
 * Computes old salary, bonus, and new salary and displays a summary.
 */
public class question11 {

    // Generate random salary and years of service
    public static int[][] generateSalaryYears(int n){
        Random rand = new Random();
        int[][] data = new int[n][2];
        for(int i=0;i<n;i++){
            data[i][0] = 10000 + rand.nextInt(90000); // Salary
            data[i][1] = rand.nextInt(11); // Years of service 0-10
        }
        return data;
    }

    // Calculate new salary and bonus
    public static double[][] calculateNewSalaryBonus(int[][] data){
        double[][] result = new double[data.length][3]; // old, bonus, new
        for(int i=0;i<data.length;i++){
            double bonus = data[i][1]>5 ? data[i][0]*0.05 : data[i][0]*0.02;
            result[i][0] = data[i][0];
            result[i][1] = bonus;
            result[i][2] = data[i][0]+bonus;
        }
        return result;
    }

    // Display salary, bonus, and totals
    public static void displayResult(double[][] arr){
        double sumOld=0,sumNew=0,totalBonus=0;
        System.out.println("OldSalary\tBonus\tNewSalary");
        for(double[] row: arr){
            System.out.printf("%.0f\t\t%.2f\t%.2f\n", row[0], row[1], row[2]);
            sumOld+=row[0]; totalBonus+=row[1]; sumNew+=row[2];
        }
        System.out.println("Total\t\t"+totalBonus+"\t"+sumNew);
    }

    public static void main(String[] args){
        int n = 10;
        int[][] data = generateSalaryYears(n);
        double[][] result = calculateNewSalaryBonus(data);
        displayResult(result);
    }
}
