// Q09 — Method to Count Digits
// Create a method named countDigits() that accepts an integer and returns the number of digits in it.

import java.util.Scanner;

public class Q09_MethodToCountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        System.out.println("Number of Digits in "+num+" = "+countDigits(num));

        sc.close();
    }

    static int countDigits(int num){
        int countDigits = 0;
        if(num==0){
            countDigits = 1;
        }
        while(num!=0){
            num = num / 10;
            countDigits++;
        }
        
        return countDigits;
    }
}
// OUTPUT
// Enter the integer = 5473821
// Number of Digits in 5473821 = 7