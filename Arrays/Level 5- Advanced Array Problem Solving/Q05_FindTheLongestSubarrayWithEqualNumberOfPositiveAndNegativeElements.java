/* Q05 — Find the Longest Subarray with Equal Number of Positive and Negative Elements
Take an array containing positive and negative integers and find the longest contiguous subarray containing an equal number of positive 
and negative elements. */

import java.util.Scanner;

public class Q05_FindTheLongestSubarrayWithEqualNumberOfPositiveAndNegativeElements {
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

        boolean allPositive = true;
        boolean allNegative = true;
        boolean findZero = false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                allNegative = false;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                allPositive = false;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                findZero = true;
                break;
            }
        }

        if(allNegative){
            System.out.println("All elements are negative. Invalid!");
            sc.close();
            return;
        }

        if(allPositive){
            System.out.println("All elements are positive. Invalid!");
            sc.close();
            return;
        }

        if(findZero){
            System.out.println("Array comtain 0. Invalid!");
            sc.close();
            return;
        }

        int countMAX = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = arr.length-1; j > i; j--) {
                
                int countNegative = 0;
                int countPositive = 0;
                int sumCount = 0;

                for (int k = i; k <= j; k++) {
                    
                    if(arr[k] < 0){
                        countNegative++;
                    }else if(arr[k] > 0){
                        countPositive++;
                    }
                }

                if(countNegative == countPositive){ 
                    sumCount = countNegative + countPositive;

                    if(sumCount>countMAX){

                    countMAX = sumCount;
                    start = i;
                    end = j;

                    }
                }
            }
        }

        System.out.println("Longest subarray:");

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println("Length = "+countMAX);

        sc.close();
    }
}
// Output 1
// Enter the Array Size = 6
// Enter elements:
// -1 -3 -4 2 4 -2
// Longest subarray:
// -3 -4 2 4 
// Length = 4

// Output 2
// Enter the Array Size = 3
// Enter elements:
// 1 0 -2
// Array comtains 0. Invalid!

// Output 3
// Enter the Array Size = 3
// Enter elements:
// 1 2 3
// All elements are positive. Invalid!

// Output 4
// Enter the Array Size = 4
// Enter elements:
// -1 -6 -9 -8
// All elements are negative. Invalid!