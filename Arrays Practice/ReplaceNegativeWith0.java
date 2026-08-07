// Replace Negative Elements with 0

// Take 10 integers and replace every negative element with `0`.

// Example:

// Input:
// 10 -5 20 -8 30

// Output:
// 10 0 20 0 30
import java.util.Scanner;

public class ReplaceNegativeWith0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<0){
                arr[i] = 0;
            }
        }
        System.out.println();
        System.out.println("Converted from negative to 0");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
//OUTPUT
// 45
// 90
// -77
// -77
// -43
// -56
// -1
// -2
// -3
// 55
// Array Elements
// 45 90 -77 -77 -43 -56 -1 -2 -3 55 
// Converted from negative to 0
// 45 90 0 0 0 0 0 0 0 55 