// Q08 — Print an Inverted Star Pyramid
// Take an integer N and print an inverted centered pyramid.

import java.util.Scanner;

public class Q08_PrintAnInvertedStarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){

            for(int j = 1; j <= i-1; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= 2*(N-i)+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 7
// *************
//  ***********
//   *********
//    *******
//     *****
//      ***
//       *