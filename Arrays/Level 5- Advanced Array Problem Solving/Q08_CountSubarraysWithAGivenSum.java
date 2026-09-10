// Q08 — Count Subarrays with a Given Sum
// Take an array and a target sum. Count how many contiguous subarrays 
// have a sum equal to the target.

import java.util.Scanner;

public class Q08_CountSubarraysWithAGivenSum {
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

        System.out.print("Target Sum = ");
        int target = sc.nextInt();

        int countSumEqualToTarget = 0;

        for (int i = 0; i < arr.length; i++) {
            
            int sum = arr[i];

            if(sum == target){
                countSumEqualToTarget++;
            }

            for (int j = i + 1; j < arr.length; j++) {

                sum = sum + arr[j];

                if(sum == target){
                    countSumEqualToTarget++;
                }
            }
        }

        System.out.println();

        System.out.println("Number of subarrays = " + countSumEqualToTarget);

        sc.close();
    }
}
// Output 
// Enter the Array Size = 5
// Enter elements:
// 1 2 3 2 1
// Target Sum = 5

// Number of subarrays = 2