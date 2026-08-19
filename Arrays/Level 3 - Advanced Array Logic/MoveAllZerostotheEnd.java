// Move All Zeros to the End
// Take 10 integers and move all 0s to the end of the same array 
//  while preserving the order of non-zero elements.

import java.util.Scanner;
public class MoveAllZerostotheEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();   

        int position = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[position] = arr[i];
                position++;
            }
        }
        for(int i = position; i<arr.length; i++){
            arr[i] = 0;
        }
        System.out.println("Required Elements");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 0 55 67 0 66 0 21 0 0 78 
// Required Elements
// 55 67 66 21 78 0 0 0 0 0 