// Q10 — Find the First and Last Digit
// Take an integer from the user and find its first digit and last digit.

import java.util.Scanner;

public class Q10_FindTheFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        int digitLast = num % 10;
        System.out.println("Last Digit = "+digitLast);

        int digitFirst = 0;
        while(num!=0){
            digitFirst = num % 10;
            num = num / 10;
        }
        System.out.println("First Digit = "+digitFirst);

        sc.close();
    }
}
// OUTPUT
// Enter the integer = 2394
// Last Digit = 4
// First Digit = 2

// Enter the integer = -3331
// Last Digit = -1
// First Digit = -3