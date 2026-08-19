// Q08 — Print a Repeated Number Grid
// Take an integer N and print an N × N grid where each row contains the row number.

import java.util.Scanner;

public class Q08_PrintARepeatedNumberGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=N; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 4
// 1 1 1 1 
// 2 2 2 2 
// 3 3 3 3 
// 4 4 4 4 