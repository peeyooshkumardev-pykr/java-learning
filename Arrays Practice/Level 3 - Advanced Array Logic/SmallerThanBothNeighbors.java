// Smaller Than Both Neighbors
// Take 10 integers and print every element that is smaller than both its previous and next elements.

import java.util.Scanner;

public class SmallerThanBothNeighbors {
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
        
        System.out.println("Required Array Elements");
        for(int i = 1; i<arr.length-1; i++){
            if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 34 90 12 34 56 74 24 65 23 45 
// Required Array Elements
// 12 24 23