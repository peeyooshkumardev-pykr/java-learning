// Q12 — Find the Pair with the Closest Sum to a Given Number
// Take an array and a target number. Find the pair whose sum has the smallest absolute 
// difference from the target.

import java.util.Scanner;

public class Q12_FindThePairWithTheClosestSumToAGivenNumber {
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

        System.out.print("Enter target = ");
        int target = sc.nextInt();

        System.out.println();
        int sumPair = 0;
        int leftSide = 0;
        int rightSide = 0;

        int smallestdifference = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){

            for(int j = i+1; j<arr.length; j++){
                int sum = arr[i] + arr[j];
                int difference = Math.abs(sum - target);

                if(difference<smallestdifference){
                    smallestdifference = difference;

                    leftSide = arr[i];
                    rightSide = arr[j];
                    sumPair = sum;
                }
            }
        }
        System.out.println("Closest pair:\n"+leftSide+" "+rightSide);
        System.out.println();
        System.out.println("Sum = "+sumPair);
        System.out.println("Difference = "+smallestdifference);

        sc.close();
    }
}
// Output
// Enter Array size = 6
// 10 22 28 29 30 40
// Enter target = 54

// Closest pair:
// 22 30

// Sum = 52
// Difference = 2