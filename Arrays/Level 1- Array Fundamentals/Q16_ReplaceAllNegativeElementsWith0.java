// Q16 — Replace All Negative Elements with 0
// Take an array from the user and replace every negative element with 0.

import java.util.Scanner;

public class Q16_ReplaceAllNegativeElementsWith0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size = ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i]<0){
                arr[i] = 0;
            }
        }

        System.out.println("Array with all negative elements replaced by 0");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
// Output
// Enter size = 7
// -23 45 65 23 -90 -11 26 
// Array with all negative elements replaced by 0
// 0 45 65 23 0 0 26 