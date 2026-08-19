// Count Duplicate Elements
// Take 10 integers and find how many elements appear more than once.

import java.util.Scanner;
public class CountDuplicateNumbersa {
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
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        System.out.println("Number of duplicates = "+count);
        sc.close();
    }
}
// OUTPUT
// Array Elements
// 33 44 55 33 44 55 55 26 41 44 
// Number of duplicates = 7
