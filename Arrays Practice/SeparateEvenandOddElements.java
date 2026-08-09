// Separate Even and Odd Elements

// Take 10 integers and rearrange the same array so that:

// All even numbers come first.
// All odd numbers come after them.

import java.util.Scanner;

public class SeparateEvenandOddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Element");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        int temp;
        int position = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==0){
                temp = arr[position];
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
// OUTPUT
// Array Element
// 45 66 89 54 22 34 75 89 97 54 
// Required Array
// 66 54 22 34 54 45 75 89 97 89 