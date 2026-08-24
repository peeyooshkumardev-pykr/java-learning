// Q01 — Take Input and Print All Array Elements
// Take an integer N from the user, create an array of size N, take all elements as input, and 
// print the elements.

import java.util.Scanner;

public class Q01_TakeInputAndPrintAllArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N = ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("All the array elements are ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
// OUTPUT
// Enter N = 5
// 33
// 12
// 54
// 66
// 10
// All the array elements are 33 12 54 66 10  