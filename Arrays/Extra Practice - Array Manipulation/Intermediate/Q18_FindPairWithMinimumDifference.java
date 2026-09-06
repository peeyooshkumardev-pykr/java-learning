// Q18 — Find Pair With Minimum Difference
// Find the pair of elements having the smallest difference.

import java.util.Scanner;

public class Q18_FindPairWithMinimumDifference {
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

        int smallestDifference = Integer.MAX_VALUE;
        int leftside = 0;
        int rightside = 0;

        for (int i = 0; i < arr.length; i++) {

            for(int j = 0; j<arr.length; j++){

                int difference = Math.abs(arr[i] - arr[j]);

                if(difference<smallestDifference && arr[i]!=arr[j]){
                    smallestDifference = difference;
                    leftside = arr[i];
                    rightside = arr[j];
                }
            }            
        }

        System.out.println("The pair of elements having the smallest difference:\n"+leftside+","+rightside);
        System.out.println("Minimum Difference = "+smallestDifference);

        sc.close();
    }
}
// Output 
// Enter Size = 5
// Enter Array Elements:
// 10 3 20 15 7
// The pair of elements having the smallest difference:
// 10,7
// Minimum Difference = 3