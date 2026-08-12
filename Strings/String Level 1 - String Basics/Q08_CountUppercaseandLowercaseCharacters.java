// Q08 — Count Uppercase and Lowercase Characters

// Given a string, count and print the total number of uppercase and lowercase letters in the string.

// Ignore spaces, digits, and special characters.

import java.util.Scanner;

public class Q08_CountUppercaseandLowercaseCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        int countUppercase = 0;
        int countLowercase = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                countUppercase++;
            }

            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                countLowercase++;
            }
        }
        System.out.println("Total number of uppercase letters in the string = "+countUppercase);
        System.out.println("Total number of lowercase letters in the string = "+countLowercase);

        sc.close();
    }
}
//Output
// Enter String = HELLO guys! 
// Total number of uppercase letters in the string = 5
// Total number of lowercase letters in the string = 4