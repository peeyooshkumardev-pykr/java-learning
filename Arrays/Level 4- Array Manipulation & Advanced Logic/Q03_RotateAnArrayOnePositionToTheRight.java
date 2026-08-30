// Q03 — Rotate an Array One Position to the Right
// Take an array and rotate all elements one position to the right.

import java.util.Scanner;

public class Q03_RotateAnArrayOnePositionToTheRight {
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

        int temp = arr[arr.length-1];

        for(int i = arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = temp;

        System.out.println("Rotated Array:");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
// Output 
// Array Size = 5
// 10 20 30 40 50
// Resulted Array:
// 50 10 20 30 40 