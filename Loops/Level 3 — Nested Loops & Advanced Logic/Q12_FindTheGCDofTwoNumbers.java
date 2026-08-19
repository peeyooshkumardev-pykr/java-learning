// Q12 — Find the GCD Greatest Common Divisor (GCD)
// Take two integers from the user and find their Greatest Common Divisor (GCD).

import java.util.Scanner;

public class Q12_FindTheGCDofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st integer = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd integer = ");
        int num2 = sc.nextInt();

        int maxDivisor = Integer.MIN_VALUE;
        for(int i = 1; i<=num1; i++){
            int commanDivisor = 0;
           if(num1%i==0){
              for(int j = 1; j<=num2; j++){
                if(num2%j==0){
                    if(i==j){
                        commanDivisor = i;
                    }
                }
              }
           }
           if(commanDivisor>maxDivisor){
            maxDivisor = commanDivisor;
           }
        }
        System.out.println("Greatest Common Divisor (GCD) of the two numbers = "+maxDivisor);

        sc.close();
    }
}
//OUTPUT
// Enter the 1st integer = 24
// Enter the 2nd integer = 36
// Greatest Common Divisor (GCD) of the two numbers = 12