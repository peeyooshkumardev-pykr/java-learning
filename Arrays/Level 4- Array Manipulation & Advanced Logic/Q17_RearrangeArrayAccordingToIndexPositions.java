// Q17 — Rearrange Array According to Index Positions
// Take an array where every value is between 0 and N-1. Rearrange the array so that each element is placed
//  at its corresponding index.

import java.util.Scanner;

public class Q17_RearrangeArrayAccordingToIndexPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size = ");
        int size = sc.nextInt();
        if(size<=0){
            System.out.println("Wrong Input!");
            sc.close();
            return;
        }

        int arr[] = new int[size];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int temp;

        for(int i = 0; i < arr.length; i++){
        
            while(arr[i] != i){
        
                temp = arr[i];
        
                arr[i] = arr[temp];
        
                arr[temp] = temp;
            }
        }
        
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
// Output 
// Enter array size = 6
// 5 4 3 2 1 0
// 0 1 2 3 4 5 