/* Q10 — Find the Smallest Subarray with Sum Greater Than a Given Number
Take an array of positive integers and a target number. Find the smallest 
contiguous subarray whose sum is greater than the target. */

import java.util.Scanner;

public class Q10_FindTheSmallestSubarrayWithSumGreaterThanAGivenNumber {
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

         boolean isNegativeOrZero = false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= 0){
                isNegativeOrZero = true;
                break;
            }
        }

        if(isNegativeOrZero){
            System.out.println("Invalid Input!");
            sc.close();
            return; 
        }

        System.out.print("Target Number = ");
        int target = sc.nextInt();

        int smallestLength = Integer.MAX_VALUE;
        int start = 0;
        int end = -1;

        for (int i = 0; i < arr.length; i++) {
            
            int sum = arr[i];
            int length = 0;

            if(sum > target){
                length = 1;
                
                if(length<smallestLength){
                    smallestLength = length;
                    start = i;
                    end = i;
                }
            }

            for (int j = i + 1; j < arr.length; j++) {
                
                sum = sum + arr[j];

                if(sum > target){
                    length = j - i + 1;

                    if(length<smallestLength){
                    smallestLength = length;
                    start = i;
                    end = j;
                    }
                }
            }
        }
        System.out.println();

        System.out.println("Smallest subarray:");

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println("Length = " + smallestLength);

        sc.close();

    }
}
// Output 
// Enter the Array Size = 6
// Enter elements:
// 2 3 1 2 4 3
// Target Number = 7

// Smallest subarray:
// 2 4 3
// Length = 3