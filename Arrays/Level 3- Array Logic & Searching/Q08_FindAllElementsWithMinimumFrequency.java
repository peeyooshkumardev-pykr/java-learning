// Q08 — Find All Elements with Minimum Frequency
// Take an array and print all elements having the lowest frequency.

import java.util.Scanner;

public class Q08_FindAllElementsWithMinimumFrequency {
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

        int countMinfrequency = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length; i++){
            int count = 0;

            for(int j = 0; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count<countMinfrequency){
                countMinfrequency = count;
            }
        }

        System.out.println("All elements that have the lowest frequency:");
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

            if(printOnce && count==countMinfrequency){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
// Output
// Enter Array size = 10
// 21 31 41 21 21 31 31 11 44 55
// All elements that have the lowest frequency:
// 41 11 44 55 