// Reverse an Array in the Same Array**
// Take 5 integers and reverse the array without creating another array
import java.util.Scanner;
public class ReverseArrayInSameArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Reverse Array");
        int temp;
        for(int i = 0; i<arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
// OUTPUT
// 34
// 55
// 67
// 88
// 99
// Array Elements
// 34 55 67 88 99 
// Reverse Array
// 99 88 67 55 34 
