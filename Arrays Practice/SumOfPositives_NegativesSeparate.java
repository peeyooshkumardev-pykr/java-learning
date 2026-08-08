// Find the Difference Between Positive Sum and Negative Sum
// Take 10 integers.

// Calculate the sum of all positive numbers and the sum of all negative numbers, then calculate:
// positiveSum - negativeSum

import java.util.Scanner;
public class SumOfPositives_NegativesSeparate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Positives");
        int sumpositive = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>0){
                System.out.print(arr[i]+" ");
                sumpositive = sumpositive + arr[i];
            }
        }System.out.println();
        System.out.println("Sum of Positives = "+sumpositive);

        System.out.println("Negatives");
        int sumnegative = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
                sumnegative = sumnegative + arr[i];
            }
        }
        System.out.println();
        System.out.println("Sum of Negatives = "+sumnegative);

        int calculate = sumpositive - sumnegative;
        System.out.println("Sumpositives - SumNegatives = " + calculate);
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 33 22 11 34 -77 -10 -23 -45 -25 67 
// Psitives
// 33 22 11 34 67 
// Sum of Positives = 167
// Negatives
// -77 -10 -23 -45 -25 
// Sum of Negatives = -180
// Sumpositives - SumNegatives = 347