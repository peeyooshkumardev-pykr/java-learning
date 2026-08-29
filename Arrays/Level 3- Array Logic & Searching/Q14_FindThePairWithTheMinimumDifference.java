// Q14 — Find the Pair with the Minimum Difference
// Take an array and find two elements whose absolute difference is the smallest.

import java.util.Scanner;

public class Q14_FindThePairWithTheMinimumDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Array size = ");
        int size = sc.nextInt();

        if(size<=1){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int  arr[] = new int[size];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int minDifference = Integer.MAX_VALUE;
        int leftSide = 0;
        int rightSide = 0;

        for(int i = 0; i<arr.length; i++){
            for(int j = i + 1; j<arr.length; j++){
                int difference = Math.abs(arr[i] - arr[j]);

                if(difference<minDifference){
                    minDifference = difference;
                    leftSide = arr[i];
                    rightSide = arr[j];
                }
            }    
        }
        System.out.println("Pair with minimum difference:\n"+leftSide+" "+rightSide);
        System.out.println();

        System.out.println("Minimum difference = "+minDifference);
        sc.close();
    }
}
// Output
// Enter Array size = 6                
// 10 40 25 80 24 60
// Pair with minimum difference:
// 25 24

// Minimum difference = 1