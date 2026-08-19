// Q09 — Print a Multiplication Table
// Take a number from the user and print its multiplication table from 1 to 10.

import java.util.Scanner;

public class Q09_PrintAMultiplicationTable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        System.out.println("Multiplication table of "+num);

        for(int i = 1; i<=10; i++){
            int mul = num * i;
            System.out.println(num+" * "+i+" = "+mul);
        }
        sc.close();
    }
}
//OUTPUT
// Enter the number = 2
// Multiplication table of 2
// 2 * 1 = 2
// 2 * 2 = 4
// 2 * 3 = 6
// 2 * 4 = 8
// 2 * 5 = 10
// 2 * 6 = 12
// 2 * 7 = 14
// 2 * 8 = 16
// 2 * 9 = 18
// 2 * 10 = 20