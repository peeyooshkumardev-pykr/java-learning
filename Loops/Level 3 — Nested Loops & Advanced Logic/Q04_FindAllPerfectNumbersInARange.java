// Q04 — Find All Perfect Numbers in a Range
// Take two integers from the user and print all perfect numbers between them.

import java.util.Scanner;

public class Q04_FindAllPerfectNumbersInARange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st integer = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd integer = ");
        int num2 = sc.nextInt();

        System.out.println("All Perfect numbers between "+num1+" & "+num2);
        for(int i = num1; i<=num2; i++){
            int sum = 0;
            for(int j = 1; j<i; j++){
                if(i % j == 0){
                    sum = sum + j;
                }
            }
            if(sum==i){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
// OUTPUT
// Enter the 1st integer = 1
// Enter the 2nd integer = 10000
// All perfect numbers between 1 & 10000
// 6 28 496 8128 