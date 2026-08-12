// Q10 — Convert a String to Lowercase

// Given a string, convert all uppercase letters in the string to lowercase and 
// print the resulting string.

// Keep spaces, digits, and special characters unchanged.

import java.util.Scanner;

public class Q10_ConvertAStringToLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();
        
        System.out.println("Resulting String");
        System.out.println(str.toLowerCase());
        sc.close();
    }
}
//Output
// Enter String = HELLO JAVA
// Resulting String
// hello java