// Q02 — Check if a String is a Palindrome

// Given a string, check whether it reads the same forward and backward.

import java.util.Scanner;

public class Q02_CheckIfAStringIsAPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        int reverse;
        boolean isPalindrome = true;
        for(int i =0; i<str.length(); i++){
            reverse = str.length()-1-i;
            if(str.charAt(i)!=str.charAt(reverse)){
                isPalindrome = false;
                break;
            }
        }
         if(isPalindrome){
                System.out.println("String is a Palindrome");
            }
            else{
                System.out.println("String is not a Palindrome");
            }

        sc.close();
    }
}
//Output
// Enter String = madam
// String is a Palindrome

// Enter String = java
// String is not a Palindrome