// Q19 — Find the First and Last Occurrence of an Element
// Take an array and an element from the user. Find the index of its 
// first occurrence and last occurrence.

import java.util.Scanner;

public class Q19_FindTheFirstAndLastOccurrenceOfAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size = ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element = ");
        int num = sc.nextInt();

        boolean isFound = false;
        for(int i = 0; i<arr.length; i++){
            if(num == arr[i]){
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Not found!");
            sc.close();
            return;
        }

        for(int i = 0; i<arr.length; i++){
            if(num == arr[i]){
                System.out.println("First Occurrence = "+i);
                break;
            }
        }

        int last = 0;
        for(int i = 0; i<arr.length; i++){
            if(num == arr[i]){
                last = i;
            }
        }
        System.out.println("Last Occurrence = "+last);

        sc.close();
    }
}
// Output
// Enter size = 10
// 34 45 23 45 45 23 34 34 12 54 
// Enter the element = 45
// First Occurrence = 1
// Last Occurrence = 4

// Enter size = 3
// 22 11 44
// Enter the element = 33
// Not Found!
