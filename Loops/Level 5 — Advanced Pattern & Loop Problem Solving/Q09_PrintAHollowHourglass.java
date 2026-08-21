// Q09 — Print a Hollow Hourglass
// Take an integer N and print a hollow hourglass pattern.

import java.util.Scanner;

public class Q09_PrintAHollowHourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){

            for(int j = 1; j<=N; j++){

                if(i == 1 || i == j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 1; j<=N-1; j++){

                if(i == 1 || i + j == N){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i = 1; i<=N - 1; i++){

            for(int j = 1; j<=N; j++){

                if(i + j == N || i == N - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 1; j<=N-1; j++){

                if(i == j|| i == N - 1){
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
// Enter the integer = 7
// *************
//  *         * 
//   *       *  
//    *     *   
//     *   *    
//      * *     
//       *      
//      * *     
//     *   *    
//    *     *   
//   *       *  
//  *         * 
// *************