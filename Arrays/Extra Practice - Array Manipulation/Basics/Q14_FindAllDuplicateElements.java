// Q14 — Find All Duplicate Elements
// Find and print all elements that occur more than once.

import java.util.Scanner;

public class Q14_FindAllDuplicateElements {
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

        System.out.println("All elements that occur more than once:");

        boolean noElement = true;

        for(int i = 0; i<arr.length; i++){

            int count = 0;
            boolean printOnce = true;

            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            for(int j = 0; j<i; j++){
                if(arr[i] == arr[j]){
                    printOnce = false;
                    break;
                }
            }

            if(count>1 && printOnce){
                System.out.print(arr[i]+" ");
                noElement = false;
            }
        }

        if(noElement){
            System.out.println("No such element that occur more than once.");
        }

        sc.close();
    }
}
// Output 1
// Enter Size = 8
// Enter Array Elements:
// 1 2 3 4 2 3 1 5  
// All elements that occur more than once:
// 1 2 3

// Output 2
// Enter Size = 4
// Enter Array Elements:
// 1 2 3 4
// All elements that occur more than once:
// No such element that occur more than once.