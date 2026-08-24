// Q18 — Swap the First and Last Elements
// Take an array from the user and swap its first and last elements.

import java.util.Scanner;

public class Q18_SwaptheFirstAndLastElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size = ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int temp1 = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp1;

        System.out.println("Resulting array after swapping the first and last elements");

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
// Output
// Enter size = 5
// 33 45 11 32 90
// Resulting array after swapping the first and last elements
// 90 45 11 32 33 