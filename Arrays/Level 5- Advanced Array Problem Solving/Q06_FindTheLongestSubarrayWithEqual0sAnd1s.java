/* Q06 — Find the Longest Subarray with Equal 0s and 1s
Given an array containing only 0 and 1, find the longest contiguous subarray containing 
an equal number of zeros and ones. */

import java.util.Scanner;

public class Q06_FindTheLongestSubarrayWithEqual0sAnd1s {
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

        boolean not0and1 = false;

        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i]!=0 && arr[i]!=1){
                not0and1 = true;
                break;
            }
        }

        if(not0and1){
            System.out.println("Array does not contain only 0 & 1. Invalid!");
            sc.close();
            return;
        }
        
        int maxCount = 0;
        int start  = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            
            for (int j = arr.length-1; j > i; j--) {
                
                int count0s = 0;
                int count1s = 0;
                int sumCount = 0;

                for (int k = i; k <= j; k++) {
                    
                    if(arr[k] == 0){
                        count0s++;
                    }else{
                        count1s++;
                    }
                }

                if(count0s == count1s){
                    sumCount = count0s + count1s;

                    if(sumCount > maxCount){
                    maxCount = sumCount;
                    start = i;
                    end = j;
                    }
                }
            }
        }
        
        if(maxCount == 0){
            System.out.println("No Output!");
            sc.close();
            return;
        }

        System.out.println("Longest subarray:");

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println("Length = " + maxCount);

        sc.close();
    }
}
// Output 1
// Enter the Array Size = 8
// Enter elements:
// 0 0 1 0 1 1 0 1
// Longest subarray:
// 0 0 1 0 1 1 0 1 
// Length = 8

// Output 2
// Enter the Array Size = 2
// Enter elements:
// 1 1
// No Output!