// Q01 — Count the Digits
// Take an integer from the user and count how many digits it contains.

import java.util.Scanner;

public class Q01_CountTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        int countDigits = 0;

        if(num==0){
                countDigits = 1;
            } 

        while(num!=0){
            num = num / 10;
            countDigits++;
        }

        System.out.println("Number of digits in integer = "+countDigits);
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 784524
// Number of digits in integer = 6

// Enter the integer = 0
// Number of digits in integer = 1