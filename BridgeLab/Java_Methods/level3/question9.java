package level3;

import java.util.Scanner;

/*
 * Question 9: Display Calendar
 * Description: Displays a calendar for a given month and year using
 * proper indentation for weekdays and leap year calculation.
 */
public class question9 {

    static String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    static int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

    // Check if year is leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Get first day of the month (0=Saturday, 1=Sunday...)
    public static int getFirstDay(int day, int month, int year) {
        if(month<3){month+=12; year--;}
        int k = year%100; int j = year/100;
        return (day + 13*(month+1)/5 + k + k/4 + j/4 + 5*j) % 7;
    }

    // Display calendar
    public static void displayCalendar(int month, int year) {
        if(month==2 && isLeapYear(year)) daysInMonth[1]=29;
        System.out.println("   " + months[month-1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = getFirstDay(1, month, year);
        for(int i=0;i<firstDay;i++) System.out.print("    ");
        for(int day=1; day<=daysInMonth[month-1]; day++){
            System.out.printf("%3d ", day);
            if((firstDay+day)%7==0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        displayCalendar(month, year);
    }
}

