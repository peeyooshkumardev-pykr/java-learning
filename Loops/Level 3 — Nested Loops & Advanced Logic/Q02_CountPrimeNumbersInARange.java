// Q02 — Count Prime Numbers in a Range
// Take two integers from the user and count how many prime numbers exist between them.

import java.util.Scanner;

public class Q02_CountPrimeNumbersInARange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st integer = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd integer = ");
        int num2 = sc.nextInt();

         if(num1>num2){
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
        int count = 0;
        for(int i = num1; i<=num2; i++){
            if(i < 2){
                continue;
            }

            boolean isPrime = true;
            for(int j = 2; j<i; j++){
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                count++;
            }
        }
        System.out.println("Number of prime numbers between "+num1+" and "+num2+" = "+count);
        sc.close();
    }
}
// OUTPUT
// Enter the 1st integer = 0
// Enter the 2nd integer = 10
// Number of prime numbers between 0 and 10 = 4