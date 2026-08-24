// Q14 — Copy One Array into Another
// Take an array from the user and copy all its elements into another array. Print both arrays.

import java.util.Scanner;

public class Q14_CopyOneArrayIntoAnother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N = ");
        int N = sc.nextInt();

        int arr1[] = new int[N];

        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        int arr2[] = new int[N];
        
        for(int i = 0; i<arr2.length; i++){
            arr2[i] = arr1[i]; 
        }

        System.out.println("Original Array");
        for(int i = 0; i<arr1.length; i++){
             System.out.print(arr1[i]+" ");
        }
        System.out.println();

        System.out.println("Copied Array");
        for(int i = 0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }

        sc.close();
    }
}
// Output
// Enter N = 5
// 44 66 12 88 65
// Original Array
// 44 66 12 88 65 
// Copied Array
// 44 66 12 88 65 