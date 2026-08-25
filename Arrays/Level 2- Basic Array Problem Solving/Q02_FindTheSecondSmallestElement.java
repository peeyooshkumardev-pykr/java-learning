// Q02 — Find the Second Smallest Element
// Take an array from the user and find the second smallest element.

import java.util.Scanner;

public class Q02_FindTheSecondSmallestElement {
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

        int smallestElement = arr[0];
        Integer secondSmallestElement = null;

        for(int i = 1; i<arr.length; i++){
            if(smallestElement > arr[i]){
                secondSmallestElement = smallestElement;
                smallestElement = arr[i];
            }
            else if(smallestElement < arr[i] && (secondSmallestElement == null || secondSmallestElement>arr[i])){
                secondSmallestElement = arr[i];
            }
        }
        
        if(secondSmallestElement != null){
            System.out.println("Second smallest element = "+secondSmallestElement);
        }else{
            System.out.println("No second smallest element.");
        }

        sc.close();
    }
}
// Output
// Enter size = 5
// 33 21 -24 -10 1
// Second smallest element = -10

// Enter size = 5
// 22 22 23 11 11
// Second smallest element = 22

// Enter size = 4
// 22 22 22 22
// No second smallest element.

// Enter size = 0
// Invalid Size
