// Q12 — Find Most Frequent Element
// Find the element that occurs the maximum number of times.

import java.util.Scanner;

public class Q12_FindMostFrequentElement {
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

        int countMax = 0;
        int maxElement = 0;

        for(int i = 0; i<arr.length; i++){
            int count = 0;

            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count>countMax){
                countMax = count;
                maxElement = arr[i];
            }
        }
        
        System.out.println("Output:");
        System.out.println("Most Frequent Element = " + maxElement);
        System.out.println("Frequency = " + countMax);

        sc.close();
    }
}
// Output 
// Enter Size = 10
// Enter Array Elements:
// 11 11 22 33 11 33 33 44 44 33   
// Output:
// Most Frequent Element = 33
// Frequency = 4