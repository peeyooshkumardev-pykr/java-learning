// Count Increasing Adjacent Pairs
// Take 10 integers and count how many times an element is greater than the element 
// immediately before it.

import java.util.Scanner;

public class CountIncreasingAdjacentPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int count = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                count++;
            }
        }
        System.out.println("Count = "+count);
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 45 33 44 65 23 67 44 89 87 54 
// Count = 4
