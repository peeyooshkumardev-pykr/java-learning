// Find the Second Smallest Distinct Element
// Take 10 integers and find the second smallest distinct value.

import java.util.Scanner;
public class FindSecondSmallestDistinctElement {
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
        
        int small = arr[0];
        int small2nd = Integer.MAX_VALUE;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<small){
                small2nd = small;
                small = arr[i];
            }else
            if(arr[i]>small && arr[i]<small2nd){
                small2nd = arr[i];
            }
            
        }
        System.out.println("Smallest = " + small);
        System.out.println("2nd Smallest = " + small2nd);
        sc.close();
    }
}
//output
// Array Elements
// 45 67 89 32 12 44 79 12 44 78 
// Smallest = 12
// 2nd Smallest = 32