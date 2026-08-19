// Q03 — Find the Product of Digits
// Take an integer from the user and find the product of all its digits.

import java.util.Scanner;

public class Q03_FindTheProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        int mulDigits = 1;

        while(num!=0){
            int mul = num % 10;
            mulDigits = mulDigits * mul;
            num = num / 10;
        }
        System.out.println("Product of digits = "+mulDigits);
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 4512
// Product of digits = 40