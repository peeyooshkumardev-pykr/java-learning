// Q06 — Sum of Numbers from 1 to N
// Take an integer N from the user and find the sum of all numbers from 1 to N.

import java.util.Scanner;

public class Q06_SumOfNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        System.out.println("Sum of all numbers from 1 to " + num);
        int sum = 0;
        for(int i = 1; i<=num; i++){

            sum = sum + i;

            System.out.print(i);
            if(i<num){
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + sum);
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 15
// Sum of all numbers from 1 to 15
// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 + 14 + 15 = 120