// Q05 — Find All Armstrong Numbers in a Range
// Take two integers from the user and print all Armstrong numbers between them.

import java.util.Scanner;

public class Q05_FindAllArmstrongNumbersInARange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st integer = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd integer = ");
        int num2 = sc.nextInt();

        System.out.println("Armstrong numbers between "+num1+" & "+num2);
        for(int i = num1; i<=num2; i++){
            int num = i;
            int num3 = i;
            int count = 0;

            while(num!=0){
                num = num / 10;
                count++;
            }

            int sum = 0;
            while(num3!=0){
                int mul = 1;
                int countDigit = count;

                int digit = num3 % 10;

                while(countDigit!=0){
                    mul = mul * digit;
                    countDigit--;
                }

                sum = sum + mul;
                num3 = num3 / 10;
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
// Enter the 2nd integer = 1000
// Armstrong numbers between 1 & 1000
// 1 2 3 4 5 6 7 8 9 153 370 371 407 