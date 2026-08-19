// Q11 — Print Numbers in a Given Range

// Take two integers from the user and print all numbers between them, 
// including both endpoints.

import java.util.Scanner;

public class Q11_PrintNumbersInAGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st integer = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd integer = ");
        int num2 = sc.nextInt();

        if(num1>num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for(int i = num1; i<=num2; i++){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
//OUTPUT
// Enter the 1st integer = 10
// Enter the 2nd integer = 25
// 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 

// Enter the 1st integer = 5
// Enter the 2nd integer = -5
// -5 -4 -3 -2 -1 0 1 2 3 4 5 