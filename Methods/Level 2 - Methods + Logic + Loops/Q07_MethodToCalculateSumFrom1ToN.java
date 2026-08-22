// Q07 — Method to Calculate Sum from 1 to N
// Create a method named calculateSum() that accepts an integer N and returns the 
// sum of numbers from 1 to N.

import java.util.Scanner;

public class Q07_MethodToCalculateSumFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        if(N<0){
            System.out.println("Wrong Output");
            sc.close();
            return;
        }
        
        System.out.println("Sum of number from 1 to "+N);

        for(int i = 1; i<=N; i++){
            System.out.print(i);
            if(i<N){
                System.out.print(" + ");
            }
        }
        System.out.print(" = "+calculateSum(N));

        sc.close();
    }

    static int calculateSum(int num){
        int sum = 0;

        for(int i = 1; i<=num; i++){
            sum = sum + i;
        }

        return sum;
    }
}
// OUTPUT
// Enter the integer = 20
// Sum of number from 1 to 20
// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20 = 210