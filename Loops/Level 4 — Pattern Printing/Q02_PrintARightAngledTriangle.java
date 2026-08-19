// Q02 — Print a Right-Angled Triangle
// Take an integer N and print a right-angled triangle of stars.

import java.util.Scanner;

public class Q02_PrintARightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }    
}
// OUTPUT
// Enter the integer = 5
// *
// **
// ***
// ****
// *****