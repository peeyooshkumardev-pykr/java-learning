/*Q12 — Method to Check Number Palindrome
Create a method named isPalindrome() that accepts an integer and returns true if the 
number is a palindrome, otherwise returns false.*/

import java.util.Scanner;

public class Q12_MethodToCheckNumberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        System.out.println("Palindrome = "+isPalindrome(num));
        
        sc.close();
    }

    static boolean isPalindrome(int num){
        int reverse = 0;
        int num1 = num;
        while(num1!=0){
            reverse = reverse * 10 + num1 % 10;
            num1 = num1 / 10;
        }
        return num==reverse;
    }
}
// OUTPUT
// Enter the integer = 4554
// Palindrome = true

// Enter the integer = 3221
// Palindrome = false