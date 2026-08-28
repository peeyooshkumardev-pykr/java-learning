// Q12 — Find Elements Present Only in the First Array
// Take two arrays and print the elements that exist in the first array but not in the second.

import java.util.Scanner;

public class Q12_FindElementsPresentOnlyInTheFirstArray {
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
        
        System.out.println("Resulted 1st Array");

        for(int i = 0; i<arr1.length; i++){
            boolean notSame = true;
            boolean printOnce = true;

            for(int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    notSame = false;
                    break;
                }
            }

            if(notSame){
                for(int j = 0; j<i; j++){
                    if(arr1[j]==arr1[i]){
                        printOnce = false;
                        break;
                    }
                }
            }
            if(printOnce && notSame){
                System.out.print(arr1[i]+" ");
            }
        }

        sc.close();
    }
}
// Output
// Enter Array 1 size = 8
// Array 1
// 11 22 33 44 55 66 77 88
// Enter Array 2 size = 4
// Array 2
// 11 22 33 44
// Resulted 1st Array
// 55 66 77 88 