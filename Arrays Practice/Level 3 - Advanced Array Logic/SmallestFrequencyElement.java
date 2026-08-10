// Smallest Frequency Element
// Take 10 integers and find the element that occurs the least number of times.

import java.util.Scanner;

public class SmallestFrequencyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Element");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        int min = Integer.MAX_VALUE;
        int minElement = 0;
        for(int i = 0; i<arr.length; i++){
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count<min){
                min = count;
                minElement = arr[i];
            }
        }
        System.out.println("Number of times appear = " + min);
        System.out.println("The element that occurs the minimum number of times = " + minElement);
        sc.close();
    }
}
// OUTPUT
// Array Element
// 66 89 66 98 89 23 34 34 89 11 
// Number of times appear = 1
// The element that occurs the minimum number of times = 98