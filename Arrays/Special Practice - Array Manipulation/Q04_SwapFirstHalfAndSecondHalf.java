// Q04 — Swap First Half and Second Half
// Swap the first half of an array with the second half.

import java.util.Scanner;

public class Q04_SwapFirstHalfAndSecondHalf {
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

        int position = arr.length/2;

        for (int i = 0; i < arr.length/2; i++) {

            int temp = arr[i];
            arr[i] = arr[position];
            arr[position] = temp;

            position++;
        }

        System.out.println();
        System.out.println("Output Array:");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
// Output 
// Array Size = 6
// Enter Array Elements:
// 11 22 33 44 55 66

// Output Array:
// 44 55 66 11 22 33 