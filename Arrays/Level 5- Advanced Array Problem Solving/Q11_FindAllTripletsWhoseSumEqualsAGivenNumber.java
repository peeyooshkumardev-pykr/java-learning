// Q11 — Find All Triplets Whose Sum Equals a Given Number

// Take an array and a target value. Find all unique triplets whose sum equals the target.

import java.util.Scanner;

public class Q11_FindAllTripletsWhoseSumEqualsAGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size = ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid Array Size!");
            sc.close();
            return;
        }

        System.out.println("Enter elements:");

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Target Number = ");
        int target = sc.nextInt();

        boolean found = false;

        System.out.println();
        System.out.println("Triplets:");

        for (int i = 0; i < arr.length - 2; i++) {

            for (int j = i + 1; j < arr.length - 1; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    int sum = arr[i] + arr[j] + arr[k];

                    if (sum == target) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No triplet found!");
        }

        sc.close();
    }
}
// Output 
// Enter the Array Size = 6
// Enter elements:
// 1 2 3 4 5 6
// Target Number = 9

// Triplets:
// 1 2 6
// 1 3 5
// 2 3 4