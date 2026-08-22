// Q13 — Method to Check Prime Number
// Create a method named isPrime() that accepts an integer and returns true if the number is 
// prime and false otherwise.

import java.util.Scanner;

public class Q13_MethodToCheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        System.out.println("Prime Number = "+isPrime(num));

        sc.close();
    }

    static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i = 2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
// // OUTPUT
// Enter the integer = 43
// Prime Number = true

// Enter the integer = 24
// Prime Number = false