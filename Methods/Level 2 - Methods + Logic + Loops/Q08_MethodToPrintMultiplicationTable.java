// Q08 — Method to Print Multiplication Table
// Create a method named printTable() that accepts an integer and prints 
// its multiplication table from 1 to 10.

import java.util.Scanner;

public class Q08_MethodToPrintMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        System.out.println("Table of "+num);
        printTable(num);

        sc.close();
    }

    static void printTable(int num){
        int mul = 0;
        for(int i = 1; i<=10; i++){
            mul = i * num;
            System.out.println(num+" * "+i+" = "+mul);
        }
    }
}
// OUTPUT
// Enter the integer = 5
// Table of 5
// 5 * 1 = 5
// 5 * 2 = 10
// 5 * 3 = 15
// 5 * 4 = 20
// 5 * 5 = 25
// 5 * 6 = 30
// 5 * 7 = 35
// 5 * 8 = 40
// 5 * 9 = 45
// 5 * 10 = 50