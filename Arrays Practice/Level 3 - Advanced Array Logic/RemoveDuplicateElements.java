// Remove Duplicate Elements

// Take 10 integers and remove duplicate values so that each distinct value appears only once.

import java.util.Scanner;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Distinct Array Elements");
        for(int i = 0; i<arr.length; i++){
            boolean isDuplicate = false;
            for(int j = 0; j<i; j++){
                if(arr[i]==arr[j]){
                    isDuplicate = true;
                }
            }
            if(!isDuplicate){
                    System.out.print(arr[i] + " ");
                }
        }
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 33 33 33 12 45 67 88 12 45 88 
// Distinct Array Elements
// 33 12 45 67 88 