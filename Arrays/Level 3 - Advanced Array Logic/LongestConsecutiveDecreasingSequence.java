//Longest Consecutive Decreasing Sequence
//Find the longest sequence where each next element is smaller than the previous one.

import java.util.Scanner;

public class LongestConsecutiveDecreasingSequence {
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

        int minlength = 1;
        int currentlength = 1;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                currentlength++;
            }else{
                currentlength = 1;
            }

            if(currentlength > minlength){
                minlength = currentlength;
            }
        }
        System.out.println("Longest sequence = " + minlength);
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 33 22 11 23 11 23 45 32 43 21 
// Longest sequence = 3
