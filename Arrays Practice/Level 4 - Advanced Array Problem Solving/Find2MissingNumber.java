// Find Two Missing Numbers

// You are given numbers from 1 to n, but two numbers are missing.

import java.util.Scanner;
public class Find2MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size = ");
        int n = sc.nextInt();

        int arr[] = new int[n-2];
        
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array that has missing element");

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("Missing Values");
        for(int i = 1; i<=n; i++){
            boolean isMiss = false;
            for(int j = 0; j<arr.length; j++){
            if(i==arr[j]){
                isMiss = true;
            }
        }
        if(!isMiss){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
//OUTPUT
// Enter Size = 10
// 1
// 2
// 3
// 4
// 6
// 7
// 9
// 10
// Array that has missing element
// 1 2 3 4 6 7 9 10 
// Missing Values
// 5
// 8