/* Q07 — Count Subarrays with Product Less Than a Given Number
Take an array of positive integers and a target number. Count how many contiguous 
subarrays have a product less than the target. */

import java.util.Scanner;

public class Q07_CountSubarraysWithProductLessThanAGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size = ");
        int size = sc.nextInt();

        if(size <= 0){
            System.out.println("Invalid Array Size!");
            sc.close();
            return; 
        }

        System.out.println("Enter elements:");

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isNegativeOrZero = false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= 0){
                isNegativeOrZero = true;
                break;
            }
        }

        if(isNegativeOrZero){
            System.out.println("Invalid Input!");
            sc.close();
            return; 
        }

        System.out.print("Target Number = ");
        int target = sc.nextInt();

        int countLesserThanTarget = 0;

        for (int i = 0; i < arr.length; i++) {
            
            int product = arr[i];

            if(product < target){
                countLesserThanTarget++;
            }

            for (int j = i + 1; j < arr.length; j++) {

                product = product * arr[j];

                if(product < target){
                    countLesserThanTarget++;
                }
            }
        }

        System.out.println();

        System.out.println("Number of subarrays = " + countLesserThanTarget);

        sc.close();
    }
}
// Output 
// Enter the Array Size = 4
// Enter elements:
// 10 5 2 6
// Target Number = 100

// Number of subarrays = 8