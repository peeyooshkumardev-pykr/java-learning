// Q16 — Find the Difference Between Corresponding Elements
// Take two arrays of the same size and create a third array containing the absolute difference 
// between corresponding elements.

import java.util.Scanner;

public class Q16_FindTheDifferenceBetweenCorrespondingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Array 1 size = ");
        int n1 = sc.nextInt();
        if(n1<=0){
            System.out.println("Invalid input!");
            sc.close();
            return;
        }
        System.out.println("Array 1");

        int arr1[] = new int[n1];

        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter Array 2 size = ");
        int n2 = sc.nextInt();
        if(n2<=0){
            System.out.println("Invalid input!");
            sc.close();
            return;
        }
        System.out.println("Array 2");

        int arr2[] = new int[n2];

         for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        if(arr1.length != arr2.length){
            System.out.println("Both arrays are not same in size!");
            sc.close();
            return;
        }

        int arr3[] = new int[n1];

        System.out.println("Third array containing the absolute differences:");
        for(int i = 0; i<arr3.length; i++){

            arr3[i] = Math.abs(arr1[i]-arr2[i]);
            System.out.print(arr3[i]+" ");
        }

        sc.close();
    }
}
// Output
// Enter Array 1 size = 5
// Array 1
// 40 34 12 10 24
// Enter Array 2 size = 5
// Array 2
// 22 33 56 78 90
// Third array containing the absolute differences:
// 18 1 44 68 66 

// Enter Array 1 size = 4
// Array 1
// 3 3 3 3
// Enter Array 2 size = 3
// Array 2
// 2 2 2
// Both arrays are not same in size!