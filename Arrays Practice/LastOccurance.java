// Find Last Occurrence
// Take 10 integers and a number. Find the last index where that number occurs.

import java.util.Scanner;

public class LastOccurance {
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
        System.out.print("Enter Number = ");
        int num = sc.nextInt();

        for(int i=arr.length-1; i>=0; i--){
            if(num == arr[i]){
                System.out.println("Last Index = "+i);
                break;
            }
        }
        sc.close();
    }
}
