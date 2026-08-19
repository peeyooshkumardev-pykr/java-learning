// Q05 — Check Palindrome Number
// Take an integer from the user and check whether it is a palindrome number.

import java.util.Scanner;

public class Q05_CheckPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();
        int integer = num;

        int reverse = 0;
        while(num!=0){
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }

        if(reverse==integer){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not Palindrome number");
        }

        sc.close();
    }
}
// OUTPUT
// Enter the integer = 1221
// Palindrome number

// Enter the integer = 1223
// Not Palindrome number