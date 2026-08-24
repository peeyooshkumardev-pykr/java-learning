// Q04 — Find the Largest Element
// Take an array from the user and find the largest element.

import java.util.Scanner;

public class Q04_FindTheLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N = ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int largestElement = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(largestElement<arr[i]){
                largestElement = arr[i];
            }
        }
        System.out.println("Largest Number in array = "+largestElement);

        sc.close();
    }
}
// Output
// Enter N = 7
// 12 34 -12 -100 14 56 24       
// Largest Number in array = 56