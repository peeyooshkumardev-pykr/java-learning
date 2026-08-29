// Q10 — Find the Element with the Maximum Difference from Its Previous Element
// Take an array and find the pair of adjacent elements having the largest absolute difference.

import java.util.Scanner;

public class Q10_FindTheElementwithTheMaximumDifferencefromItsPreviousElement {
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

        int maxDifference = 0;
        int leftSide = 0;
        int rightSide = 0;

        for(int i = 0; i<arr.length-1; i++){
            int difference = Math.abs(arr[i] - arr[i+1]);

            if(difference>maxDifference){
                maxDifference = difference;
                leftSide = arr[i];
                rightSide = arr[i+1];
            }
        }
        System.out.println("Largest absolute difference = "+maxDifference+" between "+leftSide+" and "+rightSide);
        sc.close();
    }
}
// Output
// Enter Array size = 10
// 22 44 67 87 32 54 90 14 87 54 
// Largest absolute difference = 76 between 90 and 14