// Q20 — Find the Longest Increasing Subarray
// Find the longest contiguous subarray where every element is greater than the previous element.

import java.util.Scanner;

public class Q20_FindTheLongestIncreasingSubarray {
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

        int start = 0;
        int startMax = 0;
        int count = 1;
        int countLongest = 1;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                count++;
            }else{
                count = 1;
                start = i+1;
            }

            if(count>countLongest){
                countLongest = count;
                startMax = start;
            }
        }
        System.out.println("Longest increasing subarray:");

        for(int i = startMax; i<startMax+countLongest; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Length = "+countLongest);

        sc.close();
    }
}
// Output 
// Enter Array size = 8
// 10 12 15 8 9 11 14 5
// Longest increasing subarray:
// 8 9 11 14 
// Length = 4