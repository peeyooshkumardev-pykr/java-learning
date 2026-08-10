// Find Missing Number
// Array contains numbers from 1 to n, with one number missing. Find it.

import java.util.Scanner;
public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size = ");
        int n = sc.nextInt();

        int arr[] = new int[n-1];
        
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array that has missing element");

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        int actualsum = 0;
        for(int i = 0; i<arr.length; i++){
            actualsum += arr[i];
        }
        System.out.println();
        System.out.println("Actual Sum = "+actualsum);

        int expectedsum = (n*(n+1))/2;
        System.out.println("Expected Sum = "+expectedsum);

        int missingValue = expectedsum - actualsum;
        System.out.println("Missing Value = "+missingValue);
        sc.close();
    }
}
//OUTPUT
// Enter Size = 10
// 1
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// Array that has missing element
// 1 3 4 5 6 7 8 9 10 
// Actual Sum = 53
// Expected Sum = 55
// Missing Value = 2