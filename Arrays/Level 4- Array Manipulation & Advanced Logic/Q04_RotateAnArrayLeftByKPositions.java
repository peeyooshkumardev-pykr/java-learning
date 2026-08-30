// Q04 — Rotate an Array Left by K Positions
// Take an array and an integer K. Rotate the array to the left by K positions.

import java.util.Scanner;

public class Q04_RotateAnArrayLeftByKPositions {
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

        System.out.println("Enter elements");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K = ");
        int k = sc.nextInt();

        k = k % arr.length;
        
        while(k!=0){
            int temp = arr[0];
            for(int i = 1; i<arr.length; i++){
                arr[i-1] = arr[i];
            }
            arr[arr.length-1] = temp;
            k--;
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
// Output 
// Array Size = 6
// Enter elements
// 10 20 30 40 50 60
// Enter K = 3
// 40 50 60 10 20 30 