// Q17 — Find All Pairs With a Given Difference
// Find all pairs of elements whose difference is equal to a given number.

import java.util.Scanner;

public class Q17_FindAllPairsWithAGivenDifference {
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
        int differencePair = sc.nextInt();

        System.out.println("All pairs of elements whose difference is equal to "+differencePair+":");

        for (int i = 0; i < arr.length; i++) {

            for(int j = 0; j<arr.length; j++){
                int difference = Math.abs(arr[i] - arr[j]);
                
                if(difference==differencePair && arr[i]<arr[j]){
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }            
        }

        sc.close();
    }
}
// Output 
// Enter Size = 5
// Enter Array Elements:
// 1 3 5 7 9
// Target Sum = 4
// All pairs of elements whose difference is equal to 4:
// 1,5
// 3,7
// 5,9