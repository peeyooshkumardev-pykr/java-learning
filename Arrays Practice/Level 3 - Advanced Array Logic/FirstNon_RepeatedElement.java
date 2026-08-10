// First Non-Repeated Element

// Take 10 integers and find the first element that occurs exactly once.

import java.util.Scanner;

public class FirstNon_RepeatedElement {
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
            boolean Once = true;
            for(int j = 0; j<arr.length; j++){
                if(arr[i]==arr[j] && i!=j){
                    Once = false;
                }
            }
            if(Once){
                System.out.print("Output = " + arr[i]);
                break;
            }
        }
        sc.close();
    }
}
// OUTPUT
// Array Elements
// 45 66 34 45 66 54 34 12 34 67 
// Output = 54