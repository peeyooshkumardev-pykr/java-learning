// Q07 — Print a Number Grid
// Take an integer N and print an N × N grid containing numbers from 1 to N.

import java.util.Scanner;

public class Q07_PrintANumberGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=N; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 5
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 