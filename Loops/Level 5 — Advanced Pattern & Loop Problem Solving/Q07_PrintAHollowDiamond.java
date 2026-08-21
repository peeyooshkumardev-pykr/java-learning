// Q07 — Print a Hollow Diamond
// Take an integer N and print a hollow diamond.

import java.util.Scanner;

public class Q07_PrintAHollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){
            
            for(int j = 1; j<=2*N-1; j++){

                if(i + j == N + 1 || j - i == N - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         for(int i = 1; i<N; i++){
            
            for(int j = 1; j<=2*N-1; j++){

                if(j == i + 1 || i + j == 2*N - 1){
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
// Enter the integer = 4
//    *   
//   * *  
//  *   * 
// *     *
//  *   * 
//   * *  
//    *   