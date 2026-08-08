// Count Elements Greater Than 50
// Take 10 integers and count how many elements are greater than 50.

import java.util.Scanner;
public class CountElementsGreaterThan50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>50){
                count++;
            }
        }
        System.out.println("Number of elements are greater than 50 = " + count);
        sc.close();
    }
}
// OUTPUT
// Array Elements
// 45 57 88 85 33 22 14 90 65 32 
// Number of elements are greater than 50 = 5