// Q03 — Find the Average of Array Elements
// Take an array from the user and calculate the average of all elements.

import java.util.Scanner;

public class Q03_FindTheAverageOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N = ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        double sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        double avg = sum / arr.length;

        System.out.print("Average of array elements = "+avg);
        sc.close();
    }
}
// Output
// Enter N = 5
// 20 30 50 -10 90
// Average of array elements = 36.0