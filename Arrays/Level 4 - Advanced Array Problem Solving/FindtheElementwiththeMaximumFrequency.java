// Find the Element with the Maximum Frequency

// Given an array, find the element that appears the most number of times.

// Also print the number of times that element appears.

// If multiple elements have the same maximum frequency, print the first element 
// that reaches that frequency.

import java.util.Scanner;

public class FindtheElementwiththeMaximumFrequency {
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

        int max = 0;
        int maxElement = 0;
        for(int i = 0; i<arr.length; i++){
            int count=0;
            for(int j = 0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>max){
                max = count;
                maxElement = arr[i];
            }
        }
        System.out.println("Element that appears the most number of times = "+maxElement);
        System.out.println("Number of times that element appears = "+max);

        sc.close();
    }
}
//OUTPUT
// Array Elements
// 12 12 13 13 15 15 12 13 15 11 
// Element that appears the most number of times = 12
// Number of times that element appears = 3