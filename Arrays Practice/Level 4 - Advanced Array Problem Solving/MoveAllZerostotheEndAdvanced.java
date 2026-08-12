// Move All Zeros to the End

// Given an array, move all 0s to the end while keeping the order of the 
// non-zero elements the same.

import java.util.Scanner;

public class MoveAllZerostotheEndAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size = ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int position = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[position] = arr[i];
                position++;
            }
        }
        for(int i = position; i<arr.length; i++){
            arr[i] = 0;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
//OUTPUT
// Enter Size = 8
// 12
// 0
// 0
// 12
// 14
// 15
// 0
// 0
// Array Elements
// 12 0 0 12 14 15 0 0 
// 12 12 14 15 0 0 0 0