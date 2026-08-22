/*Q18 — Method to Check Perfect Number
Create a method named isPerfect() that accepts an integer and returns true if 
the number is a perfect number, otherwise returns false.*/

import java.util.Scanner;

public class Q18_MethodToCheckPerfectNumber {
    
    static boolean isPerfect(int num){
        int sum = 0;
        for(int i = 1; i<num; i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        if(isPerfect(num)){
            System.out.println(num+" is Perfect Number");
        }else{
            System.out.println(num+" is not a perfect Number");
        }

        sc.close();
    }
}
// OUTPUT
// Enter the integer = 6
// 6 is Perfect Number

// Enter the integer = 20
// 20 is not a perfect Number