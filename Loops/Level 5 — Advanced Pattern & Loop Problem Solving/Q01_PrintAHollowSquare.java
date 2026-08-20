// Q01 — Print a Hollow Square
// Take an integer N and print a hollow square of stars.

import java.util.Scanner;

public class Q01_PrintAHollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=N; j++){
                
                if(i == 1 || i == N || j == 1 || j == N){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 5
// *****
// *   *
// *   *
// *   *
// *****