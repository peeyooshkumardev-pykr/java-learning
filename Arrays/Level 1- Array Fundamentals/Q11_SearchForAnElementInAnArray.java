// Q11 — Search for an Element in an Array
// Take an array and a number from the user. Search whether that number exists in the array.

import java.util.Scanner;

public class Q11_SearchForAnElementInAnArray {
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

        boolean isFound = false;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == num){
                isFound = true;
                break;
            }
        }

        if(isFound){
            System.out.println("Number exists in array.");
        }else{
            System.out.println("Not Found!");
        }
        sc.close();
    }
}
// Output
// Enter size = 10
// 23 45 67 12 33 -78 -89 -12 44 -88
// Enter the number to find = -89
// Number exists in array.

// Enter size = 5
// 1 2 3 4 5
// Enter the number to find = 0
// Not Found!