// Q03 — Print All Factors for Numbers in a Range
// Take two integers from the user and print the factors of every number in that range.

import java.util.Scanner;

public class Q03_PrintAllFactorsForNumbersInARange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st integer = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd integer = ");
        int num2 = sc.nextInt();

        System.out.println("Factors of every number between "+num1+" & "+num2);

        for(int i = num1; i<=num2; i++){
            System.out.print(i+" = ");
            for(int j = 1; j<=i; j++){
                
                if(i % j == 0 && j<i+1){
                    System.out.print(j);

                    if(j<i){
                        System.out.print(",");
                    }
                } 
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the 1st integer = 2 
// Enter the 2nd integer = 6
// Factors of every number between 2 & 6
// 2 = 1,2
// 3 = 1,3
// 4 = 1,2,4
// 5 = 1,5
// 6 = 1,2,3,6