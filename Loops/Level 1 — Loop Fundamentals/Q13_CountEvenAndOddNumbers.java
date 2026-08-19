// Q13 — Count Even and Odd Numbers
// Take N numbers from the user and count how many are even and how many are odd.

import java.util.Scanner;

public class Q13_CountEvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        int countOdd = 0;
        int countEven = 0;

        for(int i = 1; i<=num; i++){
            System.out.print("Number " + i + " = ");
            int input = sc.nextInt();

            if(input%2!=0){
                countOdd++;
            }else{
                countEven++;
            }
        }
        System.out.println("Number of odds = "+countOdd);
        System.out.println("Number of evens = "+countEven);

        sc.close();
    }
}
// OUTPUT
// Enter the number = 5
// Number 1 = 12
// Number 2 = 13
// Number 3 = 17
// Number 4 = 10
// Number 5 = 2
// Number of odds = 2
// Number of odds = 3