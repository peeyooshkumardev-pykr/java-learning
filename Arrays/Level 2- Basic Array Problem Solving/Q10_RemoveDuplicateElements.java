// Q10 — Remove Duplicate Elements
// Taje an array from the user and create a new array containing each value only once.

import java.util.Scanner;

public class Q10_RemoveDuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size = ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Invalid input!");
            sc.close();
            return;
        }

        int arr1[] = new int[n];

        System.out.println("Enter array elements");
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = 0; i<arr1.length; i++){
                boolean printOnce = true;

            for(int j = 0; j<i; j++){
                if(arr1[j] == arr1[i]){
                    printOnce = false;
                    break;
                }
            }
            if(printOnce){
                count++;
            }
        }
        
        int arr2[] = new int[count];

        int arr2index = 0;

        for(int i = 0; i<arr1.length; i++){
            boolean printOnce = true;
                
            for(int j = 0; j<i; j++){
                if(arr1[j] == arr1[i]){
                    printOnce = false;
                    break;
                }
            }
            if(printOnce){
                arr2[arr2index] = arr1[i];
                arr2index++;
            }
        }

        System.out.print("2nd Array = ");

        for(int i = 0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
        sc.close();
    }
}
// Output
// Enter array elements
// 1 1 1 2 2 2 2 3 3 4 4  
// 2nd Array = 1 2 3 4 