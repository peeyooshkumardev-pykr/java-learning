// Q15 — Print a Butterfly Pattern
// Take an integer N and print a butterfly pattern.

import java.util.Scanner;

public class Q15_PrintAButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){

            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            for(int j = 1; j<=(N*2)-2*i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i<=N-1; i++){

            for(int j = i; j<=N-1; j++){
                System.out.print("*");
            }

            for(int j = 1; j<=2*i; j++){
                System.out.print(" ");
            }

            for(int j = i; j<=N-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 10
// *                  *
// **                **
// ***              ***
// ****            ****
// *****          *****
// ******        ******
// *******      *******
// ********    ********
// *********  *********
// ********************
// *********  *********
// ********    ********
// *******      *******
// ******        ******
// *****          *****
// ****            ****
// ***              ***
// **                **
// *                  *