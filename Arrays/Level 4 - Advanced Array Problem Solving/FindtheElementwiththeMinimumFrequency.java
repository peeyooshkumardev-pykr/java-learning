// Find the Element with the Minimum Frequency

// Given an array, find the element that appears the fewest number of times.

// Also print the number of times that element appears.

// If multiple elements have the same minimum frequency, print the first one.

import java.util.Scanner;

public class FindtheElementwiththeMinimumFrequency {
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

        int min = Integer.MAX_VALUE;
        int minElement = 0;
        for(int i = 0; i<arr.length; i++){
            int count=0;
            for(int j = 0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count<min){
                min = count;
                minElement = arr[i];
            }
        }
        System.out.println("Element that appears the fewest number of times = "+minElement);
        System.out.println("Number of times that element appears = "+min);

        sc.close();
    }
}
// Array Elements
// 23 12 12 11 14 
// Element that appears the fewest number of times = 23
// Number of times that element appears = 1
