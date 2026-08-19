// Q01 — Print All Prime Numbers in a Range
// Take two integers from the user and print all prime numbers between them.

import java.util.Scanner;

public class Q01_PrintAllPrimeNumbersInARange {
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
        
        System.out.println("Prime numbers between "+num1+" and "+num2);
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
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
// OUTPUT
// Enter the 1st integer = 1
// Enter the 2nd integer = 100
// Prime numbers between 1 and 100
// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 

// Enter the 1st integer = 20
// Enter the 2nd integer = 1
// Prime numbers between 1 and 20
// 2 3 5 7 11 13 17 19 