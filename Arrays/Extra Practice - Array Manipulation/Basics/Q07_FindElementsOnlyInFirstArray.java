// Q07 — Find Elements Only in First Array
// Print the elements that are present in the first array but not in the second array.

import java.util.Scanner;

public class Q07_FindElementsOnlyInFirstArray {
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

        System.out.println("Elements that are present in the first array but not in the second array:");

        boolean noElementPresent = true;

        for(int i = 0; i<arr1.length; i++){

            boolean isPresent = true;

            for(int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    isPresent = false;
                    break;
                }
            }

            if(isPresent){
                System.out.print(arr1[i]+" ");
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
// Enter 1st Array Size = 5
// Enter 1st Array Elements:11 22 33 44 55

// Enter 2nd Array Size = 4
// Enter 2nd Array Elements:22 33 66 88

// Elements that are present in the first array but not in the second array:
// 11 44 55 

// Output 2
// Enter 1st Array Size = 4
// Enter 1st Array Elements:1 2 3 4

// Enter 2nd Array Size = 4
// Enter 2nd Array Elements:1 2 3 4

// Elements that are 