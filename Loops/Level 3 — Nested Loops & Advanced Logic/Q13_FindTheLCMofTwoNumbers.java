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

        int start;

        if(num1 > num2){
            start = num1;
        }else{
            start = num2;
        }

        for(int i = start; ; i++){
            if(i % num1 == 0 && i % num2 == 0){
                System.out.println("Least Common Multiple (LCM) = " + i);
                break;
            }
        }

        sc.close();
    }
}

// OUTPUT
// Enter the 1st integer = 4
// Enter the 2nd integer = 6
// Least Common Multiple (LCM) = 12