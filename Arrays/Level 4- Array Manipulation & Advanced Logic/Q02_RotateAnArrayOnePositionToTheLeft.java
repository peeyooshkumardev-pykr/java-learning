// Q02 — Rotate an Array One Position to the Left
// Take an array and rotate all elements one position to the left.

import java.util.Scanner;

public class Q02_RotateAnArrayOnePositionToTheLeft {
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

        int temp = arr[0];
        for(int i = 1; i<arr.length; i++){

            arr[i-1] = arr[i];

        }
        arr[arr.length-1] = temp;

        System.out.println("Rotated Array:");

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
// Output 
// Array Size = 5
// 99 88 77 66 55  
// Rotated Array:
// 88 77 66 55 99 