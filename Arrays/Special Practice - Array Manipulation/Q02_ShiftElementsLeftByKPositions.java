// Q02 — Shift Elements Left by K Positions
// Shift all elements K positions to the left.

// Fill the empty positions at the end with 0.

import java.util.Scanner;

public class Q02_ShiftElementsLeftByKPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array Size = ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        System.out.println("Enter Array Elements:");
        int arr[] = new int[size];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("K Position = ");
        int k = sc.nextInt();

        int position = 0;

        for (int i = 0; i < arr.length; i++) {

            if(i > k && position <= k){
                arr[position] = arr[i];
                position++;
            }
        }

        for (int i = k + 1; i < arr.length; i++) {
            arr[i] = 0;
        }

        System.out.println("Output Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
// Output 1
// Array Size = 8
// Enter Array Elements:
// 10 20 30 40 50 60 70 80
// K Position = 3
// Output Array:
// 50 60 70 80 0 0 0 0 

// Output 2
// Enter Array Elements:
// 10 20 30 40 50 60 70 80
// K Position = 0
// Output Array:
// 20 0 0 0 0 0 0 0

// Output 3
// Array Size = 4
// Enter Array Elements:
// 11 22 33 44
// K Position = 2
// Output Array:
// 44 22 33 0