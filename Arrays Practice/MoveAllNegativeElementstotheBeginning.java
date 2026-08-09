// Move All Negative Elements to the Beginning
// Take 10 integers and rearrange the same array so that all negative numbers come first, 
// while keeping all non-negative numbers after them.

import java.util.Scanner;
public class MoveAllNegativeElementstotheBeginning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

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
            if(arr[i]<0){
                int temp = arr[position];
                arr[position] = arr[i];
                arr[i] = temp;
                position++;
            }
        }
        System.out.println("Required Array");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 45 66 77 -65 -12 -55 -90 44 21 34 
// Required Array
// -65 -12 -55 -90 66 77 45 44 21 34
