/* Q01 — Find the Equilibrium Index
Given an array, find an index where the sum of all elements to its left is equal to the sum of 
all elements to its right. */

import java.util.Scanner;

public class Q01_FindTheEquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array Size = ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int arr[] = new int[size];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Output: ");

        boolean noEquilibriumIndex = true;

        for(int i = 1; i<arr.length-1; i++){
            
            boolean foundEquilibriumIndex = false;

            int sumLeft = 0;
            int sumRight = 0;

            for(int j = 0; j<arr.length; j++){

                if(j < i){
                    sumLeft = sumLeft + arr[j];
                }
                if(j > i){
                    sumRight = sumRight + arr[j];
                }

            }
            if(sumLeft == sumRight){
                foundEquilibriumIndex = true;
            }

            if(foundEquilibriumIndex){
                System.out.print(i+" ");
                noEquilibriumIndex = false;
            }
        }

        if(noEquilibriumIndex){
            System.out.println("No Output!");
        }
        
        sc.close();
    }
}
// Output 
// Array Size = 7
// -7 1 5 2 -4 3 0
// Output: 3 