// Q15 — Find the Smallest Number
// Take N numbers from the user and find the smallest number using a loop.

import java.util.Scanner;

public class Q15_FindTheSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        int smallest = Integer.MAX_VALUE;
        for(int i = 1; i<=num; i++){
            System.out.print("Number "+i+" = ");
            int input = sc.nextInt();

            if(input<smallest){
                smallest = input;
            }
        }
        System.out.println("Smallest number in the loop = "+smallest);
        sc.close();
    }
}
// OUTPUT
// Enter the number = 4
// Number 1 = 22
// Number 2 = -22
// Number 3 = 10
// Number 4 = -10
// Smallest number in the loop = -22