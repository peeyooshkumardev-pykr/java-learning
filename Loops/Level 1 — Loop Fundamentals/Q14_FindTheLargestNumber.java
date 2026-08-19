// Q14 — Find the Largest Number
// Take N numbers from the user and find the largest number using a loop.

import java.util.Scanner;

public class Q14_FindTheLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        for(int i = 1; i<=num; i++){
            System.out.print("Number "+i+" = ");
            int input = sc.nextInt();

            if(input>largest){
                largest = input;
            }
        }
        System.out.println("Largest number in the loop = "+largest);
        sc.close();
    }
}
// OUTPUT
// Enter the number = 4
// Number 1 = 45
// Number 2 = 33
// Number 3 = -12
// Number 4 = 22
// Largest number in the loop = 45