// Find the Longest Strictly Decreasing Subarray

// Given an array, find the length of the longest consecutive subarray where every element is smaller 
// than the element immediately before it.

import java.util.Scanner;

public class FindtheLongestStrictlyDecreasingSubarray{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size = ");
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

        int currentsubarray = 1;
        int longestsubarray = 1;
        int longestStart = 0;

        for(int i = 1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
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

        System.out.println("Longest Strictly Decreasing Subarray");
        for(int i = longestStart; i<longestStart+longestsubarray; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Length of the longest consecutive subarray = "+longestsubarray);

        sc.close();
    }
}
//OUTPUT
// Array Elements
// 23 23 21 12 16 20 35 44 34 56 
// Longest Strictly Decreasing Subarray
// 23 21 12 
// Length of the longest consecutive subarray = 3