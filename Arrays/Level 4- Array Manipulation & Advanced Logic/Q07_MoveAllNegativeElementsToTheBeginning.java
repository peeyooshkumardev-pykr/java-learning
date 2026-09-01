// Q07 — Move All Negative Elements to the Beginning
// Take an array and move all negative elements to the beginning of the array.

import java.util.Scanner;

public class Q07_MoveAllNegativeElementsToTheBeginning {
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
            if(arr[i]<0){
                int temp = arr[i];
                arr[i] = arr[position];
                arr[position] = temp;
                position++;
            }
        }

        System.out.println("Output Array:");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
// Output 
// Array Size = 6
// Enter elements
// 1 -2 -12 45 -55 32
// Output Array:
// -2 -12 -55 45 1 32 

