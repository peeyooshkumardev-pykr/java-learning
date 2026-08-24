// Q13 — Print Elements in Reverse Order
// Take an array from the user and print all elements in reverse order.

import java.util.Scanner;

public class Q13_PrintElementsInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N = ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Reverse Order: ");
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
// Output
// Enter N = 5
// 32 11 65 98 79 
// Reverse Order: 79 98 65 11 32 