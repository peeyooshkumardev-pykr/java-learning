// Q12 — Check Prime Number
// Take an integer from the user and check whether it is a prime number.

import java.util.Scanner;

public class Q12_CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        boolean isPrime = true;
        for(int i = 2; i<num; i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num+" is prime number");
        }else{
            System.out.println(num+" is not a prime number");
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 11
// 11 is prime number

// Enter the integer = 15
// 15 is not a prime number