// Longest Consecutive Increasing Sequence

// Take 10 integers and find the longest sequence 
// where every next element is greater than the previous one.

// Example:
// 1 2 3 2 4 5 6 1 8 9

// Increasing sequences:

// 1 2 3        → length 3
// 4 5 6        → length 3
// 1 8 9        → length 3

// Output:
// Longest Length = 3

import java.util.Scanner;

public class LongestConsecutiveIncreasingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int maxlength = 1;
        int currentlength = 1;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                currentlength++;
            }
            else{
                currentlength = 1;
            }
            if(currentlength>maxlength){
                maxlength = currentlength;
            }
        }
        System.out.println("Longest length = " + maxlength);
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 33 45 67 43 23 45 89 90 87 89 
// Longest length = 4
