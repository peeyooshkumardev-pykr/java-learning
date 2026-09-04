// Q18 — Find the Next Greater Element for Every Element
// For every element, find the first element to its right that is greater than it. 
// If no greater element exists, print -1.

import java.util.Scanner;

public class Q18_FindTheNextGreaterElementForEveryElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size = ");

        int size = sc.nextInt();

        if(size <= 0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int arr[] = new int[size];

        System.out.println("Enter Array Elements:");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int resultArr[] = new int[size];

        for(int i = 0; i < arr.length; i++){
        
            resultArr[i] = -1;
        
            for(int j = i + 1; j < arr.length; j++){
        
                if(arr[j] > arr[i]){
                    resultArr[i] = arr[j];
                    break;
                }
            }
        }
        
        for(int i = 0; i<resultArr.length; i++){
            System.out.print(resultArr[i]+" ");
        }

        sc.close();
    }
}