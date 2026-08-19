// Q06 — Print a Repeated Number Triangle
// Take an integer N and print the row number repeatedly.

import java.util.Scanner;

public class Q06_PrintARepeatedNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }    
}
// OUTPUT
// Enter the integer = 3
// 1
// 22
// 333