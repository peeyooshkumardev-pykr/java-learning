// Q07 — Find the Smallest Digit
// Take an integer from the user and find the smallest digit in it.

import java.util.Scanner;

public class Q07_FindTheSmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();
        
        int smallestDigit = Integer.MAX_VALUE;
        while(num!=0){
            int digit = num % 10;
            if(digit<smallestDigit){
                smallestDigit = digit;
            }
            num = num / 10;
        }
        System.out.println("Smallest digit in integer = "+ smallestDigit);
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 55667
// Smallest digit in integer = 5