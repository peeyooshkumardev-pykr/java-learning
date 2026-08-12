// Q09 — Convert a String to Uppercase

// Given a string, convert all lowercase letters in the string to uppercase and 
// print the resulting string.

// Keep spaces, digits, and special characters unchanged.

import java.util.Scanner;

public class Q09_ConvertAStringToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();
        
        System.out.println("Resulting String");
        System.out.println(str.toUpperCase());
        sc.close();
    }
}
// Output
// Enter String = Java Program
// Resulting String
// JAVA PROGRAM