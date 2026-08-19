// Print Duplicate Elements
// Take 10 integers and print every value that occurs more than once.
// Each duplicate value should be printed only once.

import java.util.Scanner;
public class PrintDuplicateElements {
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

        for(int i = 0; i<arr.length; i++){
            boolean duplicate = false;
            boolean isAlreadyPrinted = true;
            for(int j = 0; j<arr.length; j++){
                if(arr[i]==arr[j] && i!=j){
                    duplicate = true;
                    break;
                }
            }
            for(int j = 0; j<i; j++){
                if(arr[j] == arr[i]){
                    isAlreadyPrinted = false;
                    break;
                }
            }
            if(duplicate && !isAlreadyPrinted){
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 44 56 77 88 32 56 77 88 43 23 
// 56
// 77
// 88
