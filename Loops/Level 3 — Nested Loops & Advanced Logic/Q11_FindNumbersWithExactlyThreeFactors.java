// Q10 — Find Numbers With Exactly Three Factors
// Take an integer N and print all numbers from 1 to N that have exactly 3 factors.

import java.util.Scanner;

public class Q11_FindNumbersWithExactlyThreeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        System.out.println("All numbers from 1 to "+N+" that have exactly 3 factors");
        for(int i = 1; i<=N; i++){
            int count = 0;
            for(int j = 1; j<=N; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count==3){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 100
// All numbers from 1 to 100 that have exactly 3 factors
// 4 9 25 49 