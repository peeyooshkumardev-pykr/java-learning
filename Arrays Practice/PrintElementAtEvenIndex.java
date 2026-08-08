// Print Elements at Even Index Positions

// Take 10 integers and print only the elements whose **index is even**.

// Example:

// Index:   0  1  2  3  4
// Array:  10 20 30 40 50

// Output:
// 10 30 50
import java.util.Scanner;
public class PrintElementAtEvenIndex {
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
        System.out.println("Elements at even index");

        System.out.println();
        for(int i = 0; i<arr.length; i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 45 89 70 56 23 14 53 12 10 87 
// Elements at even index
// 45 70 23 53 10 