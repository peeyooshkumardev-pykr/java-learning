// Q12 — Print an Alphabet Diamond
// Take an integer N and print a centered diamond using alphabets.

import java.util.Scanner;

public class Q12_PrintAnAlphabetDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){

            for(int j = i; j<=N-1; j++){
                System.out.print(" ");
            }

            for(int j = 1; j<=2*i-1; j++){
                System.out.print((char)('A' + j - 1));
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 8
//        A
//       ABC
//      ABCDE
//     ABCDEFG
//    ABCDEFGHI
//   ABCDEFGHIJK
//  ABCDEFGHIJKLM
// ABCDEFGHIJKLMNO