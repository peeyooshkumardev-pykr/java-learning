// First Repeated Element

// Take 10 integers and find the first element that appears more than once.

import java.util.Scanner;

public class FirstRepeatedElement {
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

        for(int i = 0; i<arr.length; i++){
            boolean isDuplicate = false;
            for(int j = 0; j<arr.length; j++){
                if(arr[i]==arr[j] && i!=j){
                    isDuplicate = true;
                }
            }
            if(isDuplicate){
                System.out.print("Output = "+ arr[i]);
                break;
            }
        }
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 34 22 44 66 87 22 76 66 87 66 
// Output = 22
