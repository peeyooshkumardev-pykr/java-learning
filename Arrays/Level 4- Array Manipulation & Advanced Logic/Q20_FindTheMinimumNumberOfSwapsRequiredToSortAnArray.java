// Q20 — Find the Minimum Number of Swaps Required to Sort an Array

// Take an array containing distinct elements and find the minimum number of swaps
// required to arrange it in ascending order.

import java.util.Scanner;
import java.util.Arrays;

public class Q20_FindTheMinimumNumberOfSwapsRequiredToSortAnArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size = ");
        int size = sc.nextInt();

        if(size <= 0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int arr[] = new int[size];

        System.out.println("Enter Array Elements:");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sortedArr[] = arr.clone();

        Arrays.sort(sortedArr);

        int swaps = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] != sortedArr[i]){

                for(int j = i + 1; j < arr.length; j++){

                    if(arr[j] == sortedArr[i]){

                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;

                        swaps++;
                        break;
                    }
                }
            }
        }

        System.out.println("Minimum Swaps = " + swaps);

        System.out.print("Sorted Array = ");

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
// Output 
// Enter Array Size = 5
// Enter Array Elements:
// 4 3 1 2 5
// Minimum Swaps = 3
// Sorted Array = 1 2 3 4 5 