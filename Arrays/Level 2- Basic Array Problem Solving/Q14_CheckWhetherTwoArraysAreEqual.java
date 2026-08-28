// Q14 — Check Whether Two Arrays are Equal
// Take two arrays from the user and check whether they have the same size and the same elements 
// in the same order.

import java.util.Scanner;

public class Q14_CheckWhetherTwoArraysAreEqual {
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

        if(arr1.length == arr2.length){
            boolean sameArray = true;

            for(int i = 0; i<arr1.length; i++){

                if(arr1[i] != arr2[i]){
                    sameArray = false;
                    break;
                }
            }

            if(sameArray){
            System.out.println("Arrays are equal.");
            }else{
                System.out.println("Not equal!");
            }
        }else{
            System.out.println("Not same size!");
        }

        sc.close();
    }
}
// Output
// Enter Array 1 size = 5
// Array 1
// 2 3 4 5 6
// Enter Array 2 size = 5 
// Array 2
// 2 3 4 5 6
// Arrays are equal.

// Enter Array 1 size = 3
// Array 1
// 1 2 3
// Enter Array 2 size = 3
// Array 2
// 2 1 3
// Not equal!