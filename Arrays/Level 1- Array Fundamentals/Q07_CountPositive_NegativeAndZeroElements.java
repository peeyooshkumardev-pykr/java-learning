// Q07 — Count Positive, Negative and Zero Elements
// Take an array from the user and count the number of positive, negative, and zero elements.

import java.util.Scanner;

public class Q07_CountPositive_NegativeAndZeroElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N = ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>0){
                countPositive++;
            }
            else if(arr[i]<0){
                countNegative++;
            }
            else{
                countZero++;
            }
        }

        if(countPositive>0){
            System.out.println("Number of Positives in array = "+countPositive);
        }else{
            System.out.println("No Positive Number");
        }

        if(countNegative>0){
            System.out.println("Number of Negatives in array = "+countNegative);
        }else{
            System.out.println("No Negative Number");
        }

        if(countZero>0){
            System.out.println("Number of Zeroes in array = "+countZero);
        }else{
            System.out.println("No Zero");
        }

        sc.close();
    }
}
// Output
// Enter N = 5
// 12 13 56 0 0
// Number of Positives in array = 3
// No Negative Number
// Number of Zeroes in array = 2

// Enter N = 5
// 0 0 0 0 -123
// No Positive Number
// Number of Negatives in array = 1
// Number of Zeroes in array = 4

// Enter N = 5
// 12 34 65 -10 -35
// Number of Positives in array = 3
// Number of Negatives in array = 2
// No Zero

