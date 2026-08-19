// Q13 — Find the LCM of Two Numbers
// Take two integers from the user and find their Least Common Multiple (LCM).

import java.util.Scanner;

public class Q13_FindTheLCMofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st integer = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd integer = ");
        int num2 = sc.nextInt();

        int mul1 = 1;
        int mul2 = 1;

        for(int i = 1; i<=num1; i++){
            mul1 = num1 * i;

            for(int j = 1; j<=num2; j++){
                mul2 = num2 * j;

                 if(mul1==mul2){
                System.out.println("Least Common Multiple (LCM) = "+mul1);
                break;
            }
            }
        }
        sc.close();
    }
}
//OUTPUT
// Enter the 1st integer = 4
// Enter the 2nd integer = 6
// Least Common Multiple (LCM) = 12