// Q13 — Rearrange Array in Maximum-Minimum Form
// Given a sorted array, rearrange it so that the maximum element comes first, then the minimum, then the second maximum, 
// then the second minimum, and so on.

import java.util.Scanner;

public class Q13_RearrangeArrayInMaximum_MinimumForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size = ");
        int size = sc.nextInt();
        if(size<=0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int arr[] = new int[size];
        int newArr[] = new int[size];

        System.out.println("Enter Array Elements:");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        
        if(isSorted){

            int minIndex = 0;
            int maxIndex = arr.length - 1;

            for(int i = 0; i < newArr.length; i++){

                if(i % 2 == 0){
                    newArr[i] = arr[maxIndex];
                    maxIndex--;
                }else{
                    newArr[i] = arr[minIndex];
                    minIndex++;
                }
            }
        }
        else{
            System.out.println("Array is not sorted!");
            sc.close();
            return;
        }

        System.out.println("Output Array:");
        for(int i = 0; i<newArr.length; i++){
            System.out.print(newArr[i]+" ");
        }

        sc.close();
    }
}
// Output 1
// Enter array size = 6
// Enter Array Elements:
// 11 22 33 44 55 66
// Output Array:
// 66 11 55 22 44 33 

// Output 2
// Enter array size = 5
// Enter Array Elements:
// 1 2 3 4 5
// Output Array:
// 5 1 4 2 3 