// Longest Equal Consecutive Sequence

// Take 10 integers and find the longest sequence where consecutive elements are equal.

// Example:

// 1 2 2 2 3 4 4 5 5 5

// Sequences:

// 2 2 2 → length 3
// 4 4   → length 2
// 5 5 5 → length 3

// Output:

// Longest length = 3

import java.util.Scanner;

public class LongestEqualConsecutiveSequence {
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
            if(arr[i]==arr[i-1]){
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
// 22 34 34 34 12 12 12 12 45 45 
// Longest length = 4
