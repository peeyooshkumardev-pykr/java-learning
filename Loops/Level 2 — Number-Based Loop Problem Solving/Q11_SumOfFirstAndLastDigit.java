// Q11 — Sum of First and Last Digit
// Take an integer from the user and find the sum of its first and last digit.

import java.util.Scanner;

public class Q11_SumOfFirstAndLastDigit {
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

        int  sum = digitFirst + digitLast;
        System.out.println("Sum of "+digitFirst+" and "+digitLast+" = "+ sum);
        sc.close();
    }
}
//OUTPUT
// Enter the integer = 36712
// Last Digit = 2
// First Digit = 3
// Sum of 3 and 2 = 5