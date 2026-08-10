// Check if Array is Sorted
// Take an array of integers and check whether it is sorted in ascending order.

import java.util.Scanner;
public class CheckSortedAsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i = 0; i<arr.length;  i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        boolean isSorted = true;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Given Array is Sorted in Ascending order");
        }
        else{
            System.out.println("Not Sorted");
        }
        sc.close();
    }
}
// 10
// 30
// 50
// 15
// 60
// Array Elements
// 10 30 50 15 60 
// Not Sorted

// 30
// 40
// 50
// 60
// 80
// Array Elements
// 30 40 50 60 80 
//Given Array is Sorted in Ascending order