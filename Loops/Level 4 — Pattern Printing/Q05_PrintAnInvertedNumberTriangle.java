// Q05 — Print an Inverted Number Triangle
// Take an integer N and print decreasing numbers in each row.

import java.util.Scanner;

public class Q05_PrintAnInvertedNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = N; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 5
// 12345
// 1234
// 123
// 12
// 1