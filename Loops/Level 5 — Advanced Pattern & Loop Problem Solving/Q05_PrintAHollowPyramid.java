// 05 — Print a Hollow Pyramid
// Take an integer N and print a hollow centered pyramid.

import java.util.Scanner;

public class Q05_PrintAHollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){
            for(int j = 1; j <= 2 * N - 1; j++){

                if(i == N || i + j == N + 1 || j - i == N - 1){
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
//       *      
//      * *     
//     *   *    
//    *     *   
//   *       *  
//  *         * 
// *************