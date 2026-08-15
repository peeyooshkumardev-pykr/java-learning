// Q06 — Remove All Spaces from a String
// Given a string, remove all spaces from it and print the resulting string.

import java.util.Scanner;

public class Q06_RemoveAllSpacesfromAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();
        
        System.out.println("Resulting String");
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)!=' '){
                System.out.print(str.charAt(i));
            }
        }
        sc.close();
    }
}
//Output
// Enter String = I am from India.
// Resulting String
// IamfromIndia.