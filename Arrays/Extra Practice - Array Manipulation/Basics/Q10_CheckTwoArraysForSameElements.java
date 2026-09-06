// Q10 — Find Intersection of Two Arrays
// Take two arrays and print the elements that occur in both arrays.

import java.util.Scanner;

public class Q10_CheckTwoArraysForSameElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Array Size = ");
        int size1 = sc.nextInt();

        if(size1 <= 0){
            System.out.println("Wrong Input!");
            sc.close();
            return;
        }

        int arr1[] = new int[size1]; 

        System.out.print("Enter 1st Array Elements:");

        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println();

        System.out.print("Enter 2nd Array Size = ");
        int size2= sc.nextInt();

        if(size2 <= 0){
            System.out.println("Wrong Input!");
            sc.close();
            return;
        }

        int arr2[] = new int[size2]; 

        System.out.print("Enter 2nd Array Elements:");

        for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println();

        int countCommanElements = 0;

        for(int i = 0; i<arr1.length; i++){
            
            boolean isComman = false;
            boolean printOnce = true;

            for(int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                     isComman = true;
                     break;
                }
            }

            for(int j = 0; j<i; j++){
                if(arr1[i] == arr1[j]){
                    printOnce = false;
                    break;
               }
            }

            if(isComman && printOnce){
                countCommanElements++;
            }
        }

        int arrResult[] = new int[countCommanElements];

        int position = 0;

        for(int i = 0; i<arr1.length; i++){
            
            boolean isComman = false;
            boolean printOnce = true;

            for(int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                     isComman = true;
                     break;
                }
            }

            for(int j = 0; j<i; j++){
                if(arr1[i] == arr1[j]){
                    printOnce = false;
                    break;
               }
            }

            if(isComman && printOnce){
                arrResult[position] = arr1[i];
                position++;
            }
        }

        System.out.println("Output Array:");

        for(int i = 0; i<arrResult.length; i++){
            System.out.print(arrResult[i]+" ");
        }

        sc.close();
    }
}
// Output
// Enter 1st Array Size = 5
// Enter 1st Array Elements:11 22 33 44 55

// Enter 2nd Array Size = 3 
// Enter 2nd Array Elements:33 44 66

// Output Array:
// 33 44 