// Q08 — Count Even and Odd Digits
// Take an integer from the user and count how many even digits and odd digits it contains.

import java.util.Scanner;

public class Q08_CountEvenAndOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        int countEven = 0;
        int countOdd = 0;

        while(num!=0){
             
            int digit = num % 10;

            if(digit%2==0){
                countEven++;
            }else{
                countOdd++;
            }
            num = num / 10;
        }
        System.out.println("Number of evens in integer = "+countEven);
        System.out.println("Number of odds in integer = "+countOdd);

        sc.close();
    }
}
// OUTPUT
// Enter the integer = 5432198
// Number of evens in integer = 3
// Number of odds in integer = 4