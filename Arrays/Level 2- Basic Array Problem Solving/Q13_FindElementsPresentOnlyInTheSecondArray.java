// Q13 — Find Elements Present Only in the Second Array
// Take two arrays and print the elements that exist in the second array but not in the first.

import java.util.Scanner;

public class Q13_FindElementsPresentOnlyInTheSecondArray {
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
        
        System.out.println("Resulted 2nd Array");

        for(int i = 0; i<arr2.length; i++){
            boolean notSame = true;
            boolean printOnce = true;

            for(int j = 0; j<arr1.length; j++){
                if(arr2[i] == arr1[j]){
                    notSame = false;
                    break;
                }
            }
            if(notSame){
                for(int j = 0; j<i; j++){
                    if(arr2[j]==arr2[i]){
                        printOnce = false;
                        break;
                    }
                }
            }
            if(printOnce && notSame){
                System.out.print(arr2[i]+" ");
            }
        }
        sc.close();
    }
}
// Output
// Enter Array 1 size = 5
// Array 1
// 11 22 33 44 55
// Enter Array 2 size = 10
// Array 2
// 11 22 33 44 55 66 77 88 99 100
// Resulted 2nd Array
// 66 77 88 99 100 