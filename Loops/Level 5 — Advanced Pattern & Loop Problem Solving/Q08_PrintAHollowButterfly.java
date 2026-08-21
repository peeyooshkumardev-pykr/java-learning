// Q08 — Print a Hollow Butterfly
// Take an integer N and print a hollow butterfly pattern.

import java.util.Scanner;

public class Q08_PrintAHollowButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){

            for(int j = 1; j<=N; j++){

                if(j == 1 || i == j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 1; j<=N; j++){

                if(j == N || i + j == N + 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i = 1; i<=N; i++){

            for(int j = 1; j<=N; j++){

                if(j == 1 || i + j == N + 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 1; j<=N; j++){

                if(j == N || i == j){
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
// *        *
// **      **
// * *    * *
// *  *  *  *
// *   **   *
// *   **   *
// *  *  *  *
// * *    * *
// **      **
// *        *