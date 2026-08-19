// Q06 — Print Multiplication Tables from 1 to N
// Take an integer N and print the multiplication table of every number from 1 to N.

import java.util.Scanner;

public class Q06_PrintMultiplicationTablesFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){
            System.out.print("Table of "+i+" = ");
            for(int j = 1; j<=10; j++){
                int mul = i * j;
                System.out.print(mul+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 10
// Table of 1 = 1 2 3 4 5 6 7 8 9 10 
// Table of 2 = 2 4 6 8 10 12 14 16 18 20 
// Table of 3 = 3 6 9 12 15 18 21 24 27 30 
// Table of 4 = 4 8 12 16 20 24 28 32 36 40 
// Table of 5 = 5 10 15 20 25 30 35 40 45 50 
// Table of 6 = 6 12 18 24 30 36 42 48 54 60 
// Table of 7 = 7 14 21 28 35 42 49 56 63 70 
// Table of 8 = 8 16 24 32 40 48 56 64 72 80 
// Table of 9 = 9 18 27 36 45 54 63 72 81 90 
// Table of 10 = 10 20 30 40 50 60 70 80 90 100 