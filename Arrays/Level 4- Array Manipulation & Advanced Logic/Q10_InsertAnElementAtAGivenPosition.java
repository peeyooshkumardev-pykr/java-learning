// Q10 — Insert an Element at a Given Position
// Take an array, an element, and an index. Insert the element at the given position.

import java.util.Scanner;

public class Q10_InsertAnElementAtAGivenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size = ");
        int size = sc.nextInt();
        if(size<=0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int arr[] = new int[size+1];

        System.out.println("Enter array elements:");
        for(int i = 0; i<arr.length-1; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Enter the element = ");
        int element = sc.nextInt();

        System.out.print("Enter the index = ");
        int index = sc.nextInt();

        for(int i = arr.length-1; i>index; i--){
            arr[i] = arr[i-1];
        }
        
        arr[index] = element;

        System.out.println();
        System.out.println("Output Array:");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}// Output 
// Enter array size = 4
// Enter array elements:
// 11 33 44 55

// Enter the element = 22
// Enter the index = 1

// Output Array:
// 11 22 33 44 55 