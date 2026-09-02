// Q12 — Delete All Occurrences of a Given Element
// Take an array and an element. Remove every occurrence of that element.

import java.util.Scanner;

public class Q12_DeleteAllOccurrencesOfAGivenElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size = ");
        int size = sc.nextInt();
        if(size<=0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int arr[] = new int[size];

        System.out.println("Enter array elements:");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Enter the element = ");
        int element = sc.nextInt();

        System.out.println("Output Array:");
        for(int i = 0; i<arr.length; i++){
            if(element!=arr[i]){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
// Output 
// Enter array size = 6
// Enter array elements:
// 11 22 33 22 11 22

// Enter the element = 22
// Output Array:
// 11 33 11