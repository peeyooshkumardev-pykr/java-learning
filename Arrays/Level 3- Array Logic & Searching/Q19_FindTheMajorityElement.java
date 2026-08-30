// Q19 — Find the Majority Element
// Find an element that appears more than N / 2 times in the array.

import java.util.Scanner;

public class Q19_FindTheMajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array size = ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int  arr[] = new int[size];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int N = arr.length/2;
        boolean noMajorityElement = true;

        for(int i = 0; i<arr.length; i++){
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            if(count>N){
                System.out.println("Majority element = "+arr[i]);
                noMajorityElement = false;
                break;
            }
        }
        
        if(noMajorityElement){
            System.out.println("No Majority element!");
        }
        sc.close();
    }
}
// Output 
// Enter Array size = 7
// 2 2 1 2 3 2 2
// Majority element = 2

// Enter Array size = 5
// 2 3 1 6 6
// No Majority element!