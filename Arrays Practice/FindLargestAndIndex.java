// Find Largest and Its Index

// Take 10 integers and find:

// the largest element
// the first index where that largest element occurs.

import java.util.Scanner;

public class FindLargestAndIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int largest = arr[0];
        int indexLargest = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
                indexLargest = i;
            }
        }
        System.out.println("Index = "+indexLargest);
        System.out.println("Largest = "+largest);

        sc.close();
    }
}
// OUTPUT
// Array Elements
// 45 32 12 14 17 48 55 90 78 65 
// Index = 7
// Largest = 90
