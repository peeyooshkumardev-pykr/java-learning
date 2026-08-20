// Q10 — Print a Continuous Number Triangle
// Take an integer N and print consecutive numbers in a triangular pattern.

import java.util.Scanner;

public class Q10_PrintAContinuousNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        int k = 0;
        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=i; j++){
                k = k + 1;
                System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 5
// 1
// 23
// 456
// 78910
// 1112131415