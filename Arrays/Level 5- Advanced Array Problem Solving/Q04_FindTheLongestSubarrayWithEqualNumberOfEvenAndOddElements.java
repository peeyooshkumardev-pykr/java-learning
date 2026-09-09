/* Q04 — Find the Longest Subarray with Equal Number of Even and Odd Elements.
Take an array and find the longest contiguous subarray containing an equal number 
of even and odd elements. */

import java.util.Scanner;

public class Q04_FindTheLongestSubarrayWithEqualNumberOfEvenAndOddElements {
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

        boolean allOdds = true;
        boolean allEvens = true;
        boolean findZero = false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 != 0){
                allEvens = false;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0){
                allOdds = false;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                findZero = true;
                break;
            }
        }

        if(allEvens){
            System.out.println("All elements are evens. Invalid!");
            sc.close();
            return;
        }

        if(allOdds){
            System.out.println("All elements are odds. Invalid!");
            sc.close();
            return;
        }

        if(findZero){
            System.out.println("Array comtain 0. Invalid!");
            sc.close();
            return;
        }

        int countMAXOddEven = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = arr.length-1; j > i; j--) {
                
                int countEven = 0;
                int countOdd = 0;
                int sumCount = 0;

                for (int k = i; k <= j; k++) {
                    
                    if(arr[k]%2 == 0){
                        countEven++;
                    }else{
                        countOdd++;
                    }
                }

                if(countEven == countOdd){ 
                    sumCount = countEven + countOdd;

                    if(sumCount>countMAXOddEven){

                    countMAXOddEven = sumCount;
                    start = i;
                    end = j;

                    }
                }
            }
        }

        System.out.println("Longest subarray:");

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println("Length = "+countMAXOddEven);

        sc.close();
    }
}
// Output 1
// Enter the Array Size = 7
// Enter elements:
// 1 2 4 6 7 3 5
// Longest subarray:
// 1 2 4 6 7 3 
// Length = 6

// Output 2
// Enter the Array Size = 5
// Enter elements:
// 7 5 1 2 3
// Longest subarray:
// 1 2 
// Length = 2

// Output 3
// Enter the Array Size = 3
// Enter elements:
// 1 3 5
// All elements are odds. Invalid!

// Output 4
// Enter the Array Size = 2
// Enter elements:
// 2 4
// All elements are evens. Invalid!