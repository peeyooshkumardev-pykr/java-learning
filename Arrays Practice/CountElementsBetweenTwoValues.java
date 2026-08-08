// Count Elements Between Two Values
// Take 10 integers and two numbers low and high. Count how many elements are between them,
// inclusive.

// Example:
// Array:
// 5 10 15 20 25 30
// low = 10
// high = 25

// Output:
// 4

import java.util.Scanner;

public class CountElementsBetweenTwoValues {
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

        System.out.print("Low Number = ");
        int low = sc.nextInt();

        System.out.print("High Number = ");
        int high = sc.nextInt();

        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=low && arr[i]<=high){
                count++;
            }
        }
        System.out.println("Number of elements between them = "+count);
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 5 67 44 33 21 56 89 77 54 23 
// Low Number = 44
// High Number = 89
// Number of elements between them = 6