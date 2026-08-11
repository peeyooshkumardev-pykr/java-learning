// Find All Elements Greater Than Every Element Before Them
// Given an array, find all elements that are greater than every element appearing before them.

import java.util.Scanner;
public class FindtheFirstElementGreaterThanAllElementsBeforeIt {
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

        int max = Integer.MIN_VALUE;
        System.out.println("Elements that are greater than every element appearing before them");
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                System.out.print(max+" ");
            }
        }
        sc.close();
    }
}
//OUTPUT
// Enter Size = 5
// 34
// 45
// 32
// 19
// 67
// Array Elements
// 34 45 32 19 67 
// Elements that are greater than every element appearing before them
// 34 45 67 