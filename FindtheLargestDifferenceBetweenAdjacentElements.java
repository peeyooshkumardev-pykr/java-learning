// Find the Largest Difference Between Adjacent Elements

// Take 10 integers and find the largest absolute difference between two neighboring elements.

import java.util.Scanner;

public class FindtheLargestDifferenceBetweenAdjacentElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        int temp = 0;
        int largest = 0;
        for(int i = 0; i<arr.length-1; i++){
            temp = Math.abs(arr[i] - arr[i+1]);
            if(temp>largest){
                largest = temp;
            }
        }
        System.out.println("Largest absolute difference = " + largest);
        sc.close();
    }
}
// //OUTPUT
// Array Elements
// 45 67 32 12 76 54 98 23 45 61 
// Largest absolute difference = 75
