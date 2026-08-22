// Q20 — Build a Number Analyzer Using Multiple Methods
// Create a program that accepts an integer and uses separate methods to:

// Count its digits
// Find the sum of its digits
// Reverse the number
// Check whether it is a palindrome
// Check whether it is prime
// Check whether it is an Armstrong number

import java.util.Scanner;

public class Q20_BuildANumberAnalyzerUsingMultipleMethods {
    
    //Counting digits of given integer
    static int countDigits(int num){
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }
        return count;
    }

    //Sumation of the digits of given integer
    static int sumDigits(int num){
        int sum = 0;
        while(num!=0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }

    //Reverse of the given integer
    static int reverseNumber(int num){
        int reverse = 0;
        while(num!=0){
            reverse = reverse * 10 + num % 10;
            num = num/10;
        }
        return reverse;
    }

    //Check whether given integer is a palindrome
    static boolean isPalindrome(int num){
        int reverse = 0;
        int num1 = num;
        while(num1!=0){
            reverse = reverse * 10 + num1 % 10;
            num1 = num1/10;
        }
        return reverse==num;
    }

    //Check whether given integer is prime number
    static boolean isPrime(int num){
        for(int i = 2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    //Check whether given integer is an ArmStrong Number
    static boolean isArmstrong(int num){
        int num1 = num;
        int num2 = num;
        int count = 0;

        while(num1!=0){
            num1 = num1/10;
            count++;
        }
        int sum = 0;
        while (num2!=0) {
            int mul = 1;
            int count1 = count;
            int digit = num2%10;
            
            while(count1!=0){
                mul = mul * digit;
                count1--;
            } 
            sum = sum + mul;
            num2 = num2/10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        System.out.println();

        System.out.println("Number of digits in "+num+" = "+ countDigits(num));

        System.out.println("Sum of digits in "+num+" = "+ sumDigits(num));
  
        System.out.println("Reverse of "+num+" = "+ reverseNumber(num));

        if(isPalindrome(num)){
            System.out.println("Palindrome = " + isPalindrome(num));
        }else{
             System.out.println("Palindrome = " + isPalindrome(num));
        }

        if(isPrime(num)){
            System.out.println("Prime Number = " + isPrime(num));
        }else{
             System.out.println("Prime Number = " + isPrime(num));
        }

        if(isArmstrong(num)){
            System.out.println("ArmStrong = " + isArmstrong(num));
        }else{
            System.out.println("ArmStrong = " + isArmstrong(num));
        }

        sc.close();
    }
}
// OUTPUT 1
// Enter the integer = 2347

// Number of digits in 2347 = 4
// Sum of digits in 2347 = 16
// Reverse of 2347 = 7432
// Palindrome = false
// Prime Number = true
// ArmStrong = false

// OUTPUT 2
// Enter the integer = 6

// Number of digits in 6 = 1
// Sum of digits in 6 = 6
// Reverse of 6 = 6
// Palindrome = true
// Prime Number = false
// ArmStrong = true