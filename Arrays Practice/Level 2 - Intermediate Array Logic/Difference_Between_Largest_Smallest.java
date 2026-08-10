// Find Difference Between Largest and Smallest
//    Take 10 integers and find:

//    Largest - Smallest

import java.util.Scanner;

public class Difference_Between_Largest_Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i=0; i<10; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int large = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        System.out.println("Largest = "+large);

        int small = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println("Smallest = "+small);
        int diff = large - small;
        System.out.println("Difference Between Largest & Smallest = " + diff);
        sc.close();
    }
}
// //OUTPUT
// Array Elements
// 30 50 10 20 80 100 866 2000 495 12 
// Largest = 2000
// Smallest = 10
// Difference Between Largest & Smallest = 1990