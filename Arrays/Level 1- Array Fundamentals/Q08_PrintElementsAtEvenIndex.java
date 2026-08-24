// Q08 — Print Elements at Even Index
// Take an array from the user and print all elements present at even indices.

import java.util.Scanner;

public class Q08_PrintElementsAtEvenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N = ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("All elements present at even indices");
        for(int i = 0; i<arr.length; i++){
            if(i % 2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
// Output
// Enter N = 6
// 12 -90 -54 34 0 89
// All elements present at even indices
// 12 -54 0 