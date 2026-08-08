// Find the First Occurrence of a Number

// Take 10 integers and then take another integer from the user.

// Find the **index of its first occurrence** in the array.

// Example:
// Array:
// 10 20 30 20 40

// Search:
// 20

// Output:
// First occurrence = index 1

// If the number doesn't exist, print an appropriate message.
import java.util.Scanner;
public class FindOccuranceOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter integer = ");
        int num = sc.nextInt();
        boolean found = false;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == num){
                found = true;
                System.out.println("At Index = " + i);
                break;
            }
            
        }
        if(!found){
        System.out.println("Element not found");
        }
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 34 55 78 33 12 -66 -90 56 -12 33 
// Enter integer = -66
// At Index = 5