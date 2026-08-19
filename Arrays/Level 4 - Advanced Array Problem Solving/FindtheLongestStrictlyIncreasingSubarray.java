// Find the Longest Strictly Increasing Subarray

// Given an array, find the longest consecutive subarray where every element is 
// greater than the element immediately before it.

import java.util.Scanner;
public class FindtheLongestStrictlyIncreasingSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size = ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Subarray");
        int currentsubarray = 1;
        int longestsubarray = 1;
        int longestStart = 0;
        for(int i = 1 ;i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                currentsubarray++;
            }
            else{
                currentsubarray = 1;
            }
            if(currentsubarray>longestsubarray){
                longestsubarray = currentsubarray;
                longestStart = i - currentsubarray + 1;
            }
        }

        System.out.println("Longest Increasing Subarray:");

         for(int i = longestStart; i < longestStart + longestsubarray; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Length = " + longestsubarray);

        sc.close();
    }
}
//OURPUT
// Enter size = 7
// 12
// 15
// 17
// 11
// 12
// 13
// 33
// Array Elements
// 12 15 17 11 12 13 33 
// Subarray
// Longest Increasing Subarray:
// 11 12 13 33 
// Length = 4