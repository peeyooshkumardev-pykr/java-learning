// Q01 — Reverse an Array Without Using Another Array
// Take an array from the user and reverse the array in the same array without creating another array.

import java.util.Scanner;

public class Q01_ReverseAnArrayWithoutUsingAnotherArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array Size = ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int arr[] = new int[size];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        System.out.println();
        System.out.println("Reverse Array:");

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
// Output 
// Array Size = 5
// 12 22 32 42 52

// Reverse Array:
// 52 42 32 22 12 