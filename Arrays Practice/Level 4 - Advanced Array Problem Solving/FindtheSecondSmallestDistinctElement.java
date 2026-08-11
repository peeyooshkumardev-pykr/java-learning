// Find the Second Smallest Distinct Element
// Find the second smallest value, ignoring duplicates.

import java.util.Scanner;
public class FindtheSecondSmallestDistinctElement {
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

        int min = arr[0];
        int min2nd = Integer.MAX_VALUE;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<min){
                min2nd = min;
                min = arr[i];
            }else
                if(min<arr[i] && arr[i]<min2nd){
                    min2nd = arr[i];
                }
        }
        System.out.println("2nd Smallest Distinct Number = "+min2nd);
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 12 32 44 11 43 
// 2nd Smallest Distinct Number = 12
