// Find the Element with the Maximum Difference from Its Neighbors

// For every middle element in the array, compare it with its left and right neighbors.

// Find the middle element that has the largest total difference from its neighbors.

import java.util.Scanner;

public class FindtheElementwiththeMaximumDifferencefromItsNeighbors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size = ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int Maxdifference = -1;
        int middlelement = 0;
        for(int i = 1; i<arr.length-1; i++){
            int Leftdifference = 0;
            int Rightdifference = 0;
            int Sumdifference = 0;

            Leftdifference = Math.abs(arr[i] - arr[i-1]);
            Rightdifference = Math.abs(arr[i] - arr[i+1]);

            Sumdifference = Leftdifference + Rightdifference;

            if(Sumdifference>Maxdifference){
                Maxdifference = Sumdifference;
                middlelement = arr[i];
            }
        }
        System.out.println("Maximum Difference = " + Maxdifference);
        System.out.println("Middle element that has the largest total difference from its neighbors is "+middlelement);
        sc.close();
    }
}
//OUTPUT
// Enter Size = 6
// 12
// 14
// 34
// 54
// 76
// 45
// Array Elements
// 12 14 34 54 76 45 
// Maximum Difference = 53
// Middle element that has the largest total difference from its neighbors is 76