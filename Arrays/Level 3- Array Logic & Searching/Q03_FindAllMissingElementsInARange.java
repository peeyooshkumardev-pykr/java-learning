// Q03 — Find All Missing Elements in a Range
// Take an array of integers and a range from 1 to N. Find all numbers from the range that are 
// missing from the array.

import java.util.Scanner;

public class Q03_FindAllMissingElementsInARange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N = ");
        int N = sc.nextInt();

        System.out.print("Enter Array size = ");
        int size = sc.nextInt();

        if(size<=0 || N <= 0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int  arr[] = new int[size];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Missing Elements:");
        for(int i = 1; i<=N; i++){
            boolean isMissing = true;

            for(int j = 0; j<arr.length; j++){
                if(arr[j]==i){
                    isMissing = false;
                    break;
                }
            }

            if(isMissing){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
// Output
// Enter N = 8
// Enter Array size = 4
// 1 4 6 7
// Missing Elements:
// 2 3 5 8 