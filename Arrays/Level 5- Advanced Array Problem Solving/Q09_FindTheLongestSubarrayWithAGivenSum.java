/* Q09 — Find the Longest Subarray with a Given Sum
Take an array and a target sum. Find the longest contiguous subarray 
whose sum equals the target. */

import java.util.Scanner;

public class Q09_FindTheLongestSubarrayWithAGivenSum {
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

        int maxlength = 0;
        int start = 0;
        int end = -1;

        for (int i = 0; i < arr.length; i++) {
            
            int sum = arr[i];
            int length = 0;

            if(sum == target){
                length = 1;
            }

            if(length>maxlength){
                maxlength = length;
                start = i;
                end = i;
            }

            for (int j = i + 1; j < arr.length; j++) {
                
                sum = sum + arr[j];

                if(sum == target){
                    length = j - i + 1;

                    if(length > maxlength){
                        maxlength = length;
                        start = i;
                        end = j;
                    }
                }
            }
        }

        System.out.println();

        System.out.println("Longest subarray:");

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println("Length = " + maxlength);

        sc.close();

    }
}
// Output 
// Enter the Array Size = 8
// Enter elements:
// 1 2 1 1 1 3 2 1
// Target Sum = 5

// Longest subarray:
// 1 2 1 1 
// Length = 4