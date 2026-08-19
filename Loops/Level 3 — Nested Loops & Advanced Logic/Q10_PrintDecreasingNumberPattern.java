// Q10 — Print Decreasing Number Pattern
// Take an integer N and print the following pattern.

// Example: Enter N = 5

// 12345 1234 123 12 1

import java.util.Scanner;

public class Q10_PrintDecreasingNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = N; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 6
// 123456
// 12345
// 1234
// 123
// 12
// 1