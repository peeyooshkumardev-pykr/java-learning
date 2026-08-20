// Q11 — Print a 0-1 Triangle
// Take an integer N and print a triangle using alternating 0 and 1.

import java.util.Scanner;

public class Q11_PrintA0_1Triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 5
// 1
// 01
// 101
// 0101
// 10101