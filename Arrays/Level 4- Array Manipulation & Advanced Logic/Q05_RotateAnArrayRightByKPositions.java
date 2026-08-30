// Q05 — Rotate an Array Right by K Positions
// Take an array and an integer K. Rotate the array to the right by K positions.

import java.util.Scanner;

public class Q05_RotateAnArrayRightByKPositions {
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
            int temp = arr[arr.length-1];
            for(int i = arr.length-1; i>0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
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
// 12 22 32 42 52 62
// Enter K = 3
// 42 52 62 12 22 32 