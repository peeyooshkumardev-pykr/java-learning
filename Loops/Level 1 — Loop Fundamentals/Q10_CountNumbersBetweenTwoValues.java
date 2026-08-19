// Q10 — Count Numbers Between Two Values

// Take two integers from the user and count how many integers exist between them, 
// including both endpoints.

import java.util.Scanner;

public class Q10_CountNumbersBetweenTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st integer = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd integer = ");
        int num2 = sc.nextInt();

        if(num1>num2){
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

        int count = 0;
        for(int i = num1; i<=num2; i++){
            count++;
        }
        System.out.println("Number of integers between "+num1+" and "+num2+" = "+count);
        sc.close();
    }
}
//OUTPUT
// Enter the 1st integer = -20
// Enter the 2nd integer = 20
// Number of integers between -20 and 20 = 41

// Enter the 1st integer = 20
// Enter the 2nd integer = 10
// Number of integers between 10 and 20 = 11