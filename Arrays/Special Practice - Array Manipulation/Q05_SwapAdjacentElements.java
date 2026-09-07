// Q05 — Swap Adjacent Elements
// Swap every pair of adjacent elements.

import java.util.Scanner;

public class Q05_SwapAdjacentElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array Size = ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        System.out.println("Enter Array Elements:");
        int arr[] = new int[size];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length-1; i = i + 2) {
            
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        System.out.println();
        System.out.println("Output Array:");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
        sc.close();
    }
}
// Output 1
// Array Size = 8
// Enter Array Elements:
// 1 2 3 4 5 6 7 8

// Output Array:
// 2 1 4 3 6 5 8 7

// Output 2
// Array Size = 5
// Enter Array Elements:
// 1 2 3 4 5

// Output Array:
// 2 1 4 3 5