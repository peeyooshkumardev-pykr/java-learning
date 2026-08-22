// Q06 — Method to Calculate Factorial
// Create a method named factorial() that accepts an integer and returns its factorial.

import java.util.Scanner;

public class Q06_MethodToCalculateFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number = ");
        int num = sc.nextInt();

        if(num<0){
            System.out.println("Wrong Input");
            sc.close();
            return;
        }

        System.out.println("Factorial of "+num+" is "+factorial(num));

        sc.close();
    }

    static int factorial(int num){
        int mul = 1;

        for(int i = 1; i<=num; i++){
            mul = mul * i;
        }
        return mul;
    }
}
// OUTPUT
// Enter number = 7
// Factorial of 7 is 5040