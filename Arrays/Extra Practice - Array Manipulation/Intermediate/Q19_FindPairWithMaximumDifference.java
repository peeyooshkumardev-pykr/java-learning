// Q19 — Find Pair With Maximum Difference
// Find the pair of elements having the largest difference.

import java.util.Scanner;

public class Q19_FindPairWithMaximumDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size = ");
        int size = sc.nextInt();

        if(size <= 0){
            System.out.println("Wrong Input!");
            sc.close();
            return;
        }

        int arr[] = new int[size]; 

        System.out.println("Enter Array Elements:");

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int largestDifference = Integer.MIN_VALUE;
        int leftside = 0;
        int rightside = 0;

        for (int i = 0; i < arr.length; i++) {

            for(int j = 0; j<arr.length; j++){

                int difference = Math.abs(arr[i] - arr[j]);

                if(difference > largestDifference && arr[i]!=arr[j]){
                    largestDifference = difference;
                    leftside = arr[i];
                    rightside = arr[j];
                }
            }            
        }

        System.out.println("The pair of elements having the Largest difference:\n"+leftside+","+rightside);
        System.out.println("Maximum Difference = "+largestDifference);

        sc.close();
    }
}
// Output 
// Enter Size = 5
// Enter Array Elements:
// 4 1 9 6 2
// The pair of elements having the Largest difference:
// 1,9
// Maximum Difference = 8