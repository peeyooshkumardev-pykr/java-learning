// Find the First Repeating Element

// Given an array of integers, find the first element that appears more than once, 
// based on its position from left to right.

import java.util.Scanner;
public class FindtheFirstRepeatingElement {
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
            if(count>1){
                System.out.println("First element that appears more than once = "+arr[i]);
                break;
            }
        }
        sc.close();
    }
}
// Enter size = 6
// 12
// 13
// 14
// 15
// 14
// 15
// Array Elements
// 12 13 14 15 14 15 
// First element that appears more than once = 14
