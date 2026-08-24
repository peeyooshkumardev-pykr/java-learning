// Q17 — Find Sum of Positive and Negative Elements Separately
// Take an array and calculate the sum of all positive elements and the sum of all 
// negative elements separately.

import java.util.Scanner;

public class Q17_FindSumOfPositiveAndNegativeElementsSeparately {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         System.out.print("Enter N = ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sumPositive = 0;
        int sumNegative = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>0){
                sumPositive = sumPositive + arr[i];
            }
            else{
                sumNegative = sumNegative + arr[i];
            }
        }
        System.out.println("Sum of all Positive elements = "+sumPositive);
        System.out.println("Sum of all Negative elements = "+sumNegative);

        sc.close();
    }
}
// Output
// Enter N = 10
// 10 20 30 40 50 -10 -20 -30 -40 60
// Sum of all Positive elements = 210
// Sum of all Negative elements = -100