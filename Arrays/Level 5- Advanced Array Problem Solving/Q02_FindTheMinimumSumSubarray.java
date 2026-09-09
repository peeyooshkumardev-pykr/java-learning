// Q02 — Find the Minimum Sum Subarray
// Take an array and find the contiguous subarray having the minimum sum.

import java.util.Scanner;

public class Q02_FindTheMinimumSumSubarray {
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

        int sumMin = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                
                sum = sum + arr[j];
               
                if(sum < sumMin){
                    sumMin = sum;
                    start = i;
                    end = j;
                }
            }
        }

        System.out.println();
          
        System.out.println("Minimum sum subarray:");

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println("Minimum sum = " + sumMin);

        sc.close();
    }
}
// Output 
// Enter the Array Size = 6
// 3 -4 2 -5 6 -1

// Minimum sum subarray:
// -4 2 -5 
// Minimum sum = -7