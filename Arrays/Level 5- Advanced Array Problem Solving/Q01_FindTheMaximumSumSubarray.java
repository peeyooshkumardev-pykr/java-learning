// Q01 — Find the Maximum Sum Subarray
// Take an array and find the contiguous subarray having the maximum sum.

import java.util.Scanner;

public class Q01_FindTheMaximumSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size = ");
        int size = sc.nextInt();

        if(size <= 0){
            System.out.println("Invalid Array Size!");
            sc.close();
            return; 
        }

        System.out.println("Enter elements:");

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sumMax = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                
                sum = sum + arr[j];
               
                if(sum > sumMax){
                    sumMax = sum;
                    start = i;
                    end = j;
                }
            }
        }
          
        System.out.println();

        System.out.println("Maximum sum subarray:");

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println("Maximum sum = " + sumMax);

        sc.close();
    }
}
// Output 
// Enter the Array Size = 8
// -2 1 -3 4 -1 2 1 -5

// Maximum sum subarray:
// 4 -1 2 1 
// Maximum sum = 6