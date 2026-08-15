// Q06 — Count Digits in a String

// Given a string, count and print the total number of digits (0–9) present in the string.

// Ignore letters, spaces, and special characters.

import java.util.Scanner;

public class Q06_CountDigitsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        System.out.print("Digits are ( ");

        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='0'||str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9'){
                System.out.print(str.charAt(i)+" ");
                count++;
            }
        }
        System.out.print(")");
        System.out.println();
        System.out.println("The total number of digits (0-9) present in the string = "+count);
        
        sc.close();
    }
}
//Output
// Enter String = Hello Agent12. I am Agent02. 
// Digits are ( 1 2 0 2 )
// The total number of digits (0-9) present in the string = 4