// Find the Second Largest Element
// Take 10 integers and find the second largest distinct value.

import java.util.Scanner;
public class FindSecondLargestDistinctElement {
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
        
        int large = arr[0];
        int large2nd = Integer.MIN_VALUE;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>large){
                large2nd = large;
                large = arr[i];
            }else
            if(arr[i]<large && arr[i]>large2nd){
                large2nd = arr[i];
            }
            
        }
        System.out.println("Largest = " + large);
        System.out.println("2nd Largest = " + large2nd);
        sc.close();
    }
}
// OUTPUT
// Array Elements
// 45 66 77 89 23 89 66 12 78 78 
// Largest = 89
// 2nd Largest = 78