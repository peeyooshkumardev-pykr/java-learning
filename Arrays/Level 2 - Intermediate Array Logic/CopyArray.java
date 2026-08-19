// Copy One Array into Another
// Take 5 integers in one array and copy all elements into a second array.

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("1st Array Elements");

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int arr2[] = new int[5];

        for(int i = 0; i<arr.length; i++){
            arr2[i] = arr[i];
        }
        System.out.println("2nd Array");
        for(int j = 0; j<arr.length; j++){
            System.out.print(arr2[j] + " ");
        }
        sc.close();
    }
}
//OUTPUT
// 30
// 20
// 10
// 40
// 19
// 1st Array Elements
// 30 20 10 40 19 
// 2nd Array
// 30 20 10 40 19 