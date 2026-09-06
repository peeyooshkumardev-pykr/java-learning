// Q16 — Find All Pairs With a Given Sum
// Find all pairs of elements whose sum is equal to a given number.

import java.util.Scanner;

public class Q16_FindAllPairsWithAGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size = ");
        int size = sc.nextInt();

        if(size <= 0){
            System.out.println("Wrong Input!");
            sc.close();
            return;
        }

        int arr[] = new int[size]; 

        System.out.println("Enter Array Elements:");

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Target Sum = ");
        int sumPair = sc.nextInt();

        System.out.println("All pairs of elements whose sum is equal to "+sumPair+":");

        for (int i = 0; i < arr.length; i++) {

            for(int j = 0; j<arr.length; j++){
                int sum = arr[i] + arr[j];
                
                if(sum==sumPair && arr[i]<arr[j]){
                    System.out.println(arr[i] + "," + arr[j]);
                }

            }            
        }

        sc.close();
    }
}
// Output 
// Enter Size = 6
// Enter Array Elements:
// 1 2 3 4 5 6
// Target Sum = 7
// All pairs of elements whose sum is equal to 7:
// 1,6
// 2,5
// 3,4