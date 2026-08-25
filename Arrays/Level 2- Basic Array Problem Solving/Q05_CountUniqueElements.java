// Q05 — Count Unique Elements
// Take an array from the user and count how many different elements occur exactly once.

import java.util.Scanner;

public class Q05_CountUniqueElements {
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

        int countUnique = 0;

        for(int i = 0; i<arr.length; i++){
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count == 1){
                countUnique++;
            }
        }
        
        System.out.println("Number of Unique Elements = "+countUnique);
        
        sc.close();
    }
}
// Output
// Enter Array Size = 10 
// 11 22 32 12 22 33 45 32 33 45             
// Number of Unique Elements = 2

// Enter Array Size = 4
// 11 22 11 22
// Number of Unique Elements = 0