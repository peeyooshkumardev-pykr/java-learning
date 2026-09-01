// Q06 — Move All Zeros to the End
// Take an array and move all zero elements to the end while maintaining the order 
// of non-zero elements.

import java.util.Scanner;

public class Q06_MoveAllZerosToTheEnd {
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

        System.out.println("Output Array:");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
// Output 
// Array Size = 7
// Enter elements
// 15 43 14 0 0 0 11 
// Output Array:
// 15 43 14 11 0 0 0 