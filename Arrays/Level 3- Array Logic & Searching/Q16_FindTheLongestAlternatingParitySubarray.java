// Q16 — Find the Longest Alternating Parity Subarray

// Find the longest contiguous subarray where each adjacent pair contains 
// one even and one odd number.

import java.util.Scanner;

public class Q16_FindTheLongestAlternatingParitySubarray {
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

        int count = 1;
        int countMax = 1;
        int start = 0;
        int maxStart = 0;

        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]%2==0 && arr[i+1]%2!=0 || arr[i]%2!=0 && arr[i+1]%2==0){
                count++;
            }else{
                count = 1;
                start = i + 1;
            }

            if(count>countMax){
                countMax = count;
                maxStart = start;
            }
        }
        for(int i = maxStart; i<maxStart+countMax; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("Length = "+countMax);

        sc.close();
    }
}
// Output
// Enter Array size = 9
// 2 5 8 7 4 6 3 9 10
// 2 5 8 7 4 
// Length = 5