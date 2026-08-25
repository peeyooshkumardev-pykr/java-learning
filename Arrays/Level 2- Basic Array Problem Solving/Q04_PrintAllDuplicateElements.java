// Q04 — Print All Duplicate Elements
// Take an array from the user and print the elements that occur more than once.

import java.util.Scanner;

public class Q04_PrintAllDuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Array Size = ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Invalid Size");
            sc.close();
            return;
        }

        int arr[] = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        boolean foundDuplicate = false;

        System.out.println("Elements that occur more than once:");
        for(int i = 0; i<arr.length; i++){
            int countOccurrence = 0;

            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    countOccurrence++;
                }
            }
            
            boolean shouldPrint = true;
            if(countOccurrence > 1){
                foundDuplicate = true;

                for(int j = 0; j<i; j++){
                    if(arr[j]==arr[i]){
                        shouldPrint = false;
                        break;
                    }
                }
                if(shouldPrint){
                    System.out.print(arr[i]+" ");
                }
            }
        }

        if(!foundDuplicate){
            System.out.println("No elements that occur more than once.");
        }

        sc.close();
    }
}
// Output
// Enter Array Size = 5
// 22 22 11 11 7
// Elements that occur more than once:
// 22 11 

// Enter Array Size = 6  
// 22 11 33 4 6 7
// Elements that occur more than once:
// No elements that occur more than once.