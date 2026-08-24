// Q10 — Find Largest, Smallest and Their Difference
// Take an array from the user, find the largest and smallest elements, and calculate their difference.

import java.util.Scanner;

public class Q10_FindLargest_SmallestAndTheirDifference {
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

         int smallestElement = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(smallestElement>arr[i]){
                smallestElement = arr[i];
            }
        }
        System.out.println("Smallest Number in array = "+smallestElement);

        int difference = largestElement - smallestElement;
        
        System.out.println("Difference between largest element and smallest element = "+difference);

        sc.close();
    }
}
// Output
// Enter N = 7
// 13 23 -12 24 67 -43 98
// Largest Number in array = 98
// Smallest Number in array = -43
// Difference between largest element and smallest element = 141