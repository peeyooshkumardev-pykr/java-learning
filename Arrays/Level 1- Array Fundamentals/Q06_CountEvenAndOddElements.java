// Q06 — Count Even and Odd Elements
// Take an array from the user and count how many elements are even and how many are odd.

import java.util.Scanner;

public class Q06_CountEvenAndOddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N = ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int countOdd = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                countOdd++;
            }
        }
        if(countOdd>0){
            System.out.println("Number of odds in array = "+countOdd);
        }else{
            System.out.println("No Odd Number in array");
        }

        int countEven = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                countEven++;
            }
        }
        if(countEven>0){
            System.out.println("Number of evens in array = "+countEven);
        }else{
            System.out.println("No Even Number in array");
        }

        sc.close();
    }
}
// Output
// Enter N = 5
// 23 -12 12 -17 10
// Number of odds in array = 2
// Number of evens in array = 3

// Enter N = 5
// 23 67 89 13 11 
// Number of odds in array = 5
// No Even Number in array

// Enter N = 5
// 12 78 90 16 80
// No Odd Number in array
// Number of evens in array = 5