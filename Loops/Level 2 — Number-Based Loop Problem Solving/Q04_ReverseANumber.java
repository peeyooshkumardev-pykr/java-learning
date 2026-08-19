// Q04 — Reverse a Number
// Take an integer from the user and print its reverse.

import java.util.Scanner;

public class Q04_ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        int reverse = 0;

        while(num!=0){
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse of the given integer = " + reverse);

        sc.close();
    }
}
// OUTPUT
// Enter the integer = 45321
// Reverse of the given integer = 12354