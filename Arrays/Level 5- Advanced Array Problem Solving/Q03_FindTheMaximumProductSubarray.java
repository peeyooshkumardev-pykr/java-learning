// Q03 — Find the Maximum Product Subarray
// Take an array and find the contiguous subarray having the maximum product.

import java.util.Scanner;

public class Q03_FindTheMaximumProductSubarray {
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

        long mulMax = Long.MIN_VALUE;
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < arr.length; i++) {
            long mul = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                
                mul = mul * arr[j];
               
                if(mul > mulMax){
                    mulMax = mul;
                    start = i;
                    end = j;
                }
            }
        }

        System.out.println();
          
        System.out.println("Maximum Product subarray:");

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println("Maximum Product = " + mulMax);

        sc.close();
    }
}
// Output
// Enter the Array Size = 6
// Enter elements:
// -10 20 -30 40 50 -60

// Maximum Product subarray:
// 20 -30 40 50 -60 
// Maximum Product = 72000000