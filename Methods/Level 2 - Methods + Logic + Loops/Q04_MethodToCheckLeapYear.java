// Q04 — Method to Check Leap Year
// Create a method named isLeapYear() that accepts a year and returns true if 
// the year is a leap year, otherwise returns false.\

import java.util.Scanner;

public class Q04_MethodToCheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Year = ");
        int year = sc.nextInt();

        System.out.println("Leap Year = "+isLeapYear(year));

        sc.close();
    }

    static boolean isLeapYear(int year){
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);  
    }
}
// OUTPUT
// Enter the Year = 1900
// Leap Year = false

// Enter the Year = 2028
// Leap Year = true