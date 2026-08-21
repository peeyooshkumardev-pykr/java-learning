// Q13 — Print a Palindromic Alphabet Pyramid
// Take an integer N and print a centered pyramid where the alphabets increase and then decrease.

import java.util.Scanner;

public class Q13_PrintAPalindromicAlphabetPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){

            for(int j = i; j<=N-1; j++){
                System.out.print(" ");
            }

            for(int j = 1; j<=i; j++){
                System.out.print((char)('A' + j - 1));
            }

            for(int j = i - 1; j>=1; j--){
                System.out.print((char)('A' + j - 1));
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 5
//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA