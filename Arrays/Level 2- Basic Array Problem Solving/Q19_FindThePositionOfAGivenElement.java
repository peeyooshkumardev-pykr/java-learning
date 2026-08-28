// Q19 — Find the Position of a Given Element
// Take an array and an element from the user. Find and print all indices where that element occurs.

import java.util.Scanner;

public class Q19_FindThePositionOfAGivenElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size = ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int arr[] = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element = ");
        int element = sc.nextInt();

        boolean isArrayElement = false;

        for(int i = 0; i<arr.length; i++){
            if(element==arr[i]){
                System.out.print(i+" ");
                isArrayElement = true;
            }
        }
        if(!isArrayElement){
            System.out.println("Given element is not present in given array.");
        }
        sc.close();
    }
}
// Output
// Enter size = 8
// 0 1 2 3 0 2 2 4
// Enter element = 2 5 6 