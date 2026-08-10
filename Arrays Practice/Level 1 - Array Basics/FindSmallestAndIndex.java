// Find Smallest and Its Index

// Take 10 integers and find:

// the smallest element
// the first index where that smallest element occurs.

import java.util.Scanner;

public class FindSmallestAndIndex {
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

        int smallest = arr[0];
        int indexSmallest = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<smallest){
                smallest = arr[i];
                indexSmallest = i;
            }
        }
        System.out.println("Index = "+indexSmallest);
        System.out.println("Smallest = "+smallest);

        sc.close();
    }
}
//OUTPUT
// Array Elements
// 33 55 67 88 90 77 64 75 47 10 
// Index = 9
// Smallest = 10
