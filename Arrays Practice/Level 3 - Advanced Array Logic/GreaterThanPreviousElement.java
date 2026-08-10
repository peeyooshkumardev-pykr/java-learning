// Greater Than Previous Element

// Take 10 integers and print every element that is greater than the element immediately before it.

import java.util.Scanner;

public class GreaterThanPreviousElement {
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

        System.out.println("Required Array Elements");
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
// OUTPUT
// Array Elements
// 34 22 55 66 75 33 24 67 89 54 
// Required Array Elements
// 55 66 75 67 89 