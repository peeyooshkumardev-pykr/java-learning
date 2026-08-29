// Q13 — Find the Pair with the Maximum Sum
// Take an array and find the pair of elements having the maximum possible sum.

import java.util.Scanner;

public class Q13_FindThePairWithTheMaximumSum {
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

        int maxSum = Integer.MIN_VALUE;
        int leftSide = 0;
        int rightSide = 0;

        for(int i = 0; i<arr.length; i++){
            for(int j = i + 1; j<arr.length; j++){
                int sum = arr[i] + arr[j];

                if(sum>maxSum){
                    maxSum = sum;
                    leftSide = arr[i];
                    rightSide = arr[j];
                }
            }    
        }
        System.out.println("Pair with maximum sum:\n"+leftSide+" "+rightSide);
        System.out.println();
        System.out.println("Maximum sum = "+maxSum);
        sc.close();
    }
}
// Output
// Enter Array size = 6
// 10 40 25 80 60 30
// Pair with maximum sum:
// 80 60

// Maximum sum = 140

// Enter Array size = 4
// -10 -20 -5 -30
// Pair with maximum sum:
// -10 -5

// Maximum sum = -15