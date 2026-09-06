// Q13 — Find Least Frequent Element
// Find the element that occurs the minimum number of times.

import java.util.Scanner;

public class Q13FindLeastFrequentElement {
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

        int countMin = Integer.MAX_VALUE;
        int minElement = 0;

        for(int i = 0; i<arr.length; i++){
            int count = 0;

            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count<countMin){
                countMin = count;
                minElement = arr[i];
            }
        }
        
        System.out.println("Output:");
        System.out.println("Least Frequent Element = " + minElement);
        System.out.println("Frequency = " + countMin);

        sc.close();
    }
}
// Output 
// Enter Size = 8
// Enter Array Elements:
// 1 2 3 1 2 3 4 2
// Output:
// Least Frequent Element = 4
// Frequency = 1