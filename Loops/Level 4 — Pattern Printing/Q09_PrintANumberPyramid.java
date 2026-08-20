// Q09 — Print a Number Pyramid
// Take an integer N and print a centered pyramid using numbers.

import java.util.Scanner;

public class Q09_PrintANumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){

            for(int j = i; j<=N-1; j++){
                System.out.print(" ");
            }

            for(int j = 1; j<=2*i-1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 4
//    1
//   123
//  12345
// 1234567