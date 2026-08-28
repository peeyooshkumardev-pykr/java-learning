// Q11 — Find Common Elements in Two Arrays
// Take two arrays from the user and print the elements that are present in both arrays.

import java.util.Scanner;

public class Q11_FindCommonElementsInTwoArrays {
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

        for(int i = 0; i<arr1.length; i++){
            boolean isSame = false;
            boolean printOnce = true;

            for(int j = 0; j<arr2.length; j++){
                if(arr2[j]==arr1[i]){
                    isSame = true;          
                    break;                       
                }
            }

            if(isSame){
                for(int j = 0; j<i; j++){
                    if(arr1[j]==arr1[i]){
                        printOnce = false;
                        break;
                    }
                }
            }
            if(printOnce && isSame){
                System.out.print(arr1[i]+" ");
            }
        }
        sc.close();
    }
}
// Output
// Enter Array 1 size = 10
// Array 1
// 78 69 23 45 23 67 69 11 22 45
// Enter Array 2 size = 7
// Array 2
// 21 34 56 45 22 69 23
// 69 23 45 22 