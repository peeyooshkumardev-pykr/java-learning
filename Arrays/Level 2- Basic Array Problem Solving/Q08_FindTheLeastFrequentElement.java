// Q08 — Find the Least Frequent Element
// Take an array from the user and find the element that occurs the minimum number of times.

import java.util.Scanner;

public class Q08_FindTheLeastFrequentElement {
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

        int countFrequency = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            int count = 0;

            for(int j = 0; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count<countFrequency){
                countFrequency = count;
            }
        }

        System.out.print("The element that occurs the least number of times = ");

        for(int i = 0; i<arr.length; i++){
            int count = 0;
            boolean printOnce = true;

            for(int j = 0; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count == countFrequency){
                for(int j = 0; j<i; j++){
                    if(arr[j] == arr[i]){
                        printOnce = false;
                        break;
                    }
                }
                if(printOnce){
                System.out.print(arr[i]+" ");
                }
            }
        }

        sc.close();
    }
}
// Output
// Enter Array Size = 10
// 45 66 77 88 88 77 45 76 11 87
// The element that occurs the least number of times = 66 76 11 87 