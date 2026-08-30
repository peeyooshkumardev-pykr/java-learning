// Q17 — Find the Leaders in an Array
// An element is called a leader if it is greater than all elements to its right. 
// Print all leaders.

import java.util.Scanner;

public class Q17_FindTheLeadersInAnArray {
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

        System.out.println("Leaders:");

        for(int i = 0; i<arr.length; i++){
            boolean isLeader = true;

            for(int j = i+1; j<arr.length; j++){
                if(arr[i]<=arr[j]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
// Output 
// Enter Array size = 7
// 14 23 45 35 42 22 33
// Leaders:
// 45 42 
