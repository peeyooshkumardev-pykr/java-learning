// Q11 — Find All Pairs Whose Sum Equals a Given Number
// Take an array and a target number. Print all pairs whose sum equals the target.

import java.util.Scanner;

public class Q11_FindAllPairsWhoseSumEqualsAGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Array size = ");
        int size = sc.nextInt();

        if(size<=1){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int  arr[] = new int[size];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target = ");
        int target = sc.nextInt();

        for(int i = 0; i<arr.length; i++){

            for(int j = i + 1; j<arr.length; j++){
                int sum = arr[i] + arr[j];
                if(sum==target){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        sc.close();
    }
}
// Output
// Enter Array size = 6
// 10 20 30 40 50 60
// Enter target = 70
// 10 60
// 20 50
// 30 40