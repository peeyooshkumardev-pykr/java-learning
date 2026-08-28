// Q15 — Check Whether Two Arrays Contain the Same Elements
// Take two arrays and check whether they contain the same values regardless of their order.

import java.util.Scanner;

public class Q15_CheckWhetherTwoArraysContainTheSameElements {
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

                int count1 = 0;
                int count2 = 0;

                for(int j = 0; j<arr1.length; j++){
                    if(arr1[j] == arr1[i]){
                        count1++;
                    }
                }

                for(int j = 0; j<arr2.length; j++){
                    if(arr2[j]==arr1[i]){
                        count2++;
                    }
                }
                if(count1!=count2){
                    sameArray = false;
                    break;
                }
            }

            if(sameArray){
            System.out.println("Arrays contain the same elements");
            }else{
                System.out.println("Not contain same elements");
            }
        }
        else{
            System.out.println("Not same size!");
        }

        sc.close();
    }
}
// Output
// Enter Array 1 size = 5
// Array 1
// 10 15 20 15 20
// Enter Array 2 size = 5
// Array 2
// 20 20 15 15 10
// Arrays contain the same elements

// Enter Array 1 size = 5
// Array 1
// 1 1 2 3 3
// Enter Array 2 size = 5
// Array 2
// 1 1 2 2 3
// Not contain same elements