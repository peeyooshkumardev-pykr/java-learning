// Q08 — Merge Two Arrays
// Take two arrays from the user and create a third array containing all elements of both arrays.

import java.util.Scanner;

public class Q08_MergeTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Array Size = ");
        int size1 = sc.nextInt();

        System.out.print("Enter 1st Array = ");
        int arr1[] = new int[size1];
        if(size1<=0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter 2nd Array Size = ");
        int size2 = sc.nextInt();
        if(size2<=0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        System.out.print("Enter 2nd Array = ");
        int arr2[] = new int[size2];

        for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        int arr3[] = new int[arr1.length + arr2.length];

        for(int i = 0; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }

        for(int i = arr1.length; i<arr3.length; i++){
            arr3[i] = arr2[i - arr1.length];
        }

        System.out.println("Output 3rd Array:");
        for(int i = 0; i<arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }

        sc.close();
    }
}
// Output 
// Enter 1st Array Size = 4       
// Enter 1st Array = 10 30 50 70
// Enter 2nd Array Size = 2
// Enter 2nd Array = 11 12 
// Output 3rd Array:
// 10 30 50 70 11 12 