/* Q12 — Find the Triplet Closest to a Given Target Sum
Take an array and a target number. Find the three elements whose sum is 
closest to the target. */

import java.util.Scanner;

public class Q12_FindTheTripletClosestToAGivenTargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size = ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid Array Size!");
            sc.close();
            return;
        }

        System.out.println("Enter elements:");

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Target Number = ");
        int target = sc.nextInt();

        int smallestDiff = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            
            for (int j = i + 1; j < arr.length-1; j++) {
                
                for (int k = j + 1; k < arr.length; k++) {
                    
                    int sum = arr[i] + arr[j] + arr[k];

                    int diff = Math.abs(sum - target);

                    if(diff < smallestDiff){

                        smallestDiff = diff;
                        a = arr[i];
                        b = arr[j];
                        c = arr[k];
                    }
                }
            }
        }

        System.out.print("Three Elements = "+a+","+b+","+c);

        System.out.println();

        System.out.println("Sum = "+(a+b+c));

        sc.close();
    }
}
// Output 
// Enter the Array Size = 6
// Enter elements:
// -1 2 1 -4 5 3
// Target Number = 4
// Three Elements = -1,2,3
// Sum = 4