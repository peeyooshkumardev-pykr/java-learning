// Q06 — Find Common Elements of Two Arrays
// Take two arrays and print the elements that are present in both arrays.

import java.util.Scanner;

public class Q06_FindCommonElementsOfTwoArrays {
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

        System.out.println("Enter 1st Array Elements:");

        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter 2nd Array Size = ");
        int size2= sc.nextInt();

        if(size2 <= 0){
            System.out.println("Wrong Input!");
            sc.close();
            return;
        }

        int arr2[] = new int[size2]; 

        System.out.println("Enter 2nd Array Elements:");

        for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println("Elements that are present in both arrays:");

        boolean notCommon = true;

        for(int i = 0; i<arr1.length; i++){

            boolean printOnce = true;
            boolean isCommon = false;

            for(int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    isCommon = true;
                    notCommon = false;
                    break;
                }
            }

            if(isCommon){
                for(int j = 0; j<i; j++){
                    if(arr1[i] == arr1[j]){
                        printOnce = false;
                        break;
                    }
                }
            }

            if(printOnce && isCommon){
                System.out.print(arr1[i]+" ");
            }
        }

        if(notCommon){
            System.out.println("No Common Element!");
        }

        sc.close();
    }
}
// Output 1
// Enter 1st Array Size = 5
// Enter 1st Array Elements:
// 1 2 3 4 5
// Enter 2nd Array Size = 5
// Enter 2nd Array Elements:
// 3 4 5 6 7
// Elements that are present in both arrays:
// 3 4 5 

// Output 2
// Enter 1st Array Size = 3
// Enter 1st Array Elements:
// 2 3 4
// Enter 2nd Array Size = 4
// Enter 2nd Array Elements:
// 5 6 7 8
// Elements that are present in both arrays:
// No Common Element!