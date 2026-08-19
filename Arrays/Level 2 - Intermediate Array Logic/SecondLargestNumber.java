//Find Second Largest Element
//Take 10 integers and find the second largest element.

import java.util.Scanner;
public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int max;
        int max2nd;
        if(arr[0]>arr[1]){
            max = arr[0];
            max2nd = arr[1];
        }else{
            max = arr[1];
            max2nd = arr[0];
        }
        for(int i=2; i<arr.length; i++){
            if(arr[i]>max){
                max2nd = max;
                max = arr[i];
            }else if(arr[i]>max2nd){
                max2nd = arr[i];
            }
        } 
        System.out.println("Largest = "+max);
        System.out.println("2nd Largest = "+max2nd);
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 45 34 12 33 99 77 54 67 43 58 
// Largest = 99
// 2nd Largest = 77