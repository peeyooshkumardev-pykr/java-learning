// Q07 — Count Spaces in a String

// Given a string, count and print the total number of spaces present in the string.

import java.util.Scanner;

public class Q07_CountSpacesInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("The total number of spaces present in the string = "+count);
        
        sc.close();
    }
}
//Output
// Enter String = I am studing strings in java.
// The total number of spaces present in the string = 5
