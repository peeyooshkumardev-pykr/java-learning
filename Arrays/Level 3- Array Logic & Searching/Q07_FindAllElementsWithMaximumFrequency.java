// Q07 — Find All Elements with Maximum Frequency
// Take an array and print all elements that have the highest frequency.

import java.util.Scanner;

public class Q07_FindAllElementsWithMaximumFrequency {
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

        int countMaxfrequency = 0;

        for(int i = 0; i<arr.length; i++){
            int count = 0;

            for(int j = 0; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count>countMaxfrequency){
                countMaxfrequency = count;
            }
        }

        System.out.println("All elements that have the highest frequency:");
        for(int i = 0; i<arr.length; i++){
            int count = 0;
            boolean printOnce = true;

            for(int j = 0; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            for(int j = 0; j<i; j++){
                if(arr[j] == arr[i]){
                    printOnce = false;
                    break;
                }
            }

            if(printOnce && count==countMaxfrequency){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
// Output
// Enter Array size = 10
// 10 20 30 20 30 10 10 20 40 40
// All elements that have the highest frequency:
// 10 20 