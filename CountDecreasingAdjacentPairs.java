// Count Decreasing Adjacent Pairs

// Take 10 integers and count how many times an element is 
// smaller than the element immediately before it.

import java.util.Scanner;
public class CountDecreasingAdjacentPairs {
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
            if(arr[i]<arr[i-1]){
                count++;
            }
        }
        System.out.println("Count = "+count);
        sc.close();
    }
}
// OUTPUT
// Array Elements
// 34 56 54 32 31 56 87 76 90 65 
// Count = 5

