// Q11 — Delete an Element from a Given Position
// Take an array and an index. Delete the element present at that index.

import java.util.Scanner;

public class Q11_DeleteAnElementfromAGivenPosition {
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

        System.out.print("Enter the index = ");
        int index = sc.nextInt();

        if(index>=0 && index<arr.length){
            for(int i = index; i<arr.length-1; i++){
                arr[i] = arr[i+1];
            }
        }else{
            System.out.println("Wrong Index!");
            sc.close();
            return;
        }

        System.out.println();
        System.out.println("Output Array:");
        for(int i = 0; i<arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
// Output 
// Enter array size = 4
// Enter array elements:
// 23 42 65 09
// Enter the index = 2

// Output Array:
// 23 42 9 