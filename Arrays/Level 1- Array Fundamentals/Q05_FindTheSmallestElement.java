// Q05 — Find the Smallest Element
// Take an array from the user and find the smallest element.

import java.util.Scanner;

public class Q05_FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N = ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int smallestElement = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(smallestElement>arr[i]){
                smallestElement = arr[i];
            }
        }
        System.out.println("Smallest Number in array = "+smallestElement);

        sc.close();
    }
}
// Output
// Enter N = 6
// -24 23 1 2 56 -10
// Smallest Number in array = -24