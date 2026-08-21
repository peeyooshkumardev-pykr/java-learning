// Q10 — Print a Number Diamond
// Take an integer N and print a centered diamond using increasing numbers.

import java.util.Scanner;

public class Q10_PrintANumberDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){

            for(int j = i; j<=N-1; j++){
                System.out.print(" ");
            }

            int k = 0;
            for(int j = 1; j<=2*i-1; j++){
                k = k + 1;
                System.out.print(k);
            }
            System.out.println();
        }
        
        for(int i = 1; i<=N-1; i++){

            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }

            int k = 0;
            for(int j = 1; j<=2*(N-i)-1; j++){
                k = k + 1;
                System.out.print(k);
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
//  12345
//   123
//    1