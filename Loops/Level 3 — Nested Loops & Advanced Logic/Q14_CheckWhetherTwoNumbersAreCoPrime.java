// Q14 — Check Whether Two Numbers are Co-Prime
// Take two integers from the user and check whether they are co-prime.

import java.util.Scanner;

public class Q14_CheckWhetherTwoNumbersAreCoPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st integer = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd integer = ");
        int num2 = sc.nextInt();

        boolean isCoPrime = true;

        for(int i = 2; i<=num1; i++){
            if(num1 % i == 0){
                if(num2 % i == 0){
                    isCoPrime = false;
                    break;
                }
            }
        }
        if(isCoPrime){
            System.out.println("Two numbers are Co-Prime");
        }
        else{
            System.out.println("Two numbers are not Co-Prime");
        }
        sc.close();
    }
}
//OUTPUT
// Enter the 1st integer = 8
// Enter the 2nd integer = 15
// Two numbers are Co-Prime

// Enter the 1st integer = 8
// Enter the 2nd integer = 12
// Two numbers are not Co=Prime