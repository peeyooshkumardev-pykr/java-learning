// Q02 — Find the Sum of Digits
// Take an integer from the user and find the sum of all its digits.

import java.util.Scanner;

public class Q02_FindTheSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        int sumDigits = 0;

        while(num!=0){
            int sum = num % 10;
            sumDigits = sumDigits + sum;
            num = num / 10;
        }
        System.out.println("Sum of digits = "+sumDigits);
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 2242
// Sum of digits = 10