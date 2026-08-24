// Q12 — Count Occurrence of a Given Element
// Take an array and an element from the user. Count how many times that element occurs.

import java.util.Scanner;

public class Q12_CountOccurrenceOfAGivenElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size = ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to find = ");
        int num = sc.nextInt();

        int countNum = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == num){
                countNum++;
            }
        }

        if(countNum!=0){
            System.out.println("Number of times the element occurs = "+countNum);
        }else{
            System.out.println("Element does not occur in the array.");
        }
        sc.close();
    }
}
// Output
// Enter size = 8
// 21 24 56 24 11 24 11 56     
// Enter the number to find = 24
// Number of times the element occurs = 3

// Enter size = 3
// 22 3 44
// Enter the number to find = 1
// Element does not occur in the array.