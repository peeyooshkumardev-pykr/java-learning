// Q14 — Method to Print Prime Numbers in a Range
// Create a method named printPrimes() that accepts two integers representing a range and prints all 
// prime numbers within that range.

import java.util.Scanner;

public class Q14_MethodToPrintPrimeNumbersInARange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st integer = ");
        int num1= sc.nextInt();
        
        System.out.print("Enter the 2nd integer = ");
        int num2 = sc.nextInt();

        System.out.println("Prime numbers between "+num1+" & "+num2);
        printPrimes(num1, num2);

        sc.close();
    }

    static void printPrimes(int num1,int num2){
        
        for(int i = num1; i<=num2; i++){
            boolean isPrime = true;
            
            if(i<2){
                continue;
            }
            for(int j = 2; j<i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }
}
// OUTPUT
// Enter the 1st integer = 5
// Enter the 2nd integer = 50
// Prime numbers between 5 & 50
// 5 7 11 13 17 19 23 29 31 37 41 43 47 



