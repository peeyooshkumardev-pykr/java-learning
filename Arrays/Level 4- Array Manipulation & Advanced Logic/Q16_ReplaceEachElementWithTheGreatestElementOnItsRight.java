// Q16 — Replace Each Element with the Greatest Element on Its Right
// For every element, replace it with the greatest element appearing to its right. Replace the last element with -1.

import java.util.Scanner;

public class Q16_ReplaceEachElementWithTheGreatestElementOnItsRight {
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

        int maxElement = arr[arr.length - 1];

        for(int i = arr.length - 2; i >= 0; i--){
            int currentElement = arr[i];
        
            arr[i] = maxElement;
        
            if(currentElement > maxElement){
                maxElement = currentElement;
            }
        }
        arr[arr.length-1] = -1;

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
// Output 
// Enter array size = 6
// Enter Array Elements:
// 16 17 4 3 5 2
// 17 17 5 5 5 -1 