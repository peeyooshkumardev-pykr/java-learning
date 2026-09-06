// Q08 — Find Elements Only in Second Array
// Print the elements that are present in the second array but not in the first array.

import java.util.Scanner;

public class Q08_FindElementsOnlyInSecondArray {
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

        System.out.println("Elements that are present in the second array but not in the first array:");

        boolean noElementPresent = true;

        for(int i = 0; i<arr2.length; i++){

            boolean isPresent = true;

            for(int j = 0; j<arr1.length; j++){
                if(arr2[i] == arr1[j]){
                    isPresent = false;
                    break;
                }
            }

            if(isPresent){
                System.out.print(arr2[i]+" ");
                noElementPresent = false;
            }
        }

        if(noElementPresent){
            System.out.println("No such elements!");
        }
        sc.close();
    }
}
// Output 1
// Enter 1st Array Size = 4
// Enter 1st Array Elements:1 2 3 4

// Enter 2nd Array Size = 7
// Enter 2nd Array Elements:1 2 3 4 5 6 7

// Elements that are present in the second array but not in the first array:
// 5 6 7

// Output 2
// Enter 1st Array Size = 3
// Enter 1st Array Elements:1 2 3 

// Enter 2nd Array Size = 2
// Enter 2nd Array Elements:1 2

// Elements that are present in the second array but not in the first array:
// No such elements!