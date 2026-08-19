// Q06 — Find the Largest Digit
// Take an integer from the user and find the largest digit in it.

import java.util.Scanner;

public class Q06_FindTheLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();
        
        int largestDigit = Integer.MIN_VALUE;
        while(num!=0){
            int digit = num % 10;
            if(digit>largestDigit){
                largestDigit = digit;
            }
            num = num / 10;
        }
        System.out.println("Largest digit in integer = "+ largestDigit);
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 54769
// Largest digit in integer = 9