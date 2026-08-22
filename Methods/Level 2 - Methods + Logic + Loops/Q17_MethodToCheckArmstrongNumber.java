/*Q17 — Method to Check Armstrong Number
Create a method named isArmstrong() that accepts an integer and returns true if the 
number is an Armstrong number, otherwise returns false.*/

import java.util.Scanner;

public class Q17_MethodToCheckArmstrongNumber {
    
    static boolean isArmstrong(int num){
        int num1 = num;
        int num2 = num;
        int count = 0;

        while(num1!=0){
            num1 = num1/10;
            count++;
        }
        int sum = 0;
        while (num2!=0) {
            int mul = 1;
            int count1 = count;
            int digit = num2%10;
            
            while(count1!=0){
                mul = mul * digit;
                count1--;
            } 
            sum = sum + mul;
            num2 = num2/10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num= sc.nextInt();

        if(isArmstrong(num)){
            System.out.println("ArmStrong = "+isArmstrong(num));
        }else{
            System.out.println("ArmStrong = "+isArmstrong(num));
        }

        sc.close();
    }
}
// OUTPUT
// Enter the integer = 153
// ArmStrong = true

// Enter the integer = 123
// ArmStrong = false