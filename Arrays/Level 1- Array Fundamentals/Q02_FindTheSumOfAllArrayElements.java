// Q02 — Find the Sum of All Array Elements
// Take an array from the user and find the sum of all its elements.

import java.util.Scanner;

public class Q02_FindTheSumOfAllArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N = ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.print("Sum of all array elements = "+sum);
        sc.close();
    }
}
// Output
// Enter N = 6
// 12 21 32 45 11 67 
// Sum of all array elements = 188