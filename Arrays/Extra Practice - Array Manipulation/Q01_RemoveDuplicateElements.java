// Q01 — Remove Duplicate Elements
// Take an array and remove duplicate elements, keeping only the first occurrence.

import java.util.Scanner;

public class Q01_RemoveDuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        

        System.out.print("Enter Size = ");
        int size = sc.nextInt();

        if(size <= 0){
            System.out.println("Wrong Input!");
            sc.close();
            return;
        }

        int arr[] = new int[size]; 

        System.out.println("Enter Array Elements:");

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Result:");
        for(int i = 0; i<arr.length; i++){
            boolean printedOnce = true;

            for(int j = 0; j<i; j++){
                
                if(arr[i] == arr[j]){
                    printedOnce = false;
                    break;
                }
            }

            if(printedOnce){
                System.out.print(arr[i]+" ");
            }
        }

        sc.close();
    }
}
// Output 
// Enter Size = 10
// Enter Array Elements:
// 1 1 2 2 2 1 2 3 3 4  
// Result:
// 1 2 3 4
