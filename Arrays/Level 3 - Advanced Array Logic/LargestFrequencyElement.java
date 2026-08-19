// Find the Largest Frequency Element

// Take 10 integers and find the element that occurs the maximum number of times.

import java.util.Scanner;

public class LargestFrequencyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int max = 0;
        int maxElement = 0;
        for(int i = 0; i<arr.length; i++){
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>max){
                max=count;
                maxElement=arr[i];
            }
        }
        System.out.println("Number of times appear = "+max);
        System.out.println("The element that occurs the maximum number of times = "+maxElement);
        sc.close();
    }
}
// OUTPUT
// Array Elements
// 44 44 33 43 44 33 33 12 45 78 
// Number of times appear = 3
// The element that occurs the maximum number of times = 44