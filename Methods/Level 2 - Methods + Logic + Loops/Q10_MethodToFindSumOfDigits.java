// Q10 — Method to Find Sum of Digits
// Create a method named sumOfDigits() that accepts an integer and returns the sum of its digits.

import java.util.Scanner;

public class Q10_MethodToFindSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        System.out.println("Sum of Digits of "+num+" = "+sumOfDigits(num));

        sc.close();

    }

    static int sumOfDigits(int num){
        int sum = 0;
        int digit = 0;

        while(num!=0){
            digit = num % 10;
            sum = sum + digit;
            num = num/10;
        }
        return sum;
    }
}
// // OUTPUT
// Enter the integer = 458905
// Sum of Digits of 458905 = 31