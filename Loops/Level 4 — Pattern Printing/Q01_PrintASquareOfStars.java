// Q01 — Print a Square of Stars
// Take an integer N and print an N × N square of stars.

import java.util.Scanner;

public class Q01_PrintASquareOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=N; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
//OUTPUT
// Enter the integer = 5
// *****
// *****
// *****
// *****
// *****