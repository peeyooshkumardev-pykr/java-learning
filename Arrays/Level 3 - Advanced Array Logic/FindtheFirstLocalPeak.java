// Find the First Local Peak

// Take 10 integers and find the first element that is greater than both its neighbors.

// Example:

// 10 15 20 12 18 25 20 30 40 35

// The first local peak is:

// 20

// because:

// 20 > 15
// 20 > 12

import java.util.Scanner;
public class FindtheFirstLocalPeak {
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

        for(int i = 1; i<arr.length-1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                 System.out.println("First element that is greater than both its neighbors is "+arr[i]);
                 break;
            }
        }
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 12 13 34 56 78 56 43 23 45 21 
// First element that is greater than both its neighbors is 78