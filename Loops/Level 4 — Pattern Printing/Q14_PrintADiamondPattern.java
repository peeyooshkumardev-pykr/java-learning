// Q14 — Print a Diamond Pattern
// Take an integer N and print a diamond of stars.

import java.util.Scanner;

public class Q14_PrintADiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){

            //Upper Diamond
            for(int j = i; j<=N-1; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }   
            System.out.println();
        }
          //Lower Diamond
        for(int i = 1; i<=N-1; i++){
             for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*((N-1)-i)+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 6
//      *
//     ***
//    *****
//   *******
//  *********
// ***********
//  *********
//   *******
//    *****
//     ***
//      *