// Find the First Non-Repeating Element

// Given an array of integers, find the first element from the 
// left that appears exactly once.

import java.util.Scanner;

public class FindtheFirstNonRepeatingElement {
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

        for(int i = 0; i<arr.length; i++){
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println("First element from the left that appears exactly once = "+arr[i]);
                break;
            }
        }
        sc.close();
    }
}
//OUTPUT
// Enter size = 8
// 12
// 12
// 13
// 13
// 15
// 16
// 17
// 21
// Array Elements
// 12 12 13 13 15 16 17 21 
// First element from the left that appears exactly once = 15
