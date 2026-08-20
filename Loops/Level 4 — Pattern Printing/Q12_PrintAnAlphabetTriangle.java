// Q12 — Print an Alphabet Triangle
// Take an integer N and print alphabets in increasing order.

import java.util.Scanner;

public class Q12_PrintAnAlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=i; j++){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 5
// A
// AB
// ABC
// ABCD
// ABCDE