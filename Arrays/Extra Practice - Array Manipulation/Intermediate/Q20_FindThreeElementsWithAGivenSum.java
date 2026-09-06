// Q20 — Find Three Elements With a Given Sum
// Find three elements whose sum is equal to a given target.

import java.util.Scanner;

public class Q20_FindThreeElementsWithAGivenSum {
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
        int target = sc.nextInt();

        System.out.println("Output:");

        for(int i = 0; i < arr.length - 2; i++) {

            for(int j = i + 1; j < arr.length - 1; j++) {
        
                for(int k = j + 1; k < arr.length; k++) {
        
                    int sum = arr[i] + arr[j] + arr[k];
        
                    if(sum == target) {
                        System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
                    }
                }
            }
        }

        sc.close();
    }
}
// Output 
// Enter Size = 5
// Enter Array Elements:
// 1 4 6 8 10
// Target Sum = 15
// Output:
// 1,4,10
// 1,6,8