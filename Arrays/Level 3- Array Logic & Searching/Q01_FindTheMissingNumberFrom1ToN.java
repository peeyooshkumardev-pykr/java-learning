// Q01 — Find the Missing Number from 1 to N
// Take an array containing numbers from 1 to N, with one number missing. Find the missing number.

import java.util.Scanner;

public class Q01_FindTheMissingNumberFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N = ");
        int n = sc.nextInt();

        if(n <= 1){
            System.out.println("Invalid input!");
            sc.close();
            return;
        }

        int arr[] = new int[n - 1];

        System.out.println("Enter Array Elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for(int i = 0; i < arr.length; i++){
            actualSum = actualSum + arr[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number = " + missingNumber);

        sc.close();
    }
}