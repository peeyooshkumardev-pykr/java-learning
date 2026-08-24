// Q15 — Check Whether an Array is Sorted
// Take an array from the user and check whether its elements are arranged in ascending order.

import java.util.Scanner;

public class Q15_CheckWhetherAnArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N = ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        boolean ascending = true;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                ascending = false;
                break;
            }
        }
        if(ascending){
            System.out.println("Elements are arranged in ascending order.");
        }else{
            System.out.println("Elements are not arranged in ascending order.");
        }

        sc.close();
    }
}
// Output
// Enter N = 6
// 22 33 54 65 77 89
// Elements are arranged in ascending order.

// Enter N = 5
// 12 11 45 65 43 
// Elements are not arranged in ascending order.