// Q03 — Print a Hollow Right-Angled Triangle
// Take an integer N and print a hollow right-angled triangle.

import java.util.Scanner;

public class Q03_PrintAHollowRightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=N; j++){

                if(i == j || i == N || j == 1){
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
// Enter the integer = 8
// *       
// **      
// * *     
// *  *    
// *   *   
// *    *  
// *     * 
// ********