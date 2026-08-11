// Find the Second Largest Element

// Given an array of integers, find the second largest distinct element.

import java.util.Scanner;

public class FindtheSecondLargestElement {
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

        int max = arr[0];
        int max2nd = Integer.MIN_VALUE;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max){
                max2nd = max;
                max = arr[i];
            }else
                if(max>arr[i] && arr[i]>max2nd){
                    max2nd = arr[i];
                }
        }
        System.out.println("2nd Largest Distinct Number = "+max2nd);
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 34 12 15 45 65 
// 2nd Largest Distinct Number = 45
