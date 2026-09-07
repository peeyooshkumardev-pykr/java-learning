// Q03 — Swap Minimum and Maximum Elements
// Find the minimum and maximum elements and swap their positions.

import java.util.Scanner;

public class Q03_SwapMinimumAndMaximumElements {
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

        int maxElement = Integer.MIN_VALUE;
        int maxIndex = 0;

        int minElement = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxElement){
                maxElement = arr[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minElement){
                minElement = arr[i];
                minIndex = i;
            }
        }

        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp; 

        System.out.println("Output Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
// Output 
// Array Size = 6
// Enter Array Elements:
// 8 3 10 5 2 7
// Output Array:
// 8 3 2 5 10 7 