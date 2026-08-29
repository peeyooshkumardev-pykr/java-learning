// Q04 — Find the First Repeating Element
// Take an array and find the first element that appears more than once 
// while scanning from left to right.

import java.util.Scanner;

public class Q04_FindTheFirstRepeatingElement {
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

        int count = 0;

        for(int i = 0; i<arr.length; i++){

            for(int j = 0; j<arr.length; j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>1){
                System.out.println("First element that appears more than once = "+arr[i]);
                break;
            }else{
                count = 0;
            }
        }

        if(count==0){
            System.out.println("No element appears more than once.");
        }
        sc.close();
    }
}
// Output
// Enter Array size = 5
// 1 2 3 3 2
// First element that appears more than once = 2

// Enter Array size = 3
// 1 2 3
// No element appears more than once.