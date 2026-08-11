// Find All Elements Smaller Than Every Element Before Them

// Given an array, find all elements that are smaller than every element appearing before them.
// The first element automatically qualifies because there are no elements before it.

import java.util.Scanner;

public class FindAllElementsSmallerThanEveryElementBeforeThem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size = ");
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

        System.out.println("All Elements Smaller Than Every Element Before Them");
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
                System.out.print(min+" ");
            }
        }
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 9 7 5 7 6 4 6 3 
// All Elements Smaller Than Every Element Before Them
// 9 7 5 4 3 