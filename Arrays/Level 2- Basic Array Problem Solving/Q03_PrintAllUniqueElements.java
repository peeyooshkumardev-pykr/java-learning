// Q03 — Print All Unique Elements
// Take an array from the user and print only the elements that occur exactly once.

import java.util.Scanner;

public class Q03_PrintAllUniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Array Size = ");
        int n = sc.nextInt();

        if(n==0){
            System.out.println("Invalid Size");
            sc.close();
            return;
        }

        int arr[] = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        boolean foundUnique = false;

        System.out.println("Elements that occur exactly once:");
        for(int i = 0; i<arr.length; i++){
            int countOccurrence = 0;

            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    countOccurrence++;
                }
            }
            if(countOccurrence == 1){
                foundUnique = true;
                System.out.print(arr[i]+" ");
            }
        }

        if(!foundUnique){
            System.out.println("No elements occur exactly once.");
        }

        sc.close();
    }
}
// Output
// Enter Array Size = 10 
// 23 24 11 16 24 11 55 34 65 11
// Elements that occur exactly once:
// 23 16 55 34 65 

// Enter Array Size = 4
// 11 11 22 22
// Elements that occur exactly once:
// No elements occur exactly once.