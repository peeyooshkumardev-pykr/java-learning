// Q09 — Find the Longest Streak of Equal Elements
// Take an array and find the longest contiguous sequence containing the same element.

import java.util.Scanner;

public class Q09_FindTheLongestStreakOEqualElements {
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

        int countMax = 1;
        int maxElement = arr[0];
        int count = 1;

        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                count++;
            }else{
                count = 1;
            }

            if(count>countMax){
                countMax = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Element = "+maxElement);
        System.out.println("Length = "+countMax);

        sc.close();
    }
}
// Output
// 5 5 5 2 2 7
// Element = 5
// Length = 3