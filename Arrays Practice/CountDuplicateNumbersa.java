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
        int dup;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                dup = arr[i];
            }
        }
        System.out.println(dup+" ");
    }
}
