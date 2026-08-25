// Q06 — Count Duplicate Elements
// Take an array from the user and count how many different values occur more than once.

import java.util.Scanner;

public class Q06_CountDuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Array Size = ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.print("Invalid Size");
            sc.close();
            return;
        }

        int arr[] = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int countDuplicate = 0;

        for(int i = 0; i<arr.length; i++){
            int count = 0;
            boolean printOnce = true;
            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count > 1){
                for(int j = 0; j<i; j++){
                    if(arr[i] == arr[j]){
                        printOnce = false;
                        break;
                    }
                }
            }
            if(printOnce && count>1){
                countDuplicate++;                     
                }
        }
        
        System.out.println("Number of Duplicate Elements = "+countDuplicate);
        
        sc.close();
    }
}
// Output
// Enter Array Size = 10
// 56 88 54 23 -11 24 24 24 56 23
// Number of Duplicate Elements = 3