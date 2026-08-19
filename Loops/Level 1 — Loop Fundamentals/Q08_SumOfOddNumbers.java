// Q08 — Sum of Odd Numbers
// Take an integer N from the user and find the sum of all odd numbers from 1 to N.

import java.util.Scanner;

public class Q08_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        int sum = 0;
        System.out.println("Sum of all odd numbers from 1 to " + num);

        for(int i = 1; i<=num; i+=2){

           System.out.print(i);
           if(i+2<=num){
            System.out.print(" + ");
           }
           sum = sum + i;
        }

        System.out.print(" = " + sum);
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 15
// Sum of all odd numbers from 1 to 15
// 1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 = 64