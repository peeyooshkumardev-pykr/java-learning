// Find the Majority Element

// Given an array of n integers, find the element that appears more than n/2 times.

import java.util.Scanner;
public class FindtheMajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size = ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        int limit = n/2;
        System.out.println("n = "+limit);

        for(int i = 0; i<arr.length; i++){
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>limit){
                System.out.println("Element that appears more than n/2 times = "+arr[i]);
                break;
            }
        }
        sc.close();
    }
}
//OUTPUT
// Enter Size = 8
// 12
// 10
// 12
// 12
// 12
// 45
// 67
// 12
// Array Elements
// 12 10 12 12 12 45 67 12 
// n = 4
// Element that appears more than n/2 times = 12