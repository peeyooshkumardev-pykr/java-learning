// Q03 — Print an Inverted Right-Angled Triangle
// Take an integer N and print an inverted right-angled triangle.

import java.util.Scanner;

public class Q03_PrintAnInvertedRightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = N; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
//OUTPUT
// Enter the integer = 4
// ****
// ***
// **
// *