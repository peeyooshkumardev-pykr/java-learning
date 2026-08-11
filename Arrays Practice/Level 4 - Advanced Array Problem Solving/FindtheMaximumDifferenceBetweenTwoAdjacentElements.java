// Find the Maximum Difference Between Two Adjacent Elements

// Given an array, find the largest absolute difference between two consecutive elements.
// Only compare elements that are next to each other.

import java.util.Scanner;

public class FindtheMaximumDifferenceBetweenTwoAdjacentElements {
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
        
        int difference;
        int largestdifference = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length-1; i++){
            difference = Math.abs(arr[i]-arr[i+1]);

            if(difference>largestdifference){
                largestdifference = difference;
            }
        }
        System.out.println("Maximum Difference Between Two Adjacent Elements = " + largestdifference);
        sc.close();
    }
}
//OUTPUT
// Enter Size = 6
// 12
// 15
// 17
// 43
// 25
// 33
// Array Elements
// 12 15 17 43 25 33 
// Maximum Difference Between Two Adjacent Elements = 26