// Q13 — Print Factors of a Number
// Take an integer from the user and print all of its factors.

import java.util.Scanner;

public class Q13_PrintFactorsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        System.out.println("Factors of "+num);
        for(int i = 1; i<=num; i++){
            if(num % i == 0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
//OUTPUT
// Enter the integer = 10
// Factors of 10
// 1 2 5 10 