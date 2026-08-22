/*Q05 — Method to Check Divisibility
Create a method named isDivisible() that accepts two integers and returns whether 
the first number is divisible by the second number.*/

import java.util.Scanner;

public class Q05_MethodToCheckDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number = ");
        int num = sc.nextInt();

        System.out.print("Enter divisor = ");
        int div = sc.nextInt();
        
        if(div==0){
            System.out.println("Invalid Divisor!");
            sc.close();
            return;
        }
        if(isDivisible(num, div)){
            System.out.println(num+" is divisible by "+div);
        }else{
            System.out.println(num+" is not divisible by "+div);
        }

        sc.close();
    }

    static boolean isDivisible(int num,int div){
        return num % div == 0;
    }

}
// OUTPUT
// Enter number = 33
// Enter divisor = 11
// 33 is divisible by 11

// Enter number = 56
// Enter divisor = 13
// 56 is not divisible by 13