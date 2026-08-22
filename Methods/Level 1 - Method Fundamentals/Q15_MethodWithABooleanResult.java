/*Q15 — Method With a Boolean Result
Create a method named isEligibleToVote() that accepts a person's age and returns true if the age is 
18 or above, otherwise returns false.

Take the age from the user using Scanner in main() and pass it to the method. */

import java.util.Scanner;

public class Q15_MethodWithABooleanResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Age = ");
        int age = sc.nextInt();
        
        System.out.println(isEligibleToVote(age));

        sc.close();
    }

    static boolean isEligibleToVote(int age){
        return age >= 18;
    }
}
// OUTPUT
// Enter the Age = 24
// true