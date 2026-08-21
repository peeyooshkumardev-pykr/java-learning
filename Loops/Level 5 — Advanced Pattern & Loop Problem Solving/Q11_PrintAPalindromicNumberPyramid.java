// Q11 — Print a Palindromic Number Pyramid
// Taje an integer N and print a centered pyramid where the numbers increase and then decrease.

import java.util.Scanner;

public class Q11_PrintAPalindromicNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){

            for(int j = i; j <= N - 1; j++){
                System.out.print(" ");
            }
            
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }

            for(int j = i - 1; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 6
//      1
//     121
//    12321
//   1234321
//  123454321
// 12345654321