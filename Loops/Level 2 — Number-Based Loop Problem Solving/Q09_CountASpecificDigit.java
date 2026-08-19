// Q09 — Count a Specific Digit
// Take an integer and a digit from the user. Count how many times that digit 
// appears in the number.

import java.util.Scanner;

public class Q09_CountASpecificDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        System.out.print("Enter the digit = ");
        int digit = sc.nextInt();

        int count = 0;
        while(num!=0){
             
            int find = num % 10;
            if(find==digit){
                count++;
            }
            num = num / 10;
        }
        if(count==0){
            System.out.println("Not Found!");
        }
        System.out.println("Number of times "+digit+" appear = "+count);
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 1656112
// Enter the digit = 1
// Number of times 1 appear = 3

// Enter the integer = 112233244
// Enter the digit = 5
// Not Found!
// Number of times 5 appear = 0