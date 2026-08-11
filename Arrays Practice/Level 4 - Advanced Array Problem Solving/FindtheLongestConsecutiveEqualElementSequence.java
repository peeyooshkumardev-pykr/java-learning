// Find the Longest Consecutive Equal-Element Sequence

// Given an array, find the longest sequence of consecutive elements that are all equal.

import java.util.Scanner;

public class FindtheLongestConsecutiveEqualElementSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size = ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int currentSequence = 1;
        int longestSequence = 1;
        int longestStart = 0;

        for(int i = 1; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                currentSequence++;
            }
            else{
                currentSequence = 1;
            }
            if(currentSequence>longestSequence){
                longestSequence = currentSequence;
                longestStart = i - currentSequence + 1;
            }
        }
        System.out.println("Find the Longest Consecutive Equal-Element Sequence");
        for(int i = longestStart; i<longestStart+longestSequence; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Length of Longest Consecutive Equal-Element Sequence = "+longestSequence);
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 2 1 3 5 5 5 5 5 2 2 
// Find the Longest Consecutive Equal-Element Sequence
// 5 5 5 5 5 
// Length of Longest Consecutive Equal-Element Sequence = 5