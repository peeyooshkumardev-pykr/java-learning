// Q15 — Find the Sum of All Prime Numbers in a Range
// Take two integers from the user and find the sum of all prime numbers between them.

import java.util.Scanner;

public class Q15_FindTheSumOfAllPrimeNumbersInARange {
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
        
            int sum = 0;
        for(int i = num1; i<=num2; i++){
            if(i < 2){
                continue;
            }
            boolean isPrime = true;

            for(int j = 2; j<i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                sum = sum + i;
            }
        }
        System.out.println("Sum of Prime numbers between "+num1+" and "+num2+" = "+sum);
        sc.close();
    }
}
//OUTPUT
// Enter the 1st integer = 1
// Enter the 2nd integer = 10
// Sum of Prime numbers between 1 and 10 = 17