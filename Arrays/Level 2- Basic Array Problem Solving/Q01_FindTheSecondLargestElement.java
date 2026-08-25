// Q01 — Find the Second Largest Element
// Take an array from the user and find the second largest element.

import java.util.Scanner;

public class Q01_FindTheSecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Array Size = ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Invalid Size!");
            sc.close();
            return;
        }

        int arr[] = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        Integer largest2nd = null;

        for(int i = 1; i<arr.length; i++){

            if(largest < arr[i]){
                largest2nd = largest;
                largest = arr[i];
            }
            else if(largest > arr[i] && (largest2nd==null || largest2nd < arr[i])){
                largest2nd = arr[i];
            }
        }
        if(largest2nd != null){
            System.out.println("Second Largest Element = " + largest2nd);
        }else{
            System.out.println("No Second Largest Element!");
        }
        
        sc.close();
    }
}
// Output
// Enter Size = 5
// 44 32 -12 54 66
// Second Largest Element = 54

// Enter Size = 4
// 22 22 22 22
// No Second Largest Element!