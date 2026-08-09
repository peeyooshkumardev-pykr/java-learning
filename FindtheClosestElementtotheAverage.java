// Find the Closest Element to the Average

// Take 10 integers, calculate their average, and find the element closest to that average.

import java.util.Scanner;

public class FindtheClosestElementtotheAverage {
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

        double temp ;
        double closest = Double.MAX_VALUE;
        double closeElement = 0;
        for(int i = 0; i<arr.length; i++){
            temp = Math.abs(avg - arr[i]);
            if(temp<closest){
                closest = temp;
                closeElement = arr[i];
            }
        }
        System.out.println("Element closest to that average = " + closeElement);
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 33 45 67 21 34 78 65 55 43 11 
// Average = 45.2
// Element closest to that average = 45.0