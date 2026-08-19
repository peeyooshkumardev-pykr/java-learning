// Q15 — Check Armstrong Number
// Take an integer from the user and check whether it is an Armstrong number.

import java.util.Scanner;

public class Q15_CheckArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();
        int num1 = num;
        int num2 = num;

        int count = 0;
        while(num1!=0){
            num1 = num1 / 10;
            count++;
        }
        int countdigit = count;

        int sum = 0; 
        while(num2!=0){
            int mul = 1;
            count = countdigit;
            int digit = num2 % 10;
            while(count!=0){
                mul = mul * digit;
                count--;
            }
            sum = sum + mul;
            num2 = num2 / 10;
        }

        if(sum==num){
            System.out.println(num+" is the Armstrong Number");
        }else{
            System.out.println(num+" is not Armstrong Number");
        }

        sc.close();
    }
}
//OUTPUT
// Enter the integer = 370
// 370 is the Armstrong Number

// Enter the integer = 123
// 123 is not Armstrong Number