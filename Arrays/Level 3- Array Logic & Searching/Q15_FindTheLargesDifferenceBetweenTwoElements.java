// Q15 — Find the Largest Difference Between Two Elements
// Find the maximum absolute difference between any two elements in the array.

import java.util.Scanner;

public class Q15_FindTheLargesDifferenceBetweenTwoElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array size = ");
        int size = sc.nextInt();

        if(size<=1){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int  arr[] = new int[size];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int maxDifference = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            for(int j = i + 1; j<arr.length; j++){
                int difference = Math.abs(arr[i] - arr[j]);

                if(difference>maxDifference){
                    maxDifference = difference;
                }
            }    
        }

        System.out.println("Maximum difference = "+maxDifference);
        sc.close();
    }
}
// Output
// Enter Array size = 5
// 10 40 20 80 30
// Maximum difference = 70