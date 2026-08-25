// Q07 — Find the Most Frequent Element
// Take an array from the user and find the element that occurs the maximum number of times.

import java.util.Scanner;

public class Q07_FindTheMostFrequentElement {
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

        int countFrequency = 0;
        for(int i = 0; i<arr.length; i++){
            int count = 0;

            for(int j = 0; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count>countFrequency){
                countFrequency = count;
            }
        }

        System.out.print("The element that occurs the maximum number of times = ");

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
// 11 45 67 43 21 11 45 24 24 67
// The element that occurs the maximum number of times = 11 45 67 24 