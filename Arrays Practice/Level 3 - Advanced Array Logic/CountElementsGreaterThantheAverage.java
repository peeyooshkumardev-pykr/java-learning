// Count Elements Greater Than the Average

// Take 10 integers, calculate their average, then count how many elements are 
// greater than the average.

import java.util.Scanner;

public class CountElementsGreaterThantheAverage {
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

        double sum = 0;
        double avg;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        avg = sum / arr.length;
        System.out.println("Average = " + avg);

        System.out.println("Elements are greater than the average");
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>avg){
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Number of elements are greater than the average = " + count);
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 10 20 30 40 50 60 70 80 90 100 
// Average = 55.0
// Elements are greater than the average
// 60 70 80 90 100 
// Number of elements are greater than the average = 5