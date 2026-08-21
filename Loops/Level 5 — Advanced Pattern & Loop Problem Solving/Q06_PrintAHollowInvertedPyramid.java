// Q06 — Print a Hollow Inverted Pyramid
// Take an integer N and print a hollow inverted centered pyramid.

import java.util.Scanner;

public class Q06_PrintAHollowInvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=2*N-1; j++){
                
                if(i == 1 || i == j || i + j == 2*N){
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
// *********
//  *     * 
//   *   *  
//    * *   
//     *   