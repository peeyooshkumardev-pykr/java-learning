// Q11 — Method to Reverse a Number
// Create a method named reverseNumber() that accepts an integer and returns its reverse.

import java.util.Scanner;

public class Q11_MethodToReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        System.out.println("Reverse of "+num+" = "+ reverseNumber(num));

        sc.close();
    }

    static int reverseNumber(int num){
        int reverse = 0;
        while(num!=0){
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return reverse;
    }
}
// // OUTPUT
// Enter the integer = 12022002
// Reverse of 12022002 = 20022021
