// Q09 — Print Elements Greater Than Average
// Take an array from the user, calculate its average, and print all elements greater 
// than the average.

import java.util.Scanner;

public class Q09_PrintElementsGreaterThanAverage {
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

        System.out.println("Average = " + avg);

        System.out.println("All elements greater than the average");
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>avg){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
// Output
// Enter N = 8
// 20 90 20 10 -60 -10 50 100
// Average = 27.5
// All elements greater than the average
// 90 50 100 