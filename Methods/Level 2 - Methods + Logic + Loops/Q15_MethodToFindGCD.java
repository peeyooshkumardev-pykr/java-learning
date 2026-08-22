/*Q15 — Method to Find GCD
Create a method named findGCD() that accepts two integers and returns their 
Greatest Common Divisor.*/

import java.util.Scanner;

public class Q15_MethodToFindGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st integer = ");
        int num1= sc.nextInt();

        System.out.print("Enter the 2nd integer = ");
        int num2 = sc.nextInt();

        System.out.print("GCD = "+ findGCD(num1, num2));
        sc.close();
    }

    static int findGCD(int num1, int num2){
        int gcd = 0;
        for(int i = 1; i<=num1; i++){

            if(num1 % i == 0){
                for(int j = 1; j<=num2; j++){
                    if(num2 % j == 0){
                    if(i==j){
                        gcd = i;
                    }
                }
                }
            }
        }
        return gcd;
    }
}
// OUTPUT
// Enter the 1st integer = 24
// Enter the 2nd integer = 36
// GCD = 12