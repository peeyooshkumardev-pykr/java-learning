// Q06 — Find the Second Most Frequent Element
// Take an array and find the element with the second-highest frequency.

import java.util.Scanner;

public class Q06_FindTheSecondMostFrequentElement {
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

        int count2ndMaxfrequency = 0;
        int elementWith2ndMaxfrequency = 0;

        for(int i = 0; i<arr.length; i++){
            int count = 0;

            for(int j = 0; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count < countMaxfrequency && count >count2ndMaxfrequency){
                count2ndMaxfrequency = count;
                elementWith2ndMaxfrequency = arr[i];

            }
        }
        if(count2ndMaxfrequency>0){
            System.out.println("Element with the second-highest frequency = "+elementWith2ndMaxfrequency);
        }else{
            System.out.println("No Second Element!");
        }
        

        sc.close();
    }
}
// Output
// Enter Array size = 10
// 11 22 33 11 11 22 22 22 33 44
// Element with the second-highest frequency = 11

// Enter Array size = 5
// 1 1 1 1 1
// No Second Element!