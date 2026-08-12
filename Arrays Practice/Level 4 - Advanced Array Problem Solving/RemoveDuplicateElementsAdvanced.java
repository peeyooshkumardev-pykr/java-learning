// Remove Duplicate Elements

// Given an array, remove duplicate elements and print each value only once, 
// while keeping the order of their first appearance.

import java.util.Scanner;
public class RemoveDuplicateElementsAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size = ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        for(int i = 0; i<arr.length; i++){
            boolean isDistinct = false;
            for(int j = 0; j<i; j++){
                if(arr[i]==arr[j]){
                    isDistinct = true;
                }
            }
            if(!isDistinct){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
//OUTPUT
// Enter Size = 5
// 32
// 32
// 11
// 12
// 12
// Array Elements
// 32 32 11 12 12 
// 32 11 12 