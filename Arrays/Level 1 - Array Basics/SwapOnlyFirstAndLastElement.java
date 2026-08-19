// Swap First and Last Elements

// Take 10 integers and swap only the first and last elements.

// Example:

// Before:
// 10 20 30 40 50

// After:
// 50 20 30 40 10

// Do it **in the same array**.
import java.util.Scanner;

public class SwapOnlyFirstAndLastElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int temp; 
        temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        
        System.out.println("Swapped Array");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 6 7 8 9 0 1 2 3 4 5 
// Swapped Array
// 5 7 8 9 0 1 2 3 4 6 