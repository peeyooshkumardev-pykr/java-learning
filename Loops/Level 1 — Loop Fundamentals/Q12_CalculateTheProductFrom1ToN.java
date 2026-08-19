// Q12 — Calculate the Product from 1 to N
// Take an integer N and calculate:

// 1 × 2 × 3 × ... × N

// Example: Enter N = 5 Product = 120

import java.util.Scanner;

public class Q12_CalculateTheProductFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        int mul = 1;
        for(int i = 1; i<=num; i++){
            System.out.print(i);
            if(i<num){
                System.out.print(" * ");
            }
            mul = mul * i;
        }
        System.out.print(" = "+mul);
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 6
// 1 * 2 * 3 * 4 * 5 * 6 = 720
