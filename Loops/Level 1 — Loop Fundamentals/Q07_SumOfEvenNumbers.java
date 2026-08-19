// Q07 — Sum of Even Numbers
// Take an integer N from the user and find the sum of all even numbers from 1 to N.

import java.util.Scanner;

public class Q07_SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        int sum = 0;
        System.out.println("Sum of all even numbers from 1 to " + num);

        for(int i = 2; i<=num; i+=2){

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
// Enter the interger = 20
// sum of all even numbers from 1 to 20
// 2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 = 110