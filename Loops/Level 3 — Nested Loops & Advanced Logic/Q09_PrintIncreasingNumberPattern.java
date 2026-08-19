// Q09 — Print Increasing Number Pattern
// Take an integer N and print the following pattern.
// Example: Enter N = 5

// 1 12 123 1234 12345

import java.util.Scanner;

public class Q09_PrintIncreasingNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 7 
// 1
// 12
// 123
// 1234
// 12345
// 123456
// 1234567