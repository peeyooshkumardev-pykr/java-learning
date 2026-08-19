// Q07 — Print a Centered Star Pyramid
// Take an integer N and print a centered pyramid of stars.

import java.util.Scanner;

public class Q07_PrintACenteredStarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){

            for(int j = i; j<=N-1; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 5
//     *
//    ***
//   *****
//  *******
// *********