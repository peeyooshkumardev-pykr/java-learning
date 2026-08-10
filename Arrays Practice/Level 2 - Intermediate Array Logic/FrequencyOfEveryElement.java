// Find Frequency of Every Element

// Take 10 integers and print how many times each different value occurs.

// Example:

// Input:
// 10 20 10 30 20 10

// Output:
// 10 → 3
// 20 → 2
// 30 → 1

// Don't print the same value's frequency more than once.

import java.util.Scanner;
public class FrequencyOfEveryElement {
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

        System.out.println("Frequencies");
        for(int i = 0; i<arr.length; i++){
            int count = 0;
            boolean check = true;
            for(int j = 0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            for(int j = 0; j<i; j++){
                if(arr[j]==arr[i]){
                    check = false;
                }
            }
            if(check){
                System.out.println(arr[i] + " = " + count);
            }

        }
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 44 56 44 44 78 78 56 32 11 32 
// Frequencies
// 44 = 3
// 56 = 2
// 78 = 2
// 32 = 2
// 11 = 1