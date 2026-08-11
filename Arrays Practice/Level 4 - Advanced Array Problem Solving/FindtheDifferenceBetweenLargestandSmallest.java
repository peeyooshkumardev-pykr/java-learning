// Find the Difference Between Largest and Smallest

// Given an array of integers, find the difference between the largest and smallest element.

import java.util.Scanner;
public class FindtheDifferenceBetweenLargestandSmallest {
    public static void main(String[] args) {
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
        
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest Element = "+largest);

        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Element = "+smallest);

        int difference = largest - smallest;
        System.out.println("Difference between the largest and smallest element = "+difference);

        sc.close();
    }
}
//OUTPUT
// Array Elements
// 12 14 17 20 31 
// Largest Element = 31
// Smallest Element = 12
// Difference between the largest and smallest element = 19